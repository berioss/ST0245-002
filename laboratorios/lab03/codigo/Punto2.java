
public class Punto2 {
	
	public static String tecladoRoto(String linea) {
		for(int i=linea.length()-1;i>=0;i--) {
			if(linea.charAt(i)=='[') {
				return linea.substring(i+1, linea.length())+tecladoRoto(linea.substring(0,i));
			}
			if(linea.charAt(i)==']') {
				return tecladoRoto(linea.substring(0,i))+linea.substring(i+1, linea.length());
			}
			
		}
		return linea;
		
	}

	public static void main(String[] args ){
		System.out.println(tecladoRoto("asd[gfh[[dfh]hgh]fdfhd[dfg[d]g[d]dg"));
	}
}
