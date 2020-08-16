
/**
 * Lee Vainas
 * 
 * @autor Brahyan Esteban Rios
 * @version 16/08/2020
 */import java.util.*;
import java.io.*;

public class leedor{
    public static ArrayList main(String direccionArchivo){
        ArrayList<String> array= new ArrayList<>();
        leedor l= new leedor();
        String a=l.leer(direccionArchivo);
        l.guardar(a,array);
        return array;
    }

    private String leer(String direccion){
        String texto = "";
        try{
            BufferedReader bf= new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead=bf.readLine()) != null){
                temp = temp + bfRead;
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encuentra archivo");
        }
        return texto;
    }

    private void guardar(String s,ArrayList array){

        if(s!=""){
            if(s.indexOf(";") != -1){
                array.add(s.substring(0,s.indexOf(";")));
                guardar(s.substring(s.indexOf(";")+1),array);}
            else array.add(s);

        }

    }

}
