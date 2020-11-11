import java.util.LinkedList;
import java.util.Queue;

public class Algorithm {

    public static boolean DFSColorFC(Tree tree) {
        return DFSColorFCAux(tree.getFirst(), 1);
    }

    private static boolean DFSColorFCAux(Node first, int color){
        if (first.getColor() == color)
            return false;
        first.setColor(color);

        int i = 1;
        for(Node temp : first.getSuccessors()){
            if(i % 2 == 0) {
                DFSColorFCAux(temp, color);
                i++;
            }
            else {
                DFSColorFCAux(temp, color+1);
                i++;
            }
        }
        return true;
    }
}