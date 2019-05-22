import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Coleccion implements Editable {

	private String nombre;
	private TreeSet articulos;
	private int costePorColeccion;
	private Fecha fechaSalida;

	public Coleccion(String nombre, int costePorColeccion, Fecha fechaSalida) {
		this.nombre = nombre;
		this.costePorColeccion = 0;
		this.fechaSalida = new Fecha();

	}

	public Coleccion(String nombre, Comparator c) {

		this.nombre = nombre;
		this.articulos = new TreeSet(c);

	}

	public int getCostePorColeccion() {
		return costePorColeccion;
	}

	public void setCostePorColeccion(int costePorColeccion) {
		this.costePorColeccion = costePorColeccion;
	}

	public Fecha getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Fecha fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public void add(Editable e) {
		this.articulos.add(e);
	}

	@Override
	public Lista personasImplicadas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double coste(int presupuesto) throws DemasiadoCaro {

		double suma = 0;

		Editable e;
		Iterator it = this.articulos.iterator();

		System.out.println(this.articulos);
		while (it.hasNext()) {
			e = (Editable) it.next();

			suma = suma + e.coste(presupuesto);
		}

		if (suma > presupuesto) {

			double sobrecoste = suma - presupuesto;

			throw new DemasiadoCaro("Muy caro se pasa: ", sobrecoste);
		}

		return suma;

	}

	@Override
	public void publicar(Fecha fechaDePublicacion) {

		this.fechaSalida = fechaDePublicacion;

		Editable e;
		Iterator it = this.articulos.iterator();

		while (it.hasNext()) {

			e = (Editable) it.next();
			e.publicar(fechaDePublicacion);

		}

	}

	@Override
	public String toString() {

		return "Coleccion [nombre=" + nombre + ", articulos=" + showTreeSet(articulos) + ", costePorColeccion="
				+ costePorColeccion + ", fechaSalida=" + fechaSalida + "]";

	}

	public String showTreeSet(TreeSet articulos) {

		String s = "";
		Editable e;

		Iterator it = this.articulos.iterator();
		while (it.hasNext()) {

			e = (Editable) it.next();
			s = s + e.toString();

		}
		return s;

	}
	

	@Override
	public Fecha getFechaPublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCodigo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCoste() {
		// TODO Auto-generated method stub
		return 0;
	}

}
