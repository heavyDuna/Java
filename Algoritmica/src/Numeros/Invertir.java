package Numeros;

import java.util.Arrays;

public class Invertir {

	public static void main(String[] args) {

		int[] a = { 2, 3, 8, 6, 9, 1, 8, 9 };
		int n = a.length;

		invertirArray(a, n);
		ver(a);

	}

	public static void invertirArray(int[] a, int n) {

		int izq = 0;
		int der = n - 1;
		int aux = 0;

		while (izq < der) {

			aux = a[izq];
			a[izq] = a[der];
			a[der] = aux;

			izq++;
			der--;

		}

		//System.out.println(Arrays.toString(a));

	}

	public static void ver(int[] a) {

		for (int j = 0; j < a.length; j++) {

			System.out.println(a[j]);

		}
	}

}
