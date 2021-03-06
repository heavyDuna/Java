package EntradaSalida;

import java.io.Serializable;

public class Empleado implements Comparable<Empleado>, Serializable { // no tiene object en el compareTo, entonces
																		// generico

	private static final long serialVersionUID = 3866202613902226007L;

	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	private int numeroEmpleado;

	public Empleado() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.salario = 600;
		this.numeroEmpleado = 0;
	}

	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = 0;
		this.salario = 600;
		this.numeroEmpleado = 0;
	}

	public Empleado(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = 600;
		this.numeroEmpleado = 0;
	}

	public Empleado(String nombre, String apellido, int edad, double salario, int numeroEmpleado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public boolean plus(double sueldoPlus) {

		boolean aumento = false;
		if (edad > 40) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}

	public boolean equals(Empleado a) {

		if (a.getNombre().equals(nombre) && a.getApellido().equals(apellido)) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Empleado a) {

		int estado = -1;
		if (this.edad == a.getEdad()) {
			// Los objetos son iguales
			estado = 0;
		} else if (this.edad > a.getEdad()) {
			// El objeto 1 es mayor que la pasada por parametro
			estado = 1;
		}
		return estado;

	}

	public String toString() {
		String mensaje = "El empleado se llama " + nombre + " " + apellido + " con " + edad + " años "
				+ "y un salario de " + salario;
		return mensaje;
	}

}
