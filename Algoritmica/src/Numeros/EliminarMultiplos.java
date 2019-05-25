package Numeros;

public class EliminarMultiplos {

	public static void main(String[] args) {

		int[] a = { 2, 3, 8, 6, 9, 1, 8, 9 };
		int n = a.length;
		int numero = 3;

		System.out.println(eliminaMultiplos(a, n, numero));

	}

	public static int eliminaMultiplos(int[] a, int n, int numero) {

		for (int i = 0; i < n; i++) {

			if (a[i] % numero == 0) {

				int j = i;

				while (j < n - 1) {

					a[j] = a[j + 1];

					j++;
					n--;
				}

			}

		}

		return n;

	}

}
