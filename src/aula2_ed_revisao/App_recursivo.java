package aula2_ed_revisao;
 
public class App_recursivo {
 
	public static void main(String[] args) {
		int produto;
		produto = ex4(8);
		System.out.println(produto);
	}
	private static int ex1 (int i, int j) {
//		recebe dois valores e retorna o produto entre eles
//		i + j, mas sem usar + ou /
		int produto = 0;
		for (int k =0; k < j; k++) {
			produto =+ i;
		}
		return produto;
	}
	public static int ex2(int i, int j) {
		if (i == 1) {
			return j;
		}
		return j + ex2(i -1, j);
	}
//	private static int ex3(int i) {
////		Dado um n inteiro, retorne seu fatorial
//		if (i == 2) {
//			return i;
//		}
//		return i * ex2(i - 1);
//	}
	private static int ex4(int i) {
//		Fibonacci
		if (i == 0 || i == 1) {
			return i;
		}
		return ex4(i -1) + ex4(i - 2);
	}
}
