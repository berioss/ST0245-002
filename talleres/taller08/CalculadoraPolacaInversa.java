import java.util.Stack;
public class CalculadoraPolacaInversa
{
    public static int calculadora(String a){
        Stack<Integer> calculador = new Stack<>();
        calculador = calcular(a, a.length(), calculador);
        return calculador.peek();
    }    

    private static Stack<Integer> calcular(String a,int len, Stack<Integer> memoria){
        if(a.length() < len){
            if(Character.isDigit(a.charAt(0))){
                memoria.push(Integer.valueOf(a));
                return memoria;
            }
            else{
                int num1 = memoria.peek();
                memoria.pop();
                int num2 = memoria.peek();
                memoria.pop();
                int result = 0;
                switch(a.charAt(0)){
                    case '+':
                    result = num2 + num1;
                    break;
                    case '-':
                    result = num2 - num1;
                    break;
                    case '*':
                    result = num2 * num1;
                    break;
                    case '/':
                    result = num2 / num1;
                    break;
                    default:
                    System.out.println("Ocurrio un error");
                }
                memoria.push(result);
                return memoria;
            }
        }
        int s1 = -1, s2 = -1;
        int temp1 = a.indexOf(" ");
        memoria.push(Integer.valueOf(a.substring(0, temp1)));
        for(int i = temp1; i < a.length()-1; i++){
            if(a.charAt(i) == ' ' && (s1 == -1 || s2 == -1)){//El substring(''+1, '')
                if(s1 == -1)
                    s1 = i;
                else{
                    s2 = i;
                    String b = a.substring(s1+1, s2);
                    i = s2-1;
                    s1 = s2 = -1;
                    memoria = calcular(b, a.length(), memoria);
                }
            }
        }
        return calcular(a.charAt(a.length()-1)+"", a.length(), memoria);
    }
}