public class Punto1
{
    public static void prueba(int num){
        TDH(num, "A", "B", "C");
    }

    private static void TDH(int discos, String primero, String intermedio, String ultimo){
        if(discos == 1)
            System.out.println(primero + " ----> " + ultimo);
        else{
            TDH(discos-1, primero, ultimo, intermedio);
            TDH(1, primero, intermedio, ultimo);
            TDH(discos-1, intermedio, primero, ultimo);
        }
    }
}