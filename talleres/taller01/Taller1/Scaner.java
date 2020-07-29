import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Scaner
{
    double  CY;
    double  CX;
    public Scaner(){
        int cont =0;
        Scanner scan = null;
        long a;

        int x=0;
        try {
            scan = new Scanner(new File("medellin_colombia-grande.txt"));
        } catch(FileNotFoundException fnfe) {
            System.err.println("Upsi");
            System.exit(1);
        }
        while(scan.hasNextLine()){     
            String linea = scan.nextLine();
            scan = new Scanner(linea);
            String b = "";
            int con = 0;
            for(int i = 0; i < linea.length(); i++){
                if(i==0){

                    b = linea.substring(0,linea.indexOf(" "));
                    a = Long.valueOf(b);
                    cont++;// bien

                }
                if( cont == 1){

                    x= (linea.substring(b.length()+1,linea.length())).indexOf(" ")+b.length();
                    b= linea.substring(b.length(),x);

                    CY = Double.valueOf(b);

                    con++;

                }
                if(cont == 2){

                    b= linea.substring(x+1,linea.length());

                    CX = Double.valueOf(b);

                    break;
                }
            }
            getCX();
            getCY();
        }

    }

    public double getCX(){
        return CX;
    }
    public double getCY(){
        return CY;
    }
}