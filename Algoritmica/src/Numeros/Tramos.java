package Numeros;

public class Tramos {

	public static void main(String[] args) {

		int[] a = { 0, 4, 7, 3, 5, 1, 10, 10, 20, 5 };
		int n = a.length;

		System.out.println(tramos(a, n));
		// ver(aux);

	}

	public static int tramos(int[] a, int n) {

		int ascendente = 0;
		int descendente = 0;
		int cambios = 0;

		for (int i = 1; i < n - 1; i++) {

			if (a[i + 1] > a[i]) {

				ascendente++;

			}

			if (a[i + 1] < a[i]) {
				descendente++;

			}
		}

		if (ascendente == n - 1) {

			cambios = 0;

		} else if (descendente == n - 1) {

			cambios = -1;
		} else {

			for (int j = 1; j < n - 1; j++) {

				if (a[j + 1] > a[j] && a[j - 1] > a[j]) {
					cambios++;
				}
				if (a[j + 1] < a[j] && a[j - 1] > a[j]) {
					cambios++;
				}
			}

		}

		return cambios;

	}

	public static void ver(int[] resp) {

		for (int j = 0; j < resp.length; j++) {

			System.out.println(resp[j]);

		}
	}

}
