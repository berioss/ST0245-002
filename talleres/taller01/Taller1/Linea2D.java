import java.util.Random;
import java.util.ArrayList;
public class Linea2D
{
    Punto puntoInicial;
    Punto puntoFinal;

    public Linea2D(Punto PI,Punto PF){
        puntoInicial=PI;
        puntoFinal=PF;
    }

    public ArrayList<Punto> puntosIntermedios(){
        double m=(puntoFinal.Y()-puntoInicial.Y())/(puntoFinal.X()-puntoInicial.X());
        double b=puntoInicial.Y()-m*puntoInicial.X();
        double d=puntoFinal.X()-puntoInicial.X();
        ArrayList<Punto> puntos = new ArrayList<>(1);
        puntos.add(puntoInicial);
        for(int i=1;i<d;i++){
            if(((puntoInicial.X()+i)*m+b)%1==0){
                puntos.add(new Punto(puntoInicial.X()+i,((puntoInicial.X()+i)*m+b)));
            }
        }
        puntos.add(puntoFinal);
        return puntos;

    }
}
