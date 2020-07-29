import java.lang.Math;

public class Punto
{
    private double x;
    private double y;
    public Punto(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double X(){
        return x;
    }

    public double Y(){
        return y;
    }

    public double radioPolar(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2.0));
    }

    public double anguloPolar(){
        return Math.atan(y/x);
    }

    public double distanciaEuclidiana(Punto otro){
        return Math.sqrt(Math.pow(x-otro.X(),2) + Math.pow(y-otro.Y(),2.0));
    }
}
