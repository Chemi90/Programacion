package Practica02ud06.Vehiculos;

import Practica02ud06.Color;

public class Motos extends Vehiculos{

	private int cilindrada;

	public Motos(int nRuedas, String marca, double kilometros, Color color, int cilindrada) {
		super(nRuedas, marca, kilometros, color);
		this.cilindrada = cilindrada;
	}

	public Motos() {
		super();
	}

	public Motos(int nRuedas, String marca, double kilometros, Color color) {
		super(nRuedas, marca, kilometros, color);
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motos [cilindrada=" + cilindrada + ", toString()=" + super.toString() + "]";
	}
	
	

	
}
