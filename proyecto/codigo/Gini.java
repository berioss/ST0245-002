
public class Gini {

	public static double calcularPonderada(float estudiantesID, float estudiantesII,float estudiantesDI, float estudiantesDD) {
		if((estudiantesDD+estudiantesDI)==0 && (estudiantesII+estudiantesID)==0)return 0.5;
		return ((estudiantesII+estudiantesID)*calcularImpureza(estudiantesII,estudiantesID)+
				(estudiantesDD+estudiantesDI)*calcularImpureza(estudiantesDI,estudiantesDD))/(estudiantesDI+estudiantesDD+estudiantesII+estudiantesID);

	}

	public static double calcularImpureza( float estudiantesIzquierda,float estudiantesDerecha) {
		if((estudiantesIzquierda + estudiantesDerecha) ==0)return 0.5;
		double proporcionEstudiantesDerecha = estudiantesDerecha / (estudiantesIzquierda + estudiantesDerecha);
		double proporcionEstudiantesIzquierda = estudiantesIzquierda / (estudiantesIzquierda + estudiantesDerecha);
		double tot = 1.0 - (proporcionEstudiantesDerecha * proporcionEstudiantesDerecha + 
				proporcionEstudiantesIzquierda * proporcionEstudiantesIzquierda);
		return tot;

	}

	public void main(String args[]) {
		System.out.println(calcularImpureza(1, 4));
		System.out.println(calcularImpureza(2, 1));
		System.out.println(calcularPonderada(4, 1, 1, 2));
	}
}
