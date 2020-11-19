import java.util.ArrayList;
import java.util.LinkedList;

public class MejorPregunta {

	public static double[] BQ(ArrayList<String[]> estudiantes,int inicio, int fin,ArrayList<Integer[]> visitados) {
		double[] mejor= {0,0,100};
		if(estudiantes.size()==0)return mejor;
		for(int i= inicio;i<fin;i++) {
			double[] temp=sacarMejorPregunta( estudiantes, i, 30, 90); //Sacomos la mejor pregunta de esta fila
			
			
			if(mejor[2]>temp[1] && comparar(i,temp[0],visitados)) {//Comparamos la que tenemos y la de ahora
				
				mejor[0]=i;
				mejor[1]=temp[0];
				mejor[2]=temp[1];
			}
			
			
			
		}
		
		
		return mejor;
		
	}

	private static boolean comparar(int a, double temp, ArrayList<Integer[]> visitados) {
		for (Integer[] n : visitados) {
			if (n[0] == a && n[1] == temp)
				return false;
		}
		return true;
	}

	public static double[] sacarMejorPregunta(ArrayList<String[]> estudiantes, int casillaPregunta, int ini, int fin) {
		int mejorPregunta = ini;

		for (int i = ini+1; i < fin ; i++) {
			mejorPregunta = sacarGuini(estudiantes, casillaPregunta, i) < sacarGuini(estudiantes, casillaPregunta, mejorPregunta) ?  i : mejorPregunta;

		}

		double[] elpepe = { mejorPregunta, sacarGuini(estudiantes, casillaPregunta, mejorPregunta)};
		return elpepe;
	}

	public static double sacarGuini(ArrayList<String[]> estudiantes, int casillaPregunta, int numeroAPreguntar) {
		float estudiantesII = 0, estudiantesID = 0, estudiantesDI = 0, estudiantesDD = 0;

		for (int i = 1; i < estudiantes.size(); i++) {
			String s1 = estudiantes.get(i)[casillaPregunta - 1];
			String temp = Float.parseFloat(s1) >= numeroAPreguntar ? "1" : "0";
			String temp2 = estudiantes.get(i)[estudiantes.get(i).length - 1];
			if (temp.equals("1")) {

				if (temp.equals(temp2))
					estudiantesDD++;
				else
					estudiantesDI++;
			} else {
				if (temp.equals(temp2))
					estudiantesID++;
				else
					estudiantesII++;
			}
		}
		return Gini.calcularPonderada(estudiantesID, estudiantesII, estudiantesDI, estudiantesDD);
		
	}
}
