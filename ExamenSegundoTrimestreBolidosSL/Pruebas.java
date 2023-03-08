package ExamenSegundoTrimestreBolidosSL;

import Practica02ud06.Color;

public class Pruebas {

	public static void main(String[] args) {
	
		Concesionario con1 = new Concesionario("Bolidos S.L.", "Calle abajo", 965412387, 6);

		Coches c1 = new Coches("5557GCX", Color.GRIS, false, 15000, 5, true);
		Coches c2 = new Coches("8534RFG", Color.AZUL, false, 25000, 5, false);
		Coches c3 = new Coches("0000BBB", Color.ROJO, false, 35000, 5, false);
		
		Motos m1 = new Motos("1234CCC", Color.BLANCO, true, 3000, 125);
		Motos m2 = new Motos("8469TGB", Color.NEGRO, true, 12000, 1000);

		con1.introducirVehiculo(c1);
		con1.introducirVehiculo(c2);
		con1.introducirVehiculo(c3);
		con1.introducirVehiculo(m1);
		con1.introducirVehiculo(m2);
		
		System.out.println(con1);
		
		System.out.println("\n\n\n");
		
		con1.reserva(c1);
		con1.reserva(c2);
		
		System.out.println(con1);

		
	}

}
