package ExamenSegundoTrimestre;

import java.util.Arrays;

import Practica02ud06.Vehiculos.Vehiculos;

public class Cine {

	//atributos de la clase cine, en este caso he interpretado como un array de una sola posicion el array para las peliculas
	private Espectador[][] arrayE;
	private double precioEntrada;
	private Pelicula pelicula;
	
	//constructor en el que introducimos el numero de filas, columnas, precio de entrada y la clase de la pelicula
	public Cine(int filas, int columnas, double precioEntrada, Pelicula p1) {
		super();
		arrayE = new Espectador[filas][columnas];
		this.precioEntrada = precioEntrada;
		this.pelicula = p1;
	}

	//constructor vacio para poder usar los constructores de sus clases hijas sin tener que poner datos de cine
	public Cine() {
		super();
	}


	//metodos getter y setter
	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	//metodo para mostrar asientos
	private void mostrarAsiento() {
		for (int i =0;i<arrayE.length;i++) {
			for (int j=0;j<arrayE.length;j++) {
				if (arrayE[i][j] != null) {System.out.println("El asiento en la fila " + i+ " que esta en la columna " + j +" esta ocupado.");
				System.out.println(arrayE[i][j]);
				}
				else System.out.println("El asiento en la fila " + i+ " que esta en la columna " + j +" esta libre.");
			}
		}
	}
	
	//metodo para asignar los asientos, cumpliendo si tiene o no dinero suficiente
	private boolean asignarAsiento(Espectador e) {
		for (int i =0;i<arrayE.length;i++) {
			for (int j=0;j<arrayE.length;j++) {
				double dinero = 0;
				dinero=e.getDineroDisponible()-precioEntrada;
				if (arrayE[i][j] == null && dinero >= 0) { arrayE[i][j] = e; 
				return true;
				}
			}
		}
		return false;
	}
	
	//metodo en el que se vende la entrada si cumple el metodo asignarAsiento y si cumple la edad y hay asientos libres
	public void venderEntrada (Espectador e) {
		int edad = e.getEdad()-pelicula.getEdadMinima();
		for (int i =0;i<arrayE.length;i++) {
			for (int j=0;j<arrayE[i].length;j++) {
				if (arrayE[i][j] == null && edad>=0 && asignarAsiento(e)==true) {arrayE[i][j]=e;
				i=arrayE.length-1;
				j=arrayE.length-1;
				}
			}
		}
	}

	//metodo tostring en el que llamamos al metodo mostrar asiento
	@Override
	public String toString() {
		mostrarAsiento();
		return "Cine ["+ ", precioEntrada=" + precioEntrada + ", pelicula=" + pelicula +"]";
	}
	
	
}
