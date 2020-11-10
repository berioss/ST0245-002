
import java.util.*;

public class Punto01 {

	static mapa mapa = crearMapa.main("C:\\Users\\57322\\Downloads\\daticos.txt");
	static LinkedList<Stack<Integer>> carros;
	static ArrayList<Integer> visitados;

	public static void main(String args[]) {
		mejorRuta(1);
		for(int i=0;i<carros.size();i++) {
			imprimirStack(carros.get(i));
		}
	}

	private static void mejorRuta(int origen) {
		carros = new LinkedList<>();
		visitados = new ArrayList<>();
		visitados.add(origen);
		while (visitados.size() < mapa.grafo.size() - 1) {

			carros.add(LlenarCarro(origen, visitados));
			
		}
		
	}

	private static Stack<Integer> LlenarCarro(int origen, ArrayList<Integer> visitados) {
		Stack<Integer> carro = new Stack<>();

		int temp = 1;
		int TAcumulado = 0;
		for (int i = 0; i <= 5 && i < mapa.grafo.size(); i++) {
			if (visitados.size() >= (mapa.grafo.size()))
				break;
			temp = AnadirPasajero(temp, mapa, visitados, origen, TAcumulado);
			if (temp == 0)
				break;
			if (carro.size() == 0)
				TAcumulado = TAcumulado + TiemEnIr(mapa, temp, origen);
			else
				TAcumulado = TAcumulado + TiemEnIr(mapa, temp, carro.peek());
			carro.push(temp);
			visitados.add(temp);
		}
		return carro;
	}

	private static int AnadirPasajero(int origen, mapa mapa, ArrayList<Integer> visitados, int llegada,
			int TAcumulado) {
		int menor = origen;

		for (int i = 1; i < mapa.grafo.size(); i++) {
			if (i == origen)
				i++;
			if (i >= mapa.grafo.size())
				return 0;

			int a = TiemEnIr(mapa, i, origen);
			int c = TiemEnIr(mapa, i, llegada);
			if (menor == origen && comparar(visitados, i)) {
				float normal = mapa.p * c;
				int recogido = a + TAcumulado;
				if ((recogido) <= (normal))
					menor = i;
				
			}
			if (a < TiemEnIr(mapa, menor, origen) && comparar(visitados, i)) {
				float normal = mapa.p * c;
				int recogido = a + TAcumulado;
				if ((recogido) <= (normal))
					menor = i;
			}
			

		}
		if(menor==origen)return 0;
		return menor;
	}

	private static boolean comparar(ArrayList<Integer> visitados, int numero) {
		if (visitados.size() == 0)
			return true;
		for (int i = 0; i < visitados.size(); i++) {
			if (numero == visitados.get(i))
				return false;
		}
		
		return true;
	}

	public static int TiemEnIr(mapa m, int inicio, int llegada) {

		return m.grafo.get(inicio - 1).get(llegada - 1);
	}
	private static void imprimirStack(Stack<Integer> pila) 
	{
		while(pila.size()!=0)System.out.println(pila.pop());
		System.out.println();
	}
}
