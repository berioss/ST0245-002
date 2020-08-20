public class Punto2
{
    public static boolean sumaGrupo(int start, int[] nums, int target){
        if(start == nums.length)
            return target == 0;
        else
            return sumaGrupo(start+1, nums, target) ||
            sumaGrupo(start+1, nums, target - nums[start]);
    }

    public static void main(String[] args){
        long ti = System.currentTimeMillis();
        int[] a = {1,1,3,9,1,2,10,20};
        boolean suma = sumaGrupo(0, a, 10);
        System.out.println(suma);
        long tf = System.currentTimeMillis();
        System.out.println(tf - ti);
    }
}