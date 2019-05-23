import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class MisMetodos extends Conexion {

	int op = 0;
	String texto;

	ArrayList datos = new ArrayList();
	Date fecha = new Date();
	SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String hActual = d.format(fecha);

	public void visualizarLineas() {

		System.out.println("Escoger linea");

		Statement stmt = null;
		ResultSet rset = null;
		Connection con = (Connection) getConexion();

		String sql = "SELECT IdLinea, Nombre " + "FROM lineas"; /* where IdVagon=" + idVagon; */

		try {
			stmt = (Statement) con.createStatement();
			rset = stmt.executeQuery(sql);

			System.out.println("Lineas:");

			while (rset.next()) {
				System.out.print(rset.getString("IdLinea"));
				System.out.print(("."));
				System.out.println(rset.getString("Nombre"));

			}

			rset.close();
			stmt.close();
			con.close();

			op = MisMetodos.leerEntero();
			datos.add(op);
			visualizarVagonesLineas(op);

		} catch (SQLException e) {

			System.out.println("No se han podido visualizar las lineas");
		}

	}

	public void visualizarVagonesLineas(int idLinea) {

		if (existeLinea(idLinea) == true) {

			Statement stmt = null;
			ResultSet rset = null;
			Connection con = (Connection) getConexion();

			String sql = "SELECT IdVagon, IdVagon, PlazasLibres " + "FROM vagonesenlinea where IdLinea=" + idLinea;

			try {
				stmt = (Statement) con.createStatement();
				rset = stmt.executeQuery(sql);

				while (rset.next()) {
					System.out.print(("Vagon nº-->"));
					System.out.print(rset.getString("IdVagon"));
					System.out.print((" Plazas Libres-->"));
					System.out.println(rset.getString("PlazasLibres"));

				}
				System.out.println("Seleccionar vagón para expedir billete:");

				rset.close();
				stmt.close();
				con.close();

				op = MisMetodos.leerEntero();
				datos.add(op);
				visualizarEstacionOrigen();

			} catch (SQLException e) {

				System.out.println("No se han podido visualizar los vagones");
			}

		} else {

			System.out.println("No existe esa linea");

		}

	}

	public void visualizarEstacionOrigen() {

		Statement stmt = null;
		ResultSet rset = null;
		Connection con = (Connection) getConexion();

		String sql = "SELECT IdEstacion, Nombre " + "FROM estaciones";

		try {
			stmt = (Statement) con.createStatement();
			rset = stmt.executeQuery(sql);

			System.out.println("Seleccionar estación de origen:");

			while (rset.next()) {
				System.out.print(rset.getString("IdEstacion"));
				System.out.print(("."));
				System.out.println(rset.getString("Nombre"));

			}

			rset.close();
			stmt.close();
			con.close();

			op = MisMetodos.leerEntero();
			visualizarEstacionDestino(op);

		} catch (SQLException e) {

			System.out.println("No se han podido visualizar las estaciones");
		}

	}

	public boolean visualizarEstacionDestino(int idEstacion) {

		Statement stmt = null;
		ResultSet rset = null;
		Connection con = (Connection) getConexion();

		String sql = "SELECT IdEstacion, Nombre " + "FROM estaciones";

		try {
			stmt = (Statement) con.createStatement();
			rset = stmt.executeQuery(sql);

			System.out.println("Seleccionar estación de destino:");

			while (rset.next()) {
				if (rset.getInt("IdEstacion") != idEstacion) {

					System.out.print(rset.getString("IdEstacion"));
					System.out.print(("."));
					System.out.println(rset.getString("Nombre"));

				}

			}

			rset.close();
			stmt.close();
			con.close();

			op = MisMetodos.leerEntero();
			getDatos();

		} catch (SQLException e) {

			System.out.println("No se han podido visualizar las estaciones");
		}

		return false;

	}

	public void getDatos() {

		System.out.println("Introduce tu nombre:");
		texto = MisMetodos.leerCadena();
		datos.add(texto);

		System.out.println("Metodo de pago:");
		System.out.println("1.Efectivo");
		System.out.println("2.Tarjeta");
		op = MisMetodos.leerEntero();
		if (op == 1) {

			datos.add("efectivo");

		} else {
			datos.add("tarjeta");
		}

		insertarBillete((int) datos.get(0), (int) datos.get(1), (String) datos.get(2), (String) datos.get(3), "activo",
				hActual);

	}

	public boolean existeLinea(int id) {

		boolean existe = false;

		Statement stmt = null;
		ResultSet rset = null;
		Connection con = (Connection) getConexion();

		String sql = "SELECT IdLinea " + "FROM vagonesenlinea";

		try {
			stmt = (Statement) con.createStatement();
			rset = stmt.executeQuery(sql);

			while (rset.next()) {
				if (rset.getInt("IdLinea") == id) {

					existe = true;

				}

			}

			rset.close();
			stmt.close();
			con.close();

		} catch (Exception e) {

		}
		return existe;

	}

	public void insertarBillete(int idLinea, int idVagon, String nombre, String pago, String estado, String fec) {
		boolean existe = true;

		Statement stmt = null;
		ResultSet rset = null;
		Connection con = (Connection) getConexion();

		String sql = "INSERT INTO billetes (IdLinea, IdVagon, NombreViajero, Pago, Estado, FechaExpedicion)"

				+ " VALUES ('idLinea', 'idVagon', 'nombre', 'pago', 'estado', 'fec')";

		try {

			stmt = (Statement) con.createStatement();
			stmt.executeUpdate(sql);

			rset.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("No se ha insertado");

		}

	}

	public static String leerCadena() {

		Scanner teclado = new Scanner(System.in);
		String c = teclado.next();

		return c;

	}

	public static int leerEntero() {

		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		return numero;

	}

}