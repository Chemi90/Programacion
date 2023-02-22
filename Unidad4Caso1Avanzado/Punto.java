package Unidad4Caso1Avanzado;

public class Punto {

	private double x;
	private double y;

	public Punto() {
		x = 0;
		y = 0;
	}

	public Punto(double a, double b) {
		x = a;
		y = b;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


	public void x(double a) {
		x = a;
	}

	public void y(double a) {
		y = a;
	}

	public void trasladar(double a, double b) {
		x += a;
		y += b;
	}

	public String toString() {
		return "centro (" + x + ", " + y + ")";
	}

}
