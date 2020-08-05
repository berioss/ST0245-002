import java.util.Scanner;
public abstract class Punto2
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserte numero de equipamentos");

        int[] a=new int[scan.nextInt()];
        for(int i=0;i<a.length;i++){
            System.out.println("Inserte peso entero del equipamiento numero "+(i+1));
            a[i]=scan.nextInt();
        }
        System.out.println("Inserte peso maximo");
        System.out.println(equip(a,scan.nextInt()));
    }


    private static boolean equip(int[] armas,int max ){
        int i=0;
        if(max==0)return true;
        while(i<armas.length){
            if(armas[i]<=max){
                if(equip(New(armas),max-armas[i]))return true;
            }
            i++;
        }
        return false;
    } 


    private static int[] New(int[] i){
        int[] f= new int[i.length-1];
        for(int j=0;j<f.length;j++){
            f[j]=i[j+1];
        }
        return f;
    }
}