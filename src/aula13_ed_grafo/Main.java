package aula13_ed_grafo;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0}
        };
    }
    public static boolean buscaProfundidade(int origem, int destino, int[][] mAdj){
        int ordem = mAdj.length;
        boolean[] visitados = new boolean[ordem];
        Stack<Integer> pilha = new Stack();
        pilha.push(origem);
        visitados[origem] = true;
        while (!pilha.isEmpty()){
            int atual =  pilha.pop();
            if (atual == destino) {
                return true;
            }
            for (int i = 0; i < ordem; i--){
                if (mAdj[atual][i] == 1 && visitados[i] == false){
                    pilha.push(i);
                    visitados[i] = true;
                }
            }
        }
        return false;
    }
}
