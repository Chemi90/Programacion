package Practica02ud06.Garaje;

import Practica02ud06.Vehiculos.Vehiculos;

public class Garaje {

	// atributos
	private int Precioruedas;
	private int capacidadVehiculos;
	private Vehiculos[] array;

	// constructor
	public Garaje(int precioruedas, int capacidadVehiculos) {
		super();
		Precioruedas = precioruedas;
		this.capacidadVehiculos = capacidadVehiculos;
		array = new Vehiculos[capacidadVehiculos];
	}

	// metodos getter y setter
	public int getRuedas() {
		return Precioruedas;
	}

	public void setRuedas(int ruedas) {
		this.Precioruedas = ruedas;
	}

	public int getCapacidadVehiculos() {
		return capacidadVehiculos;
	}

	public void setCapacidadVehiculos(int capacidadVehiculos) {
		this.capacidadVehiculos = capacidadVehiculos;
	}

	public void hueco() {

		for (int i = 0; i < capacidadVehiculos; i++) {
			if (array[i] == null)
				System.out.println("El hueco " + i + " esta vacio.");
			else
				System.out.println("El hueco " + i + " esta ocupado");
		}
	}

	public void introducirVehiculo(Vehiculos v1) {

		for (int i = 0; i < capacidadVehiculos; i++) {
			if (array[i] == null) {
				array[i] = v1;
				i=capacidadVehiculos;
			}
		}
	}

	public void sacarVehiculo(int index) {
		array[index] = null;
	}

	public void sacarPrecioRueda() {

		double precioTotal = 0;
		double aux = 0;
		for (int i = 0; i < capacidadVehiculos; i++) {
			if (array[i] != null) {
				precioTotal = array[i].getnRuedas() * Precioruedas;
				aux = precioTotal + aux;
			}
		}
		System.out.print("El precio total de todas las ruedas a cambiar es: " + aux + "€\n");

	}

	public int cantidadVehiculos() {
		
		int cantidad = 0;
		for(int i = 0;i<capacidadVehiculos;i++) {
			if (array[i] != null) cantidad++;
		}
		System.out.print("La cantidad de vehiculos dentro es: ");
		return cantidad;
	}
	public void kilometrosMedia() {

		double kmMedia, kmTotal = 0, contador = 0;

		for (int i = 0; i < capacidadVehiculos; i++) {
			if (array[i] != null) {
				kmTotal = array[i].getKilometros() + kmTotal;
				contador++;
			}
		}
		kmMedia = kmTotal / contador;
		System.out.print("La media de los kilometros es: " + kmMedia+"km\n");

	}

	@Override
	public String toString() {
		for (int i = 0; i < capacidadVehiculos; i++) {
			if (array[i] != null)
				System.out.println(array[i].toString());
		}
		;
		return "";
	}

}
