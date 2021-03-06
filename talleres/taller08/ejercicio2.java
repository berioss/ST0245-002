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
        // Trate de usar variables con nombres mas entendibles, pero despues
        //sale mal, me di cuenta al dia siguiente, pero ahora si funciona
        String pedidoDe = b.peek().nombre;
        System.out.print("("+pedidoDe+", [");
        for(int i = 0; i < b.peek().numero; i++){
            if(!a.isEmpty()){
                System.out.print("("+a.peek().codigo+", "+
                a.peek().marca+")");
                a.pop();
            }
        }
        b.pop();
        System.out.println("])");
        procesarPedidos(a,b);
    }
}