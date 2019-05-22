public class Fecha implements Comparable {

	private int dia;
	private int mes;

	public Fecha(int dia, int mes) {

		this.dia = dia;
		this.mes = mes;

	}

	public Fecha() {

		this.dia = 0;
		this.mes = 0;

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes;
	}

	public int compareTo(Object o) {
		Fecha t = (Fecha) o;

		if (this.dia > t.dia) {
			return 1;
		} else {

			if (this.dia < t.dia) {
				return -1;
			} else {

				if (this.mes > t.mes) {
					return 1;

				} else {

					if (this.mes < t.mes) {
						return -1;

					} else {

						return 0;
					}

				}
			}
		}
	}

}
