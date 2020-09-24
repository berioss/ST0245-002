import java.util.Stack;
public class CalculadoraPolacaInversa
{
    public static int calculadora(String a){
        return calcular(a, a.length(), new Stack<>());
    }

    private static int calcular(String a,int len, Stack<Integer> memoria){
        if(a.length() < len){
            if(Character.isDigit(a.charAt(0)))
                return Integer.valueOf(a);
            else{
                int num1 = memoria.pop();
                int num2 = memoria.pop();
                switch(a){
                    case "+": return num2 + num1;
                    case "-": return num2 - num1;
                    case "*": return num2 * num1;
                    case "/": return num2 / num1;
                    default:
                    System.out.println("Eso no es una operacion");
                }
            }
        }
        String[] s = a.split(" ");
        for(String c : s){
            memoria.push(calcular(c, a.length(), memoria));
        }
        return memoria.pop();
    }
}