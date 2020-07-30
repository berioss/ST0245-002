
/**
 * Write a description of class Linea2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.Random;
import java.util.ArrayList;
public class Linea2D
{
    static Punto puntoInicial;
    static Punto puntoFinal;
    static ArrayList<Punto> puntos;

    public static ArrayList<Punto> Linea(Punto P1,Punto P2){
        Punto PI;
        Punto PF;
        if(P1.X()<=P2.X()){PI=P1;PF=P2;}
        else{PI=P2;PF=P1;}

        puntos=new ArrayList<>(0);
        puntos.add(PI);
        puntoInicial=PI;
        puntoFinal=PF;
        int h=(int)(puntoFinal.Y())-(int)(puntoInicial.Y());
        int v=(int)(puntoFinal.X())-(int)(puntoInicial.X());
        int dt;
        int d;
        int cambioV;
        int cambioH;
        if(v>=0)cambioV=1;
        else cambioV =-1;
        if(h>=0)cambioH=1;
        else cambioH =-1;
        h=Math.abs(h);
        v=Math.abs(v);
        int a=(h+v)-1;

        if(v>=h){
            dt=v-h;
                d=dt;
            for(int i=0;i<a;i++){
                
                if(v-dt/2>h){
                    puntos.add(new Punto(puntos.get(i).X()+cambioV,puntos.get(i).Y()));v--;}
                else if((v>h && v-dt/2==0) ){
                    puntos.add(new Punto(puntos.get(i).X()+cambioV,puntos.get(i).Y()));v--;}
                else{
                    puntos.add(new Punto(puntos.get(i).X(),puntos.get(i).Y()+cambioH));h--;}

            }
        }
        else{
            dt=h-v;
                d=dt;
            for(int i=0;i<a;i++){
                
                if(h-dt/2>v){
                    puntos.add(new Punto(puntos.get(i).X(),puntos.get(i).Y()+cambioH));h--;}
                else if((h>v && h-dt/2==0) ){
                    puntos.add(new Punto(puntos.get(i).X(),puntos.get(i).Y()+cambioH));h--;}
                else{
                    puntos.add(new Punto(puntos.get(i).X()+cambioV,puntos.get(i).Y()));h--;}
            }
        }

        puntos.add(PF);
        return puntos ;
    }
}

