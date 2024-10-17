package aula9_ed_lista.structure;

public class Lista {
    private int tamanho;
    private No inicio;
    private No fim;

    public int getTamanho(){
        return tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void adicionar(Object info){
        No no = new No(info);
        if (estaVazia()) {
            inicio = no;
        } else {
            fim.prox = no;
        }
        fim = no;
        tamanho++;
    }
    public Object get(int index) throws Exception {
        if (index >= tamanho || index < 0) {
            throw new Exception("Índice inválido");
        }
        No noAtual = inicio;
        for (int i = 0; i < index; i++){
            noAtual = noAtual.prox;
        }
        return noAtual.info;
    }
    public boolean remove(int index) throws Exception{
        if (index >= tamanho || index < 0) {
            return false;
        }
        No noAtual = inicio;
        No noAnterior = null;
        for (int i = 0; i < index; i++) {
            noAnterior = noAtual;
            noAtual = noAtual.prox;
        }
        noAnterior.prox = noAtual.prox;
        tamanho--;
        return true;
    }
}