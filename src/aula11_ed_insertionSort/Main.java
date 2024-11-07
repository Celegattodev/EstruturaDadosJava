package aula11_ed_insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int valores[] = {5, 4, 2, 1, 9, 11, 7};
        insertionSort(valores);
        System.out.println(Arrays.toString(valores));
    }
    private static void insertionSort(int[] valores) {
        int n = valores.length;
        for (int i = 1; i < n; ++i) {
            int key = valores[i];
            int j = i - 1;

            while (j >= 0 && valores[j] > key) {
                valores[j + 1] = valores[j];
                j = j - 1;
            }
            valores[j + 1] = key;
        }
    }
}