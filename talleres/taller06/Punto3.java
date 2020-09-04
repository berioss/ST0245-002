public class Punto3
{
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        int b = 4;
        imprArr(arr(b, a));
    }

    public static ArrayList arr(int n, ArrayList a){
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= i; j++)
                a.add(j);
        return a;
    }

    public static void imprArr(ArrayList b){
        System.out.print("[");
        for(int i = 0; i < b.size()-1; i++){
            System.out.print(b.get(i)+",");
        }
        System.out.print(b.get(b.size()-1)+"]");
    }
}