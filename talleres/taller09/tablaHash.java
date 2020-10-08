public class tablaHash {
	private int arr[];

	public tablaHash() {
		arr = new int[1000000];
	}

	public void insersion(String clave, int telefono) {
		arr[hash(clave)] = telefono;
	}

	public long busqueda(String clave) {
		
		return arr[hash(clave)];
	}
	private int hash(String palabra) {
		int cont = 0;
		for (int i = 0; i < palabra.length(); i++) {
			cont = (int) ((int)palabra.charAt(i) * Math.pow(2, palabra.length()-i))+cont;
		}
		return cont;
	}
	public static void main(String argas[]) {
		tablaHash tb= new tablaHash();
		tb.insersion("MariaAleja", 2118453);
		System.out.println(tb.busqueda("Maria"));
	}
}
