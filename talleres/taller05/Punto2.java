public class Punto2
{
    public static int suma(int[] a){
        int sum = 0;//c_1
        for(int i = 0; i < a.length; i++){//c_2 + c_3n
            sum += a[i];//c_4
        }
        return sum;//c_5
        //T(n) = c_1+ c_2 + c_5 + (c_3+c_4)n
    }//T(n) es O(n) n el numero de entradas del arreglo
    
    //Tiene una complejidad lineal tanto con ciclos como en recurrencia. pero en ciclos resive muchas mas entradas, esto ya que en recurrencia el STACK se llena.

    public static void main(String[] args){
        for(int n = 1000000; n < 10000000; n += 1000000){
            long ti= System.currentTimeMillis();
            suma(new int[n]);
            long tf = System.currentTimeMillis();
            System.out.println(tf-ti);
        }
    }
}
