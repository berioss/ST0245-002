
import java.util.*;
import java.io.*;

public class crearMapa{
    @SuppressWarnings("resource")
	public static mapa main(String direccion) {
        ArrayList<ArrayList<Integer>> grafo = new ArrayList<>();
        ArrayList<Punto> puntos = new ArrayList<>();
        float p = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            Scanner scan;
            bfRead = bf.readLine();
            scan = new Scanner(bfRead);
            p = Float.parseFloat(scan.nextLine().substring(2));

            while ( !((scan = new Scanner(bfRead)).hasNextInt())) {
                bfRead = bf.readLine();
            }

            while (!bfRead.equals("") ){

                scan = new Scanner(bfRead);
                int id=scan.nextInt(); 
                double x=Float.parseFloat(scan.next());
                double y=Float.parseFloat(scan.next());
                String nombre=scan.nextLine();
                Punto pun = new Punto(id, x, y,nombre);
                puntos.add(pun);
                bfRead = bf.readLine();

            }
            grafo.add(new ArrayList<Integer>());
            while (!((scan = new Scanner(bfRead)).hasNextInt())) {
                bfRead = bf.readLine();
            }
            while (!bfRead.equals("")) {

                scan= new Scanner(bfRead);
                int temp1 = scan.nextInt();
                int temp2 = scan.nextInt();
                grafo.get(temp1-1).add(scan.nextInt());
                if(temp2==puntos.size()){
                    grafo.add(new ArrayList<Integer>());
                }
                bfRead = bf.readLine();
                if(bfRead==null)break;
            }

        } catch (

        Exception e) {
            System.err.println("No se encuentra archivo");
        }
        mapa m = new mapa(p, grafo);
        return m;
    }
}

