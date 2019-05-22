public class Nodo {

	private Nodo sig;
	private Persona info;

	public Nodo() {

		this.sig = null;
	}

	public Nodo(Persona info) {

		this.info = info;
		this.sig = null;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	public Persona getInfo() {
		return info;
	}

	public void setInfo(Persona info) {
		this.info = info;
	}

	public String toString() {

		String s = "Nodo ";
		s = s + this.info + " " + "---> ";

		return s;
	}

}
