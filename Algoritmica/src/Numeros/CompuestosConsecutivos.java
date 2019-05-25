package Numeros;

import java.util.Arrays;

public class CompuestosConsecutivos {

	public static void main(String[] args) {

		int[] aux = compuestosConsecutivos(5);
		ver(aux);

	}

	public static int[] compuestosConsecutivos(int num) {

		int[] resp = new int[num];

		int actual = 2;
		int indiceResp = 0;

		while (indiceResp < num) {

			if (esPrimo(actual)) {

				actual++;
				indiceResp = 0;

			} else {

				resp[indiceResp] = actual;
				actual++;
				indiceResp++;

			}
		}
		Arrays.toString(resp);
		return resp;

	}

	public static boolean esPrimo(int num) {

		int cont = 0;
		int div = 2;
		boolean resp;

		while (div < num) {

			if (num % div == 0) {

				cont++;
			}

			div++;
		}

		if (cont == 0) {

			resp = true;
		} else {

			resp = false;
		}

		return resp;

	}

	public static void ver(int[] resp) {

		for (int j = 0; j < resp.length; j++) {

			System.out.println(resp[j]);

		}
	}

}
