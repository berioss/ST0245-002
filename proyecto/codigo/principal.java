import java.util.ArrayList;
import java.util.LinkedList;

public class principal {
	public static void main(String args[]) {
		LinkedList<Integer[]> visitados=new LinkedList<>();
		ArrayList<String[]> arreglo = leedor.principal("C:\\Users\\57322\\Downloads\\valores.csv");
		double[] temp = MejorPregunta.BQ(arreglo, 66, 73, visitados);
		Node raiz=new Node(arreglo,temp);
		
		dividirArbol(raiz,visitados);
		
		int i=0;
	}

	public static void dividirArbol(Node nodo, LinkedList<Integer[]> visitados) {
		if(nodo.pregunta[2]==0 || nodo.pregunta[2]==100)return;
		ArrayList<String[]> datosDerecha = new ArrayList<>();
		ArrayList<String[]> datosIzquierda = new ArrayList<>();
		for (int i=1;i<nodo.datos.size();i++) {
			String[] estudiante=nodo.datos.get(i);
			if (Float.parseFloat(estudiante[(int) nodo.pregunta[0]]) >= nodo.pregunta[1])
				datosDerecha.add(estudiante);
			else
				datosIzquierda.add(estudiante);
		}
		nodo.derecha=new Node(datosDerecha, MejorPregunta.BQ(datosDerecha,66, 73, visitados) );
		nodo.izquierda=new Node(datosIzquierda, MejorPregunta.BQ(datosIzquierda,66, 73, visitados) );
		dividirArbol(nodo.derecha, visitados);
		dividirArbol(nodo.izquierda, visitados);
	}
	

}
