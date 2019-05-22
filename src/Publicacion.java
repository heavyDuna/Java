
public class Publicacion {

	private int codigo;
	private String titulo;
	private Fecha fechaPublicacion;

	public Publicacion(int codigo, String titulo, Fecha fechaPublicacion) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public Publicacion() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fecha getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Fecha fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

}
