package aula9_ed_lista;
import aula9_ed_lista.structure.Lista;

public class Main{
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.estaVazia();
        lista.adicionar("a");
        lista.adicionar("b");
        lista.adicionar("c");
        lista.adicionar("d");
        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i));
        }
        lista.estaVazia();
        lista.remove(4);
        lista.remove(2);
        lista.getTamanho();
        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i));
        }
    }
}