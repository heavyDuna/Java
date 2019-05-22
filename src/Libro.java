
public class Libro extends Publicacion implements Editable {

	private Persona autor;
	private int capitulos;
	private Persona ilustrador;

	public Libro() {

	}

	public Libro(int codigo, String titulo, Fecha fechaPublicacion, Persona autor, int capitulos, Persona ilustrador) {

		super(codigo, titulo, fechaPublicacion);
		this.autor = autor;
		this.capitulos = capitulos;
		this.ilustrador = ilustrador;

	}

	public Libro(Persona autor, int capitulos, Persona ilustrador) {

		this.autor = autor;
		this.capitulos = capitulos;
		this.ilustrador = ilustrador;

	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public Persona getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(Persona ilustrador) {
		this.ilustrador = ilustrador;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", capitulos=" + capitulos + ", ilustrador=" + ilustrador + ", getCodigo()="
				+ getCodigo() + ", getTitulo()=" + getTitulo() + ", getFechaPublicacion()=" + getFechaPublicacion()
				+ "]";
	}

	@Override
	public Lista personasImplicadas() {
		
		
		return null;
	}

	@Override
	public double coste(int presupuesto) throws DemasiadoCaro {

		double total = 0;

		total = total + autor.getCoste() + ilustrador.getCoste();

		return total;
	}

	@Override
	public void publicar(Fecha fechaDePublicacion) {

	}

	@Override
	public int getCoste() {
		// TODO Auto-generated method stub
		return 0;
	}

}
