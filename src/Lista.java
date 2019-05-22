
public class Lista {

	private Nodo com;

	public Lista() {

		this.com = null;

	}

	public Nodo getCom() {

		return this.com;
	}

	public void addPersona(Persona p) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(p);
		nuevo.setSig(this.com);
		this.com = nuevo;

	}

	public double calculaCoste() {

		double total = 0;
		Nodo p = this.com;

		while (p.getSig() != null) {

			total = total + p.getInfo().getCoste();
			p = p.getSig();

		}
		return total;
	}

	/*
	 * 
	 * public void addFinal(int num) {
	 * 
	 * Nodo nuevo = new Nodo(); nuevo.setInfo(num); Nodo p; p = this.com;
	 * 
	 * while (p.getSig() != null) {
	 * 
	 * p = p.getSig(); }
	 * 
	 * nuevo.setSig(null); p.setSig(nuevo); }
	 * 
	 * public void InsertarCeroDespuesDeSuma(Lista lista) {
	 * 
	 * Nodo p; p = this.com;
	 * 
	 * int suma = 0;
	 * 
	 * while (p != null) {
	 * 
	 * suma = suma + p.getInfo();
	 * 
	 * p = p.getSig();
	 * 
	 * }
	 * 
	 * System.out.println("La suma es: " + suma);
	 * 
	 * Nodo n; n = this.getCom();
	 * 
	 * while (n != null) {
	 * 
	 * if (n.getInfo() == suma) {
	 * 
	 * Nodo cero = new Nodo(); cero.setInfo(0);
	 * 
	 * cero.setSig(n.getSig()); n.setSig(cero);
	 * 
	 * } n = n.getSig(); }
	 * 
	 * System.out.println("Nueva lista: " + lista);
	 * 
	 * }
	 */

	public String toString() {

		String l = "Lista";
		Nodo p = this.com;

		while (p != null) {

			l = l + p;
			p = p.getSig();
		}

		return l;

	}

}
