package ExamenSegundoTrimestreBolidosSL;

import Practica02ud06.Color;

public abstract class Vehiculo {

	private String matricula;
	private Color color;
	private boolean reservado;
	private double precio;
	
	//constructor con todos los campos
	public Vehiculo(String matricula, Color color, boolean reservado, double precio) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.reservado = reservado;
		this.precio = precio;
	}
	
	//constructor vacio
	public Vehiculo() {
		super();
	}

	//metodos getter y setter
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//metodo tostring para ver los datos de los vehiculos
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", reservado=" + reservado + ", precio="
				+ precio + "]";
	}
	
	
}
