public class Punto1
{
    public static int maximo(int[] a, int indice){
        if(indice == 1)
            return a[0];
        else
            return Math.max(a[indice-1], maximo(a, indice-1));// T(n) = c2 + T(n-1)
        // T(n) = c1 + c2.n 
    }

    public static void main(String[] args){
        for(int i = 0; i < 20; i++){
            long ti = System.currentTimeMillis();
            int max = maximo(new int[i], new int[i].length);
            System.out.println("El numero maximo es "+ max);
            long tf = System.currentTimeMillis();
            System.out.println(tf - ti);
        }
    }
}