package ExamenSegundoTrimestreBolidosSL;

import ExamenSegundoTrimestre.Espectador;
import Practica02ud06.Vehiculos.Vehiculos;

public class Concesionario {

	private String nombre;
	private String direccion;
	private int telefono;
	private Vehiculo[] array;
	
	//constante para definir el tamaño del concesionario
	final int capacidad;
	
	//constructor
	public Concesionario(String nombre, String direccion, int telefono, int tamaño) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		capacidad = tamaño;
		array = new Vehiculo[capacidad];
	}
	
	//metodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	//aqui ponemos la restriccion para el telefono
	public void setTelefono(int telefono) {
		if (telefono >= 0 && telefono <= 999999999) {
            this.telefono = telefono;
        } else {
            System.out.println("El número debe estar entre 0 y 999999999.");
        }
	}
	
	//metodo para introducir vehiculos
	public void introducirVehiculo(Vehiculo v1) {
		for (int i = 0; i < capacidad; i++) {
			if (array[i] == null) {
				array[i] = v1;
				i=capacidad;
			}
		}
	}
	
	//metodo para visualizar las plazas del concesionario
	private void mostrarConcesionario() {
		for (int i =0;i<array.length;i++) {
				if (array[i] != null) {System.out.println("El hueco " + i + " esta ocupado con el vehiculo: ");
				System.out.println(array[i]);
				}
				else System.out.println("El hueco " + i + " esta libre");
			}
	}
	
	//metodo con el que reservo los vehiculos
	public void reserva(Vehiculo v1) {
		v1.setReservado(true);
	}


	//to string para visualizar los datos del concesionario
	@Override
	public String toString() {
		mostrarConcesionario();
		return "Concesionario [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", capacidad=" + capacidad + "]";
	}
	
	
	
}
