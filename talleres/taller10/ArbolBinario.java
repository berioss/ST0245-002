
public class ArbolBinario {
	Node raiz;

	public ArbolBinario(Node raiz) {
		this.raiz = raiz;
	}

	public void insertar(Node nuevo) {
		insertarAux(nuevo, raiz);
	}

	public void insertarAux(Node nuevo, Node base) {
		Node temp;
		if ((valorString(base.caja.key)) <= (valorString(nuevo.caja.key)))
			temp = base.derecha;
		else
			temp = base.izquierda;
		if (temp == null) {
			if ((valorString(base.caja.key)) <= (valorString(nuevo.caja.key))) {
				base.derecha = nuevo;
				return;
			}
			else {
				base.izquierda = nuevo;
				return;
			}
		}
		insertarAux(nuevo, temp);
		return;
	}

	public boolean buscar(String cadena) {
		return buscarAux(cadena, raiz);
	}

	public boolean buscarAux(String cadena, Node base) {
		if (base == null)
			return false;
		if (base.caja.abrir(cadena) != 0)
			return true;
		if ((valorString(base.caja.key)) < (valorString(cadena)))
			return buscarAux(cadena, base.derecha);
		else
			return buscarAux(cadena, base.izquierda);

	}

	private int valorString(String cadena) {
		int acumulado = 0;
		for (int i = 0; i < cadena.length(); i++) {
			acumulado = cadena.charAt(i) * (int) Math.pow(2, 1) + acumulado;
		}
		return acumulado;
	}
}
