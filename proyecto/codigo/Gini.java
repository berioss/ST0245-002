
public class Gini {

	public static float calcularPonderada(float nd1 ,float nd0, float ni1 ,float ni0) {
		return ((ni0+ni1)*calcularImpureza(ni0,ni1)+(nd0+nd1)*calcularImpureza(nd0,nd1))/(ni1+nd0+nd1+ni0);
		
	}
	public static float calcularImpureza(float n0, float n1) {
		double p0=n0/(n1+n0);
		double p1=n1/(n1+n0);
		return (float) (1.0-(p0*p0+p1*p1));
		
	
	}
	public static void main(String args[]) {
		System.out.println(calcularImpureza(1, 4));
		System.out.println(calcularImpureza(2, 1));
		System.out.println(calcularPonderada(4, 1, 1, 2));
	}
}
