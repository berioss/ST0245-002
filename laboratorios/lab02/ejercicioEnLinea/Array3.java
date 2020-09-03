public int maxSpan(int[] nums) {
  int maxabs=0;//C
  int maxloc=0;//C
  for (int i=0;i<nums.length;i++){//C
    maxabs=Math.max(maxabs,maxloc);//T(n)=C*n
    for(int j=i;j<nums.length;j++){//T(n)=C*n
      if(nums[i]==nums[j])maxloc=j-i+1//T(n)=C*n*n
    
  }
  
}
maxabs=Math.max(maxabs,maxloc);//C
return maxabs;
}
//Calculo de Complejidad
// n es el numero de elementos del arreglo
// ignoramos las constantes
// O(C*n+C*n+C*n*n) Por regla de la suma
// O(n*n*C) Por reglade la multiplicacion
// O(n^2)

public int[] fix34(int[] nums) {
  for(int a=0;a<2;a++){     //C
    for(int i=0;i<nums.length-1;i++){        //C*2
      if(nums[i]==4){           //C*2*n
        int temp=nums[nums.length-1];    //C*m*2
        nums[nums.length-1]=nums[i];    //C*m*2
        nums[i]=temp;  //C*m*2
      }
      if(nums[i]==3){    //C*n*2
        for(int j=i+1;j<=nums.length-1 ;j++){  //C*2*k
          if(nums[j]==4){  //C*k*2*n
            int temp=nums[i+1];  //C*k*2
            nums[i+1]=nums[j];  //C*k*2
            nums[j]=temp;  //C*k*2
            i++; //C*2*k
            break; //C*2*k
        }
        }
      }
      }
  }
 return nums;
}
//Calculo de Complejidad
// n es el numero de elementos del arreglo, m es el numero de 4's del arreglo y k es el numero de 3's del arreglo
// ignoramos las constantes
// O(3(C*m*2)+2(C*n*2)+6(C*2*k)+(C*k*2*n)) Por regla de la multiplicacion 
// O((C*m*2)+(C*n*2)+(C*2*k)+(C*k*2*n)) Por reglade la suma; sabemos que n>=m y n>=s ya que m y s son subconjuntos de n 
// O(C*k*2*n) regla de la multiplicacion 
// O(k*n) en el peor de los casos k=n
// O(n^2)
