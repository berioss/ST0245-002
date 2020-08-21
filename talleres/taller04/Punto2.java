
public class Punto2
{
    public static boolean sumaGrupo(int start, int[] nums, int target){
        if(start == nums.length)//C1
            return target == 0;//C2
        else
            return sumaGrupo(start+1, nums, target) ||
            sumaGrupo(start+1, nums, target - nums[start]);//t(n)=C3+2t(n-1)
    }

    public static void main(String[] args){
    	
    	for(int i = 13;i<=33;i++) {
        long ti = System.currentTimeMillis();
    	sumaGrupo(0, new int[i], 10);
        long tf = System.currentTimeMillis();
        System.out.println(tf - ti);
        }
    }
}