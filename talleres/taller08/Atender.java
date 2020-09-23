import java.util.Queue;
import java.util.LinkedList;
public class Atender
{
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        queue.add("Juan");
        queue.add("María");
        queue.add("Pedro");
        atendiendo(queue);
    }

    private static void atendiendo(Queue<String> a){
        if(a.peek() == null)
        return;
        
        System.out.println("Atendiendo a: "+a.poll()+" ");
        atendiendo(a);
    } 
}