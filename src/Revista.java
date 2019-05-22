
public class Revista extends Publicacion implements Editable {

	private int numero;
	private Lista colaboradores;

	public Revista() {

	}

	public Revista(int codigo, String titulo, Fecha fechaPublicacion, int numero, Lista colaboradores) {

		super(codigo, titulo, fechaPublicacion);

		this.numero = numero;
		this.colaboradores = colaboradores;
	}

	public void add(Persona p) {

		this.colaboradores.addPersona(p);
	}

	@Override
	public Lista personasImplicadas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double coste(int presupuesto) {

		return this.colaboradores.calculaCoste();

	}

	@Override
	public void publicar(Fecha fechaDePublicacion) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", colaboradores=" + colaboradores + ", getCodigo()=" + getCodigo()
				+ ", getTitulo()=" + getTitulo() + ", getFechaPublicacion()=" + getFechaPublicacion() + "]";
	}

	@Override
	public int getCoste() {
		// TODO Auto-generated method stub
		return 0;
	}

}
