public class P1s2
{
    public static int rectangulo(int n){
        if(n <= 2)
        return n;
        
        return rectangulo(n-1) + rectangulo(n-2);
    }// Este codigo lo saque accidentalmente de la pregunta que estaba en
    //el parcial sorpresa.
}