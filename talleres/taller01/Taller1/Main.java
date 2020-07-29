public class Main {
    public static void main(String[] args) {
        Punto punto = new Punto(-1, 1);
        System.out.println("Punto: {"+punto.X()+","+punto.Y()+"}");
        System.out.println("Radio Polar: " + punto.radioPolar());
        System.out.println("Angulo Polar: " + Math.toDegrees(punto.anguloPolar()));
        System.out.println("Distancia: " + punto.distanciaEuclidiana(new Punto(5,8)));
        System.out.println();
        Fecha fecha1 = new Fecha(1, 8, 2017);
        Fecha fecha2 = new Fecha(2, 5, 2016);
        System.out.println(fecha1.dia()+"/"+fecha1.mes()+"/"+fecha1.anyo());
        System.out.println(fecha2.dia() + "/" + fecha2.mes() + "/" + fecha2.anyo());
        System.out.println(fecha1.comparar(fecha2));
    }
}