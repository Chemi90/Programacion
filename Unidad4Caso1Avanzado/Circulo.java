package Unidad4Caso1Avanzado;

public class Circulo extends Punto {

	private double radio;

	public Circulo() {
		super(0,0);
		radio = 1;
	}

	public Circulo(Punto pto, double rad) {
		super(pto.getX(), pto.getY());
		radio = rad;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double radio() {
		return radio;
	}

	public void centro(Punto pto) {
		this.setX(pto.getX());
		this.setY(pto.getY());
	}

	public void radio(double rad) {
		radio = rad;
	}
	public Punto centro() {
		Punto p = new Punto(this.getX(),this.getY());
		return p;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", toString()=" + super.toString() + "]";
	}


	

}