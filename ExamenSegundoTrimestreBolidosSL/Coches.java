package ExamenSegundoTrimestreBolidosSL;

import Practica02ud06.Color;

public class Coches extends Vehiculo{

	private int plazas;
	private boolean extras;
	
	//constructor con todos los datos incluidos los del padre
	public Coches(String matricula, Color color, boolean reservado, double precio, int plazas, boolean extras) {
		super(matricula, color, reservado, precio);
		this.plazas = plazas;
		this.extras = extras;
	}
	
	//constructor con solamente los datos de la clase coche
	public Coches(int plazas, boolean extras) {
		super();
		this.plazas = plazas;
		this.extras = extras;
	}
	
	//metodos getter y setter
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public boolean isExtras() {
		return extras;
	}
	public void setExtras(boolean extras) {
		this.extras = extras;
	}
	
	//metodo tostring llamando al tostring del metodo padre
	@Override
	public String toString() {
		return "Coches [plazas=" + plazas + ", extras=" + extras + ", toString()=" + super.toString() + "]";
	}
	
	
}
