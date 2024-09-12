package aula2_ed_revisao;

public class revisao {

	public static void main(String[] args) {
		ex4();
	}
	
	private static void ex6() {
		// Dado um vetor de números inteiros calcular a média entre eles. Depois imprimir os valores acima da média
		int[] vals = {1, 7, 9, 8, 6, 3};
		int tot = 0;
		double media = 0;
		for (int i = 0; i < vals.length; i++) {
			tot+= vals[i];
		}
		media = (tot / vals.length);
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] > media) {
				System.out.println(vals[i]+"\t");
			}
		}
	}

	private static void ex5() {
		// Triângulo de Pascoal
		int x = 5;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print(j+"\t");
			}System.out.print("\n");
		}
	}
	
	private static void ex4() {
		// Fibonacci
		int n1=1;
		int n2=1;
		int[] fib = new int[7];
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 0; i < 7; i++) {
			int soma = n1+n2;
			fib[i] = soma;
			System.out.println(soma+"\t");
			n1 = n2;
			n2 = soma;
		}
		for(int valor : fib) {
			System.out.print(valor+"\t");
		}
	}
	
	private static void ex3() {
		// Tabuada com for encadeado
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j +"\t");
			}System.out.print("\n");
		}
	}

	private static void ex2() {
		// Leia um número e imprima seu fatorial
		int valor = 10;
		int total = 1;
		while(valor > 1) {
			total = total * valor;
			valor--;
			System.out.println(total);
		}
	}

	private static void ex1() {
		// Imprima os números pares entre 1 e 10
		int i = 0;
		while (i <= 5) {
			i++;
			if (i % 2 == 0) {
				System.out.print(i+"\n");
			}
		}
	}
}
