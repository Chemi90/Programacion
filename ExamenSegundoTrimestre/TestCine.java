package ExamenSegundoTrimestre;

import Practica02ud06.Garaje.Garaje;

public class TestCine {

	public static void main(String[] args) {

		Pelicula p1 = new Pelicula("Frozen", 150, 0, "Stallone");		
		Cine c1 = new Cine(8,8, 4, p1);
		
				
		Espectador e1 = new Espectador("Paco", 25, 50);
		Espectador e2 = new Espectador("Chemi", 32, 150);
		Espectador e3 = new Espectador("Alejandra", 29, 10);
		Espectador e4 = new Espectador("Alejandro", 19, 30);
		Espectador e5 = new Espectador("Jon", 36, 5);
		
		c1.venderEntrada(e1);
		c1.venderEntrada(e2);
		c1.venderEntrada(e3);
		c1.venderEntrada(e4);
		c1.venderEntrada(e5);
		
		System.out.println(c1);
	}

}
