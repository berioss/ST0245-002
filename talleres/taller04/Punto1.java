
public class Punto1
{
    public static int maximo(int[] nums, int start){
    	if(start == nums.length-1)//C1
return nums[start];//T(n)=C1+C2
    	else return Math.max(nums[start],maximo(nums,start+1));//T(n)=C3+T(n-1)
        
    }

    public static void main(String[] args){
    	for(int i=5000;i<=5020;i++) {
        long ti = System.currentTimeMillis();
      	maximo(new int[i], 0);
        long tf = System.currentTimeMillis();
        System.out.println(tf - ti);
    	}
    	
    }
    }
   
    	
