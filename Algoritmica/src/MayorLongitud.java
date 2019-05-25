import java.util.Arrays;

public class MayorLongitud {

	public static void main(String[] args) {

		String texto = "la television rota television es una television";

		System.out.println(mayorLongitudPalabra(texto));

	}

	public static int mayorLongitudPalabra(String texto) {

		String[] letras = texto.split(" ");

		int longitud = 0;
		int mayorLongitud = 0;

		String palabra = " ";

		for (int i = 0; i < letras.length; i++) {

			longitud = letras[i].length();

			if (longitud > mayorLongitud) {

				mayorLongitud = longitud;
				palabra = letras[i];

			}

		}

		int j = 0;
		int cont = 0;
		while (j < letras.length) {

			if (palabra.equals(letras[j])) {

				cont++;
			}

			j++;
		}

		System.out.println("Palabra: " + palabra);
		System.out.println("Numero veces repetida: " + cont);
		return mayorLongitud;

	}

	public static void ver(String[] letras) {

		for (int j = 0; j < letras.length; j++) {

			System.out.println(letras[j]);

		}
	}

}
