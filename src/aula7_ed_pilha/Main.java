package aula7_ed_pilha;

import aula7_ed_pilha.structure.Pilha;

public class Main {

    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        // Operador Ternário
        System.out.println(p1.estaVazia() ? "Vazia" : "Não está vazia");
        p1.empilhar("G1");
        System.out.println(p1.estaVazia() ? "Vazia" : "Não está vazia");
        p1.empilhar("BB");
        System.out.println("Topo: " + p1.topo());
        System.out.println("Desempilhando: " + p1.desempilhar());
        System.out.println("Topo: " + p1.topo());
        System.out.println("Desempilhando: " + p1.desempilhar());
        System.out.println("Topo: " + p1.topo());
        System.out.println("Desempilhando: " + p1.desempilhar());
    }
}
