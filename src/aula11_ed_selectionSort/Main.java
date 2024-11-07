package aula11_ed_selectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int valores[] = {5, 4, 2, 1, 9, 11, 7};
        selectionSort(valores);
        System.out.println(Arrays.toString(valores));
    }
    private static void selectionSort(int[] valores) {
        for (int j = 0; j < valores.length; j++) {
            int menor = Integer.MAX_VALUE;
            int posMenor = 0;
            for (int i = j; i < valores.length; i++) {
                if (valores[i] < menor) {
                    menor = valores[i];
                    posMenor = i;
                }
            }
            valores[posMenor] = valores[j];
            valores[j] = menor;
        }
    }
}