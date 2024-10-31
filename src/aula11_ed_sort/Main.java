package aula11_ed_sort;

public class Main {
    public static void main(String[] args) {
        int[] valores = {3, 4, 6, 9, 11, 25, 1, 9, 42};
        
        bubbleSort(valores);
    }

    private static void bubbleSort(int[] valores) {
        int passagens = 0;
        boolean trocou;

        for (int j = 0; j < valores.length - 1; j++) { // Alterado para j = 0
            passagens++;
            trocou = false;

            for (int i = 0; i < valores.length - 1 - j; i++) { // Alterado para i = 0
                if (valores[i + 1] < valores[i]) {
                    trocou = true;
                    int aux = valores[i + 1];
                    valores[i + 1] = valores[i];
                    valores[i] = aux;
                }
            }

            if (!trocou) {
                System.out.println(passagens);
                return;
            }
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
