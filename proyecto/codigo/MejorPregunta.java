import java.util.ArrayList;
import java.util.LinkedList;

public class MejorPregunta {
	
	public static double[] BQ(ArrayList<String[]> arreglo,int inicio, int fin,LinkedList<Integer[]> visitados) {
		double[] mejor= {0,0,100};
		for(int i= inicio;i<fin;i++) {
			double[] temp=sacarMejorPregunta( arreglo, i, 0, 100);
			
			if(mejor[2]>temp[1] && comparar(i,temp[0],visitados)) {
				
				mejor[0]=i;
				mejor[1]=temp[0];
				mejor[2]=temp[1];
			}
			
				
			
		}
		Integer[] s={(int) mejor[0],(int) mejor[1]};
		visitados.add(s);
		return mejor;
		
	}
	
	private static boolean comparar(int a,double temp, LinkedList<Integer[]> visitados) {
		for(Integer[] n:visitados) {
			if(n[0]==a && n[1]==temp)return false;
		}
		return true;
	}

	public static double[] sacarMejorPregunta(ArrayList<String[]> array, int pp, int ini, int fin) {
		int mejor = ini;

		for (int i = 1; i < fin - ini; i++) {
			double d1 = sacarGuini(array, pp, ini+i);
			double d2 = sacarGuini(array, pp, mejor);

			mejor = d1 < d2 ? ini + i : mejor;

		}
		
		double[] elpepe= {mejor, sacarGuini(array, pp, mejor)};
		return elpepe;
	}

	public static double sacarGuini(ArrayList<String[]> array, int pp, int np) {
		float nd1 = 0, nd0 = 0, ni1 = 0, ni0 = 0;

		for (int i = 1; i < array.size(); i++) {
			String s1 = array.get(i)[pp-1];
			String temp = Float.parseFloat(s1) >= np ? "1" : "0";
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
