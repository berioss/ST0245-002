public class Punto1
{
    public static int[] insertionSort(int[] a, int start){
        if(start < a.length-1){// c_1

            if(a[start] > a[start+1]){//c_2
            
                int b = a[start];//c_3
                a[start] = a[start+1];//c_4
                a[start+1] = b;//c_5
            }
            }
            return insertionSort(insertionSort(a, start+1), start+1);//c_6+T(n-1)*2
        }
        return a;
    }
//Complejidad del algoritmo 
//Ignoramos las constantes.
//O( c_6 (2^n - 1) + c_1 2^(n - 1) ) Regla de la suma 
//O(c_6 (2^n - 1)) Regla de la multiplicacion 
//O(2^n - 1) Regla de la suma 
//O(2^n) Con n siendo el numero de elementos del arreglo

//Este algorimo no es practico para una alta cantidad de datos, ya que lo que se busca
//con catidades enormes seria un crecimiento logaritmico, el exponencial no es adecuado 
//
    public static void main(String[] args){
        for(int n = 20; n < 30; n++){
            long ti= System.currentTimeMillis();
            insertionSort(new int[n],0);
            long tf = System.currentTimeMillis();
            System.out.println(tf-ti);
        }
    }
}
