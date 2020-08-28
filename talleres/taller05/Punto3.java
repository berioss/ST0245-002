public class Punto3
{
    public static void mul(int n, int start){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};//c_1
        if(start < nums.length && n != 0){//c_2
            System.out.println(n+"x"+nums[start]+" = "+n*nums[start]);//c_3
            mul(n, start+1);//T(n-1)
        }
        else if(n > 0){
            mul(n-1, 0);//T(n-1)
        }//T(n) = (c_1 + c_2 + c_3)n + c_1
    }//T(n) es O(n)

    public static void main(String[] args){
        long[] a = new long[20];
        int i = 0;
        for(int n = 1; n < 200; n += 10){
            long ti= System.currentTimeMillis();
            mul(n, 0);
            long tf = System.currentTimeMillis();
            a[i] = tf-ti;
            i++;
        }
        for(int j = 0; j < a.length; j++){
            System.out.println(a[j]);
        }    
    }
}