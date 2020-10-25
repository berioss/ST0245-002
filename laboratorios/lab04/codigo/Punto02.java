import java.util.Scanner;

public class Punto02 {

	static Node Raiz;

	public static void principal() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			aux(scan.nextInt(), Raiz);
		}
		imprimirPre(Raiz);

	}
	public static void imprimirPre(Node nodo) {
		if(nodo==null)return;
		imprimirPre(nodo.izquierda);
		imprimirPre(nodo.derecha);
		System.out.println(nodo.value);
		return;
	}
	private static void aux(int value, Node nodo) {
		if (nodo == null) {
			nodo = new Node(value);
			Raiz=nodo;
			}
		
		if (value == nodo.value)
			return;
		if (value > nodo.value) {
			if (nodo.derecha == null)
				nodo.derecha = new Node(value);
			else {
				aux(value, nodo.derecha);
				return;
			}

		} else {
			if (nodo.izquierda == null)
				nodo.izquierda = new Node(value);
			else {
				aux(value, nodo.izquierda);
				return;
			}

		}
	}
	public static void main(String args[]) {
		principal();
	}
}
