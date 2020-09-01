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
