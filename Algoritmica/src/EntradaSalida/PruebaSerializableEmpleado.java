package EntradaSalida;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PruebaSerializableEmpleado {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Pepe", "Perez", 23, 800, 20);
		Empleado empleado2 = new Empleado("Paco", "Rodriguez", 35, 1000, 15);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleados.ddr"))) {

			// Escribimos en un fichero

			oos.writeObject(empleado1);
			oos.writeObject(empleado2);
			oos.close();

		} catch (IOException e) {
		}

		System.out.println("Leo");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.ddr"))) {
			// Cuando no haya mas objetos saltara la excepcion EOFException

			while (true) {

				Empleado aux = (Empleado) ois.readObject();
				System.out.println(aux.getNombre());
				System.out.println(aux.getApellido());
				System.out.println(aux.getEdad());
				System.out.println(aux.getSalario());
				System.out.println("");
			}
		} catch (ClassNotFoundException e) {
		} catch (EOFException e) {
		} catch (IOException e) {
		}

	}

}
