public class P1s1
{
    public static void main(String[] args){
        String adn1 = "abcdefg";
        String adn2 = "acedfag";
        for(int i = 0; i < 20; i++){
            adn1 += "g";
            long ti = System.currentTimeMillis();
            invertir(subCadena2(adn1, adn2, adn1.length(), adn2.length()));
            long tf = System.currentTimeMillis();
            System.out.println(tf - ti);
        }
    }

    public static String subCadena2(String str1, String str2, long len1, long len2){
        if(len1 == 0 || len2 == 0)
            return "";
        if(str1.charAt((int)len1-1) == str2.charAt((int)len2-1))
            return str1.charAt((int)len1-1) + subCadena2(str1, str2, len1-1, len2-1);
        else{
            String a = subCadena2(str1, str2, len1-1, len2);
            String b = subCadena2(str1, str2, len1, len2-1);
            return Math.max(a.length(), b.length()) == a.length() ? a : b;
        }
    }

    private static String invertir(String a){
        if(a.length() <= 1)
            return a;
        return invertir(a.substring(1)) + a.charAt(0);
    }
}