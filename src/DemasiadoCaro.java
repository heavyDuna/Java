public class DemasiadoCaro extends Exception {
	
	public double importe;
	
	public DemasiadoCaro() {
		
	}
	
	public DemasiadoCaro(String msj_error, double importe) {
		
		super(msj_error);	
		this.importe=importe;									//llamos al constructor de clase padre exception
	}

	@Override
	public String toString() {
		return "DemasiadoCaro [importe=" + importe + "]";
	}

	
}
