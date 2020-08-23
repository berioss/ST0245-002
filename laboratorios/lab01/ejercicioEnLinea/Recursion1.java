
public class Recursion1 {

	public int factorial(int n) {
		if (n == 1)
			return 1;// C
		return n * factorial(n - 1);// C+T(n-1)
	}
	// MODELO: T(n) = |C1, n=1
	// |C2 + T(n-1), n>1
	// ECUACION DE RECURRENCIA:
	// T(n) = C2*n + C1
	// CÁLCULO DE COMPLEJIDAD:
	// O(C2*n + C1)
	// O(C2*n)
	// O(n)

	public boolean array220(int[] nums, int index) {
		if (index == nums.length - 1 || nums.length == 0)
			return false; // C1
		return nums[index] * 10 == nums[index + 1] || array220(nums, index + 1); // T(n)=C2+T(n-1)
	}

	// MODELO: T(n) = |C1, n=0
	// |C2 + T(n-1), n>0
	// ECUACION DE RECURRENCIA:
	// T(n) = C2*n + C1
	// CÁLCULO DE COMPLEJIDAD:
	// O(C2*n + C1)
	// O(C2*n)
	// O(n)
	public int count8(int n) {
		if (n == 0)// C1
			return 0;
		int val = n % 10 == 8 ? 1 : 0;// C2
		if (n % 100 == 88)// C3
			val = 2;// T(n)=C3+C4
		return val + count8(n / 10);// T(n)=C5+T(n-1)

		// MODELO: T(n) = |C1, n=0
//		                  |C4, n>1
		// |C2+C3+C5+T(n-1), n>0
		// ECUACION DE RECURRENCIA:
		// T(n) = C*n + C1
		// CÁLCULO DE COMPLEJIDAD:
		// O(C*n + C1)
		// O(C*n)
		// O(n)
	}

	public String stringClean(String str) {
		if (str.length() == 0 || str.length() == 1)
			return str;

		return str.charAt(0) == str.charAt(1) ? stringClean(str.substring(1, str.length()))
				: str.substring(0, 1) + stringClean(str.substring(1, str.length()));
	}

	public static String changeXY(String str) {
		if (str.indexOf("x") == -1)
			return str;// C1

		return str.substring(0, str.indexOf("x") + 1).replace("x", "y")
				+ changeXY(str.substring(str.indexOf("x") + 1, str.length()));// T(n)=C2+T(n-1)
	}

	// MODELO: T(n) = |C1, n=0
	//                |C2 + T(n-1), n>0
	// ECUACION DE RECURRENCIA:
	// T(n) = C2*n + C1
	// CÁLCULO DE COMPLEJIDAD:
	// O(C2*n + C1)
	// O(C2*n)
	// O(n)

	
}
