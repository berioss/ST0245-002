public class P1s1
{
    public static void main(String[] args){
        String adn1 = "acb";
        String adn2 = "abc";
        for(int i = 0; i < 20; i++){
            adn1 += "ac";
            adn2 += "ab";
            long ti = System.currentTimeMillis();
            subCadena2(adn1, adn2, adn1.length(), adn2.length());
            long tf = System.currentTimeMillis();
            System.out.println(tf - ti);
        }
    }

    public static int subCadena2(String str1, String str2, long len1, long len2){
        if(len1 == 0 || len2 == 0)
            return 0;
        if(str1.charAt((int)len1-1) == str2.charAt((int)len2-1))
            return 1 + subCadena2(str1, str2, len1-1, len2-1);
        else{
            int a = subCadena2(str1, str2, len1-1, len2);
            int b = subCadena2(str1, str2, len1, len2-1);
            return Math.max(a,b);
        }
    }
    //Este codigo fue basado en el codigo presentado en la clase del Martes
    //En verdad ya tenia esta misma estructura de codigo, solo que me confundi
    //y pense que el metodo debia retornar la subcadena, y no solo su longitud
}