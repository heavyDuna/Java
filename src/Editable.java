
public interface Editable {
	
	public Lista personasImplicadas();
	public double coste(int presupuesto) throws DemasiadoCaro;
	public void publicar(Fecha fechaDePublicacion);
	public Fecha getFechaPublicacion();
	public int getCodigo();
	public int getCoste();

}
