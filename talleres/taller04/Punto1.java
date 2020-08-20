public class Punto1
{
    public static int maximo(int[] nums, int start, int max){
        int a = (start == nums.length) ? max : maximo(nums, start+1,Math.max(start,max));
        return a;
    }

    public static void main(String[] args){
        long ti = System.currentTimeMillis();
        int[] a = {1,1,3,9,1,2,10,20};
        int max = maximo(a, 0, 10);
        System.out.println("El numero maximo es "+max);
        long tf = System.currentTimeMillis();
        System.out.println(tf - ti);
    }
}