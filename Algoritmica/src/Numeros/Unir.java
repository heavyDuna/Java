package Numeros;

public class Unir {

	public static void main(String[] args) {

		int[] a = { -30, 10, 13, 77 };
		int n = a.length;
		int[] b = { 0, 10, 20 };
		int m = b.length;

		int[] aux = unir(a, n, b, m);
		ver(aux);

	}

	public static int[] unir(int[] a, int n, int[] b, int m) {

		int[] aux = new int[n + m];
		int indice = 0;

		for (int i = 0; i < n + m; i++) {

			if (i < n) {

				aux[i] = a[i];

			} else {

				aux[i] = b[indice];
				indice++;

			}

		}
		return ordenaArray(aux);

	}

	public static int[] ordenaArray(int[] a) {

		int aux = 0;

		for (int i = 0; i < a.length - 2; i++) {

			for (int j = i + 1; j < a.length - 1; j++) {

				if (a[i] > a[j]) {

					aux = a[i];
					a[i] = a[j];
					a[j] = aux;

				}

			}

		}
		return a;

	}

	public static void ver(int[] a) {

		for (int j = 0; j < a.length; j++) {

			System.out.println(a[j]);

		}
	}

}
