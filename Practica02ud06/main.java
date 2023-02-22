package Practica02ud06;

import Practica02ud06.Garaje.Garaje;
import Practica02ud06.Vehiculos.Coche;
import Practica02ud06.Vehiculos.Motos;

public class main {

	public static void main(String[] args) {
		
		Garaje garaje = new Garaje(20, 5);
		
		Coche c1 = new Coche( 3, "Mercedes", 12000, Color.AZUL, 5, true);
		
		Motos m1 = new Motos(2, "Yamaha", 5000, Color.AZUL, 49);
		
		
		
		garaje.introducirVehiculo(c1);
		garaje.introducirVehiculo(m1);
		
		garaje.hueco();
		System.out.println(garaje.toString());
		
		System.out.println(garaje.cantidadVehiculos());
		
		garaje.sacarPrecioRueda();
		garaje.kilometrosMedia();
		
		garaje.sacarVehiculo(0);
		
		System.out.println(garaje.cantidadVehiculos());
		
		System.out.println(garaje.toString());
		

	}

}
