package aula12_ed_mergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] valores = {5,3,2,1,6,7,8};
        mergeSort(valores);
        System.out.println(Arrays.toString(valores));
    }

    private static void mergeSort(int[] valores) {
        int length = valores.length;
        //Caso Base
        if(length == 1){
            return;
        }

        int[] left = new int[length / 2];
        int[] right = new int[length - length / 2];

        System.arraycopy(valores, 0, left, 0, left.length);
        System.arraycopy(valores, length / 2, right, 0, right.length);

        //Chamada Recursiva
        mergeSort(left);
        mergeSort(right);
        merge(left, right, valores);
    }

    private static void merge(int[] left, int[] right, int[] valores) {
        int iL = 0, iR = 0, iV = 0;

        //Laço
        while(iL < left.length && iR < right.length) {
            if (left[iL] < right[iR]) {
                valores[iV++] = left[iL++];
            }else{
                valores[iV++] = right[iR++];
            }
        }
        while(iL < left.length) {
            valores[iV++] = left[iL++];
        }
        while(iR < right.length) {
            valores[iV++] = right[iR++];
        }
    }

    private static void imprimeValores(int[] valores, int[] left, int[] right) {
        System.out.println(Arrays.toString(valores));
    }
}
