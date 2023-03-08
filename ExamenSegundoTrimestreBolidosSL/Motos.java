package ExamenSegundoTrimestreBolidosSL;

import Practica02ud06.Color;

public class Motos extends Vehiculo{

	private int cilindrada;

	//constructor con todos los datos incluidos los del padre
	public Motos(String matricula, Color color, boolean reservado, double precio, int cilindrada) {
		super(matricula, color, reservado, precio);
		this.cilindrada = cilindrada;
	}

	//constructor con solamente los datos de la clase motos
	public Motos(int cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}

	//metodos getter y setter
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	//metodo tostring llamando al tostring del metodo padre
	@Override
	public String toString() {
		return "Motos [cilindrada=" + cilindrada + ", toString()=" + super.toString() + "]";
	}
	
	
}
