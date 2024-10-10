package aula8_ed_no;

import aula8_ed_no.structure.Fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
        fila.enfileirar("1");
        fila.enfileirar("2");
        fila.enfileirar("3");
        System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");

        System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
        System.out.println("Início: "+ fila.inicio());

        Object info = fila.desenfileirar();
        while (info != null) {
            System.out.println(info);
            info = fila.desenfileirar();
        }

        fila.enfileirar("4");
        fila.enfileirar("5");
        fila.enfileirar("6");
        System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
        System.out.println("Início: " + fila.inicio());

        info = fila.desenfileirar();
        while (info != null) {
            System.out.println(info);
            info = fila.desenfileirar();
        }
        System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
        System.out.println("Início: " + fila.inicio());
    }
}
