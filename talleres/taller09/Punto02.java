import java.util.Hashtable;
import java.util.Scanner;

public class Punto02 {

	public static void main(String args[]) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Google", "Estados Unidos");
		ht.put("LaLocura", "Colombia");
		ht.put("Nokia", "Finlandia");
		ht.put("Sony", "Japón");

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Inserte Compañia");
			while(!scan.hasNextInt()) {
			System.out.println("Pais: "+ ht.get(scan.next()));
			System.out.println("Inserte Compañia");
			System.out.println("Si desea salir inserte un numero cualquiera");
			}
			System.out.println("Hasta la proxima");
		}
	}
}
