import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Conexion {

	private String sourceURL = "jdbc:mysql://localhost/vagones";
	private String user = "root";
	private String password = "";
	private Connection con;

	public Connection getConexion() {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(sourceURL, user, password);
			Statement stmt = con.createStatement();

		} catch (ClassNotFoundException e) {
			System.out.println(e);

		} catch (SQLException e) {
			System.out.println(e);
		}
		return con;

	}

}
