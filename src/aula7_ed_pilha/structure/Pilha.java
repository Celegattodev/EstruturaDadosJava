package aula7_ed_pilha.structure;

public class Pilha {
    No topo;
    int tamanho;
    int qtdObj = 5;

    public boolean estaVazia(){
        return tamanho == 0;
//        if (tamanho == 0){
//            return (true);
//        } return (false);
    }
    public Object topo(){
        if (estaVazia()) {
            return null;
        } return topo.info;
    }
    public void empilhar(Object info){
        No no = new No(info);
        if (!estaVazia()) {
            no.proximo = topo;
        }
        topo = no;
        tamanho++;
    }
    public Object desempilhar(){
        if (estaVazia()) {
            return null;
        } else {
            Object temp = topo.info;
            topo = topo.proximo;
            tamanho--;
            return temp;
        }
    }
}