
public class OrdenadPalabras {

	public static void main(String[] args) {

		String a = "en un lugar de la mancha de cuyo nombre ";

		System.out.println(ordenaPalabras(a));

	}

	public static String ordenaPalabras(String a) {

		String[] texto = a.split(" ");
		char[] letras;
		String resp = "";

		ver(texto);

		for (int i = 0; i < texto.length; i++) {

			letras = texto[i].toCharArray();
			System.out.println(letras);

			// ordenar(letras);
			invertir(letras);

			texto[i] = "";

			for (int j = 0; j < letras.length; j++) {

				texto[i] = texto[i] + letras[j];

			}

			// System.out.println(texto[i]);

			resp = resp + texto[i] + " ";

		}
		return resp;

	}

	public static void ordenar(char[] letras) {

		char aux;

		for (int i = 0; i <= letras.length - 2; i++) {

			for (int j = i + 1; j <= letras.length - 1; j++) {

				if (letras[i] > letras[j]) {

					aux = letras[i];
					letras[i] = letras[j];
					letras[j] = aux;

				}
			}

		}

	}

	public static void invertir(char[] letras) {

		char aux;

		int izq = 0;
		int der = letras.length - 1;

		while (izq < der) {

			aux = letras[izq];
			letras[izq] = letras[der];
			letras[der] = aux;

			izq++;
			der--;

		}

	}

	public static void ver(String[] letras) {

		for (int j = 0; j < letras.length; j++) {

			System.out.println(letras[j]);

		}
	}

}
