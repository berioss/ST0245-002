public int countEvens(int[] nums) {
  int cont=0; //C_1
  for(int i=0;i<nums.length;i++){ //C_2
    if(nums[i]%2==0)cont++;T(n)=C_3*n
    
  }
  return cont;// C_4
}
//Complejidad del Algoritmo
//O(C_1+C_2+C_3*n+C_4)   Regla suma
//O(C_3*n)        Regla multiplicacion
//O(n) n es el numero de elementos del arreglo

public String[] fizzBuzz(int start, int end) {
  String array[]= new String[end-start];//C_1
  for(int i=0;i<end-start;i++){//C_2
  
  if((start+i)%3==0||(start+i)%5==0){//C_3*n
    if((start+i)%3==0)array[i]="Fizz";//C_4*n
    if((start+i)%5==0)array[i]="Buzz";//C_5*n
    if((start+i)%5==0&&(start+i)%3==0)array[i]="FizzBuzz";//C_6*n
    
  }
  else array[i]=String.valueOf(start+i);//C

  }
  return array;
}
//Complejidad del Algoritmo
//O(C_1+C_2+C_3*n+C_4*n+C_5*n+C_6*n)   Regla suma
//O(C_6*n)        Regla multiplicacion
//O(n)            n es el resultado de (end-start)

public int[] zeroMax(int[] nums) {
  int array[]=new int[nums.length];//C_1
  int temp=0;//C_2
  int i=0,j=0;//C_3
  for(;j<nums.length-1;i++){//C_4
    if(nums[i]!=0 && i==j){array[j]=nums[i];j++;}//C_5*n
    else {
      if(i==j && (nums[i]%2)==1)array[j]=nums[i];//C_6*n*m,C_6=6
       
      if((nums[i]%2)==1)array[j]=Math.max(array[j],nums[i]);//C_7*n*m,C_7=5
     }
    if(i==nums.length-1){i=j;j++;}//C_8*n*m,C_8=5
  }
  if(nums.length>=1)array[nums.length-1]=nums[nums.length-1];//C_9
  return array;
}
//Complejidad del Algoritmo
//O(C_1 + C_2 + C_3*n + C_4 + C_5*n + C_6*n*m + C_7*n*m + C_8n*m + C_9)   Regla suma
//O(C_6*n*m)        Regla multiplicacion
//O(n*m)            n el tamaño del el arreglo y m el numero de "0"s del arreglo 


public boolean more14(int[] nums) {
  int c1=0;//C_1
  int c4=0;//C_2
  for(int i=0;i<nums.length;i++){//C_3
    if(nums[i]==1)c1++;//4*n
    if(nums[i]==4)c4++;//4*n
  }
  return c1>c4;//C_4
}
//Complejidad del Algoritmo
//O(C_1 + C_2 + 2*n + 2*n + C_4)   Regla suma
//O(2*n)        Regla multiplicacion
//O(n)          n es numero de elementos del arreglo

public int centeredAverage(int[] nums) {
  
  int max=-1000;int min=1000;int cmax=1;int cmin=1;int total=0;//C
  
  for(int i=0;i<nums.length;i++){//C
    
  max=Math.max(max,nums[i]);  //C*n
  min=Math.min(min,nums[i]);  //C*n
  
  }
  for(int i=0;i<nums.length;i++){//C
   if(nums[i]==min && cmin<=0)total=total+nums[i];//C
   if(nums[i]==min)cmin--;//C*m
   if(nums[i]==max && cmax<=0)total=total+nums[i];//C
   if(nums[i]==max)cmax--;//C*k
   if(nums[i]!=max && nums[i]!=min)total=total+nums[i];//C*n
  }
  return total/(nums.length-2);//C
}
//Complejidad del Algoritmo
// n es el numero de elementos del arreglo, m es la cantidad de numeros en el arreglo iguales al minimo y --
//-- analogamente k es la cantidad de numeros en el arreglo iguales al maximo. k y m simpre seran menores o iguales a n, por lo tanto n es el mayor
// Ignoramos las Constantes solas
//O(C*n+C*m+C*k)        Regla multiplicacion
//O(n)          n es numero de elementos del arreglo

