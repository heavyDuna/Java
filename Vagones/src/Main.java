import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		MisMetodos m = new MisMetodos();
		// m.insertarBillete();
		Date fecha = new Date();
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String hActual = d.format(fecha);

		ArrayList datos = new ArrayList();

		int op = 0;
		String texto;

		m.visualizarLineas();

	}

}
