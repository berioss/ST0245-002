import java.util.ArrayList;

public class MejorPregunta {
	public int sacarMejorPregunta(ArrayList<String[]> array, int pp, int ini, int fin) {
		int mejor = ini;

		for (int i = 1; i < fin - ini; i++) {
			double d1 = sacarGuini(array, pp, ini+i);
			double d2 = sacarGuini(array, pp, mejor);

			mejor = d1 < d2 ? ini + i : mejor;

		}
		System.out.println(mejor + " : " + sacarGuini(array, pp, mejor));
		return mejor;
	}

	public double sacarGuini(ArrayList<String[]> array, int pp, int np) {
		float nd1 = 0, nd0 = 0, ni1 = 0, ni0 = 0;

		for (int i = 1; i < array.size(); i++) {
			String s1 = array.get(i)[pp];
			String temp = Float.parseFloat(s1) == np ? "1" : "0";
			String temp2 = array.get(i)[array.get(i).length - 1];
			if (temp.equals("1")) {

				if (temp.equals(temp2))
					nd1++;
				else
					nd0++;
			} else {
				if (temp.equals(temp2))
					ni1++;
				else
					ni0++;
			}
		}
		Gini g = new Gini();
		return g.calcularPonderada(nd1, nd0, ni1, ni0);
	}
}
