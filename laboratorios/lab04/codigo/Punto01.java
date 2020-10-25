import java.util.ArrayList;

public class Punto01 {

	static ArrayList<Abeja> Abejas = new ArrayList<>();

	private static void meterAbejas() {
		ArrayList<String[]> arr = leedor.principal("C:\\Users\\57322\\Downloads\\ConjuntoDeDatosCon1000abejas.txt");
		for (int i = 1; i < arr.size(); i++) {
			Abejas.add(new Abeja(Double.parseDouble(arr.get(i)[0]), Double.parseDouble(arr.get(i)[1]),
					Double.parseDouble(arr.get(i)[2])));
		}
	}

	public static void principal() {
		meterAbejas();
		for (int i = 0; i < Abejas.size() - 1; i++) {
			for (int j = i + 1; j < Abejas.size(); j++) {
				double d=distancia(Abejas.get(i), Abejas.get(j));
				if (d <= 100)
					System.out.println("Abeja numero " + (i+1) + " con Abeja numero " + (j+1));
			}
		}
	}

	private static double distancia(Abeja a, Abeja b) {
		return Math.sqrt(((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY())
				+ (a.getZ() - b.getZ()) * (a.getZ() - b.getZ())));
	}

	public static void main(String args[]) {
		principal();
	}
}
