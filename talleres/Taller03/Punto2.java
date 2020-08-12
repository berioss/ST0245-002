public class Punto2
{
    public static void adivinaLaContraseña(String prueba) { 
        password("", prueba);
    }

    private static void password(String cadena, String a) {
        if (a.length()== 0)
            System.out.println(cadena);
        else{
            for(int i = 0; i < a.length(); i++){
                String b = a.substring(0,i) + a.substring(i+1,a.length());
                password(cadena + a.charAt(i), b);
            }
        }
    }
}