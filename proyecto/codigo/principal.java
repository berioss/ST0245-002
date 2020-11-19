import java.util.ArrayList;
import java.util.LinkedList;

public class principal {
	private static ArrayList<String[]> estudiantes;

	public static void main(String args[]) {
		System.out.println("MB: " + (double) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024)/1024);
		
		 long TInicio, TFin, tiempo,Minicio,Mfin;
		 
	        TInicio = System.currentTimeMillis();
		System.out.println(sacarPrecision(CrearArbol(leedor.principal("C:\\Users\\57322\\Downloads\\130.csv")),
				leedor.principal("C:\\Users\\57322\\Downloads\\test2.csv")));
		TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
        System.out.println("Total memory usage: ");
       
        System.out.println("MB: " + (double) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024)/1024);
	}

	public static Node CrearArbol(ArrayList<String[]> arreglo) {
		
		ArrayList<Integer[]> visitados = new ArrayList<>();
		double[] temp = MejorPregunta.BQ(arreglo, 66, 73, visitados);
		Integer[] s = { (int) temp[0], (int) temp[1] };
		visitados.add(s);
		Node raiz = new Node( temp);
		dividirArbol(raiz, visitados,arreglo);
		return raiz;
	}

	public static double sacarPrecision(Node raiz, ArrayList<String[]> estudiantes) {
		int bien = 0;
		for (int i = 1; i < estudiantes.size(); i++) {
			String[] estudiante = estudiantes.get(i);
			if (predecir(estudiante, raiz)==Integer.parseInt(estudiante[estudiante.length-1]))
				bien++;
		}
		return (bien + 0.0) / estudiantes.size();

	}

	public static int predecir(String[] estudiante, Node raiz) {
		Node nodoPregunta = raiz;
		int resultado=0;
		
		while (nodoPregunta != null) {
			if ((int) nodoPregunta.pregunta[0] == 0)
				break;
			if (Float.parseFloat(estudiante[(int) nodoPregunta.pregunta[0]]) >= nodoPregunta.pregunta[1]) {
				resultado=1;
				
				nodoPregunta = nodoPregunta.derecha;
			} else {
				resultado=0 	;
				nodoPregunta = nodoPregunta.izquierda;
			}
		}
		return resultado;

	}

	private static void dividirArbol(Node nodo, ArrayList<Integer[]> visitados, ArrayList<String[]> estudiantes) {
		principal.estudiantes = estudiantes;
		if (estudiantes.size() == 0)
			return;
		if (nodo.pregunta[2] <= 0 || nodo.pregunta[2] == 100)
			return;
		ArrayList<String[]> datosDerecha = new ArrayList<>();
		ArrayList<String[]> datosIzquierda = new ArrayList<>();
		for (int i = 1; i <estudiantes.size(); i++) {
			String[] estudiante = estudiantes.get(i);
			if (Float.parseFloat(estudiante[(int) nodo.pregunta[0]]) >= nodo.pregunta[1])
				datosDerecha.add(estudiante);
			else
				datosIzquierda.add(estudiante);
		}
		if (datosDerecha.size() != 0) {
			double[] a = MejorPregunta.BQ(datosDerecha, 66, 73, visitados);
			Integer[] s = { (int) a[0], (int) a[1] };
			ArrayList<Integer[]> visitados2 = visitados;
			visitados2.add(s);
			nodo.derecha = new Node( a);
			dividirArbol(nodo.derecha, visitados2,datosIzquierda);
		}
		
		if (datosDerecha.size() != 0) {
		
			double[] a = MejorPregunta.BQ(datosDerecha, 66, 73, visitados);
			nodo.izquierda = new Node(a);
			Integer[] s = { (int) a[0], (int) a[1] };
			ArrayList<Integer[]> visitados3 = visitados;
			visitados3.add(s);
			dividirArbol(nodo.izquierda, visitados3,datosDerecha);
		}
		return;
	}

	

	

}
