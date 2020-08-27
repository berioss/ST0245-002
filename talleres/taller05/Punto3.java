public class Punto3
{
    public static void mul(int n, int start){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        if(start < nums.length && n != 0){
            System.out.println(n+"x"+nums[start]+" = "+n*nums[start]);
            mul(n, start+1);
        }
        else if(n > 0){
            mul(n-1, 0);
        }
    }

    public static void main(String[] args){
        for(int n = 1; n < 20; n++){
            long ti= System.currentTimeMillis();
            mul(n, 0);
            long tf = System.currentTimeMillis();
            System.out.println(tf-ti);
        }
    }
}