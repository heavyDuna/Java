
public class NoEstan {

	public static void main(String[] args) {

		String abec = "abcdefghijklmnopqrstuvwxyzn";
		String texto = "estoesunexamen";

		System.out.println(noEstanEnTexto(abec, texto));

	}

	public static String noEstanEnTexto(String a, String t) {

		String noEstan = "";

		String[] abec = a.split("");
		String[] texto = t.split("");

		for (int i = 0; i < abec.length; i++) {

			boolean encontrado = false;

			int j = 0;

			while (j < texto.length) {

				if (abec[i].equals(texto[j])) {

					encontrado = true;

				}

				j++;
			}

			if (encontrado == false) {

				noEstan = noEstan + abec[i];

			}

		}

		return noEstan;
	}

	public static void ver(String[] letras) {

		for (int j = 0; j < letras.length; j++) {

			System.out.println(letras[j]);

		}
	}

}
