import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class leedor {

	public static ArrayList principal(String direccionArchivo) {
		ArrayList<String[]> array = new ArrayList<>();
		leedor l = new leedor();
		String a = l.leer(direccionArchivo);
		l.guardar(a, array);
		return array;
	}

	private static String leer(String direccion) {
		String texto = "";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp = "";
			String bfRead;
			while ((bfRead = bf.readLine()) != null) {
				if (temp == "")
					temp = temp + bfRead;

				else
					temp = temp + "," + bfRead;
			}
			texto = temp;
		} catch (Exception e) {
			System.err.println("No se encuentra archivo");
		}
		return texto;
	}

	private static void guardar(String s, ArrayList<String[]> array) {

		int cont = 0;
		array.add(new String[3]);
		if (s.indexOf(",") != -1) {
			while (s.indexOf(",") != -1) {
				if (cont % 3 == 0 && cont != 0) {
					array.add(new String[3]);

				}

				array.get((int) (cont / 3))[cont % 3] = s.substring(0, s.indexOf(","));
				s = s.substring(s.indexOf(",") + 1, s.length());
				cont++;

			}

			array.get((int) (cont / 3))[cont % 3] = s;
		}
	}

	public static void main(String args[]) {
		ArrayList<String[]> arr = principal("C:\\Users\\57322\\Downloads\\ConjuntoDeDatosCon4abejas.txt");
	}
}