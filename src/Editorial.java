import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Editorial {

	private SortedMap edicion;

	public Editorial() {

		this.edicion = new TreeMap();

	}

	public Editorial(Comparator c) {

		this.edicion = new TreeMap(c);

	}

	public boolean add(Coleccion c) {

		boolean introducido = false;

		Fecha f = new Fecha();
		f = c.getFechaSalida();

		if (existeClave(f) == false) {

			introducido = true;
			this.edicion.put(f, c);

		}

		// System.out.println(introducido);
		return introducido;

	}

	public boolean existeClave(Fecha fec) {

		boolean existe = false;

		Set s = this.edicion.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			Fecha f;
			f = (Fecha) it.next();

			if (fec.equals(f)) {

				existe = true;
			}

		}

		return existe;

	}

	public double costeTotal() throws DemasiadoCaro {

		double suma = 0;
		Coleccion c;
		Collection col = this.edicion.values();
		Iterator it = col.iterator();

		while (it.hasNext()) {

			c = (Coleccion) it.next();
			suma = suma + c.coste(50);
		}

		if (suma > 50) {

			throw new DemasiadoCaro("Te has pasado, el importe es: ", suma); // no le paso mensaje porque lanza el del
																				// main, si se lo paso es para ver en
																				// que clase esta el error e identificar
																				// el mensaje de error en la clase
		}

		return suma;

	}

	@Override
	public String toString() {
		return "Editorial [edicion=" + edicion + "]";
	}

}
