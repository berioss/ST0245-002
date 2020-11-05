
public class Punto {

	private double X;
	private double Y;
	private int ID;
	private String NOMBRE;

	public Punto(int id, double x, double y, String nombre) {
		ID = id;
		NOMBRE = nombre;
		X = x;
		Y = y;
	}

	public double getX() {
		return X;
	}

	public double getY() {
		return Y;
	}

	public int getID() {
		return ID;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}
}
