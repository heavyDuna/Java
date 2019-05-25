package Listas;
public class Nodo {

	private Nodo sig;
	private int info;

	public Nodo() {

		this.sig = null;
	}

	public Nodo(int info) {

		this.info = info;
		this.sig = null;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public String toString() {

		String s = "Nodo ";
		s = s+ this.info + " " + "-->";

		return s;
	}

}
