import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class leedor {
	
	public static ArrayList<String[]> principal(String direccionArchivo) {
		return leer(direccionArchivo);
	}

	private static ArrayList<String[]> leer(String direccion) {
		ArrayList<String[]> array= new ArrayList<>();
		try {
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp = "";
			String bfRead;
			while ((bfRead = bf.readLine()) != null) {
				temp=bfRead;
				String[] cadenas= new String[78];
				int pyc=temp.indexOf(';');
				int i=0;
				while(pyc!=-1) {
					cadenas[i]=temp.substring(0, pyc);
					temp=temp.substring(pyc+1);
					pyc=temp.indexOf(';');
					i++;
				}
				cadenas[i]=temp;
				array.add(cadenas);
			}
			
		} catch (Exception e) {
			System.err.println("No se encuentra archivo");
		}
		return array;
	}

	public static void main(String args[]) {
		ArrayList<String[]> arr = principal("C:\\Users\\57322\\Downloads\\Este.csv");
	}
}
