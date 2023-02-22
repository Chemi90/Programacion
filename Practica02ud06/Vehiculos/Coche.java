package Practica02ud06.Vehiculos;

import Practica02ud06.Color;

public class Coche  extends Vehiculos{

	private int nPuertas;
	private boolean extra;
	
	public Coche(int nRuedas, String marca, double kilometros, Color color, int nPuertas, boolean extra) {
		super(nRuedas, marca, kilometros, color);
		this.nPuertas = nPuertas;
		this.extra = extra;
	}

	public Coche() {
		super();

	}

	public Coche(int nRuedas, String marca, double kilometros, Color color) {
		super(nRuedas, marca, kilometros, color);

	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public boolean isExtra() {
		return extra;
	}

	public void setExtra(boolean extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return "Coche [nPuertas=" + nPuertas + ", extra=" + extra + ", toString()=" + super.toString() + "]";
	}
	

	
	
}
