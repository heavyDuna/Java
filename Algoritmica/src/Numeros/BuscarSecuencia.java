package Numeros;

public class BuscarSecuencia {

	public static void main(String[] args) {

		int[] a = { 2, 6, 8, 6, 9, 1, 8, 6, 9, 1 };
		int n = a.length;
		int[] b = { 6, 9, 1 };
		int m = b.length;

		System.out.println(buscaSecuencia(a, n, b, m));

	}

	public static int buscaSecuencia(int[] a, int n, int[] b, int m) {

		int cont = 0;

		for (int i = 0; i < n - m; i++) {

			boolean encontrado = true;

			if (a[i] == b[0]) {

				encontrado = true;

				for (int j = 1; j < m && encontrado; j++)

					encontrado = encontrado && (a[i + j] == b[j]);

				if (encontrado)

					cont++;

			}

		}

		return cont;

	}

}
