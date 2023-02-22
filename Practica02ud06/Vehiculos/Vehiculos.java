package Practica02ud06.Vehiculos;

import Practica02ud06.Color;

public class Vehiculos {

	private int nRuedas;
	private String marca;
	private double kilometros;
	private Color color;
	
	
	public Vehiculos(int nRuedas, String marca, double kilometros, Color color) {
		super();
		this.nRuedas = nRuedas;
		this.marca = marca;
		this.kilometros = kilometros;
		this.color = color;
	}


	public Vehiculos() {
		super();
	}


	public int getnRuedas() {
		return nRuedas;
	}


	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getKilometros() {
		return kilometros;
	}


	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Vehiculos [nRuedas=" + nRuedas + ", marca=" + marca + ", kilometros=" + kilometros + ", color=" + color
				+ "]";
	}
	
	
	
}
