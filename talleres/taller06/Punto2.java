import java.util.Scanner;
public class Punto2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList a = new ArrayList();
        while(true){
            int n = sc.nextInt();
            if(n == -1)
                break;
            a.add(n);
        }
        imprimirArr(invertir(a));
    }

    public static ArrayList invertir(ArrayList a){
        ArrayList b = new ArrayList();
        for(int i = a.size()-1; i >= 0; i--){
            b.add(a.get(i));
        }
        return b;
    }

    public static void imprimirArr(ArrayList a){
        System.out.print("[");
        for(int i = 0; i < a.size()-1; i++){
            System.out.print(a.get(i)+",");
        }
        System.out.print(a.get(a.size()-1)+"]");
    }
}