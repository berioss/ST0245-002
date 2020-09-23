import java.util.Stack;
public class InvertirPila
{
    public static void main(String[] args){
        Stack<Integer> invertido = new Stack<>();
        for(int i = 1; i <= 20; i++){
            invertido.push(i);
        }
        Stack<Integer> ordenado = new Stack<>();
        System.out.print("Invertido: ");
        ordenado = invertir(invertido, ordenado);
        System.out.print("Ordenado: ");
        while(!(ordenado.isEmpty())){
            System.out.print(ordenado.peek()+" ");
            ordenado.pop();
        }
    }

    public static Stack<Integer> invertir(Stack<Integer> a, Stack<Integer> b){
        if(a.isEmpty()){
            System.out.println();
            return b;
        }
        System.out.print(a.peek()+" ");
        b.push(a.peek());
        a.pop();
        return invertir(a, b);
    }
}