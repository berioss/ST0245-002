import java.util.Stack;
public class ejercicio2
{
    public static void main(String[] args){
        Stack<Nevera> almacen = new Stack<>();
        Stack<Pedido> solicitudes = new Stack<>();
        almacen.push(new Nevera(1,"haceb"));
        almacen.push(new Nevera(2,"lg"));
        almacen.push(new Nevera(3,"ibm"));
        almacen.push(new Nevera(4,"haceb"));
        almacen.push(new Nevera(5,"lg"));
        almacen.push(new Nevera(6,"ibm"));
        almacen.push(new Nevera(7,"haceb"));
        almacen.push(new Nevera(8,"lg"));
        almacen.push(new Nevera(9,"ibm"));
        almacen.push(new Nevera(8,"lg"));
        almacen.push(new Nevera(9,"ibm"));
        solicitudes.push(new Pedido("eafit", 10));
        solicitudes.push(new Pedido("la14", 2));
        solicitudes.push(new Pedido("olimpica", 4));
        solicitudes.push(new Pedido("éxito", 1));
        System.out.print("[");
        procesarPedidos(almacen,solicitudes);
        System.out.print("]");
    }

    private static void procesarPedidos(Stack<Nevera> a, Stack<Pedido> b){
        if(a.isEmpty() || b.isEmpty())
            return;
            // No le puse comas porque despues alargaria el codigo mucho
        String pedidoDe = b.peek().nombre;
        int cantidadPedidos = b.pop().numero;
        int codigoNevera = a.peek().codigo;
        String marcaNevera = a.pop().marca;
        System.out.print("("+pedidoDe+", [");
        for(int i = 0; i < cantidadPedidos; i++){
            if(!a.isEmpty())
                System.out.print("("+codigoNevera+", "+marcaNevera+")");
        }
        System.out.println("])");
        procesarPedidos(a,b);
    }
}