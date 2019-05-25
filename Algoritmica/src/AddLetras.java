
public class AddLetras {

	public static void main(String[] args) {

		String a = "en un lugar de la mancha";

		System.out.println(addLetras(a));

	}

	public static String addLetras(String a) {

		String[] texto = a.split(" ");
		String palabra = "";
		String mod = "";

		for (int i = 0; i < texto.length; i++) {

			int longitud = 0;
			longitud = texto[i].length();
			palabra = texto[i];

			int j = 0;
			while (j < longitud) {

				palabra = palabra + palabra.charAt(longitud - 1);

				j++;
			}

			mod = mod + palabra + " ";

		}

		return mod;

	}

	public static void ver(String[] letras) {

		for (int j = 0; j < letras.length; j++) {

			System.out.println(letras[j]);

		}
	}

}
