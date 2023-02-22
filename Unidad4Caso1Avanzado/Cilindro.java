package Unidad4Caso1Avanzado;

public class Cilindro extends Circulo {

	private double altura;

	public Cilindro() {
		altura = 1;
	}

	public Cilindro(Circulo base, double alt) {
		super(base.centro(),base.getRadio());
		altura = alt;
	}


	public double getAltura() {
		return this.altura;
	}


	public void setAltura(double alt) {
		this.altura = alt;
	}

	public void base(Circulo base) {
		this.setRadio(getRadio());
		this.centro(new Punto(this.getX(),this.getY()));
	}


	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", toString()=" + super.toString() + "]";
	}
	
	
	
}