
public class PalabraEscondida {

	public static void main(String[] args) {

		String a = "aunque creais que no dentro queso de yunque y maqueta esta que";
		String palabra = "que";

		System.out.println(palabraEscondida(a, palabra));

	}

	public static int palabraEscondida(String a, String palabra) {

		String[] frase = a.split(" ");

		int pos = 0;
		boolean esIgual = false;
		int repe = 0;

		for (int j = 0; j < frase.length; j++) {

			pos = frase[j].indexOf(palabra);
			
			while (pos != -1) {

				if (frase[j].equals(palabra)) {

					esIgual = true;

				} else {

					repe++;
				}

				pos = frase[j].indexOf(palabra, pos + 1);

			}

		}

		return repe;

	}

	public static void ver(String[] letras) {

		for (int j = 0; j < letras.length; j++) {

			System.out.println(letras[j]);

		}
	}

}
