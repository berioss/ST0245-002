
public class Punto3 {

	public static int fibonacci(int n) {
		if(n==1)return 1;
		   if(n<=0)return 0;
		else return fibonacci(n-1)+ fibonacci(n-2);
		
	}
	public static void main(String args[]) {
		System.out.println(fibonacci(100));
		
	}
}
