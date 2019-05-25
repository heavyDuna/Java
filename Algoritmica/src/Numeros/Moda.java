package Numeros;

import java.util.Arrays;

public class Moda {

	public static void main(String[] args) {

		int[] a = { 7, 3, 3, 1, 10, 10, 10, 20, 5, 5 };
		int n = a.length;

		System.out.println(obtenerModa(a, n));

	}

	public static int obtenerModa(int[] a, int n) {

		ordenarArray(a, n);

		System.out.println(Arrays.toString(a));

		int[] moda = new int[n];
		int indiModa = 0;
		int repe = 1;
		int repeTotal = 0;

		for (int i = 0; i <= n - 2; i++) {

			if (a[i] == a[i + 1]) {

				repe++;

			} else {

				if (repe > repeTotal) {

					repeTotal = repe;
					repe = 1;
					moda[indiModa] = a[i];
					indiModa++;

				} else if (repe == repeTotal) {

					moda[indiModa] = a[i];
					indiModa++;
					repe = 1;

				} else {

					repe = 1;
				}

			}

		}

		System.out.println(Arrays.toString(moda));

		return n;

	}

	public static void ordenarArray(int[] a, int n) {

		int aux = 0;
		for (int i = 0; i <= n - 2; i++) {

			for (int j = i + 1; j <= n - 1; j++) {

				if (a[i] > a[j]) {

					aux = a[i];
					a[i] = a[j];
					a[j] = aux;

				}
			}

		}
	}
}
