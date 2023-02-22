package Caso3;

import java.math.*;
import java.util.Scanner;

public class EjercicioPiedraPapelTijera {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int eleccion, enemigo, jugador = 0, pc = 0;

		System.out.println("Elige un arma:");
		System.out.println("0.- Piedra.");
		System.out.println("1.- Papel.");
		System.out.println("2.- Tijeras.");
		do {
			eleccion = sc.nextInt();
			enemigo = (int) (Math.floor(Math.random() * 3) + 1);
			switch (eleccion) {
			case 0:
				switch (enemigo) {
				case 1:
					System.out.println("Has jugado Piedra y tu enemigo tambien, habeis empatado.");
					break;
				case 2:
					System.out.println("Has jugado Piedra y tu enemigo Papel, has perdido.");
					pc = pc + 1;
					break;
				case 3:
					System.out.println("Has jugado Piedra y tu enemigo Tijeras, has ganado.");
					jugador = jugador + 1;
					break;
				}
				break;
			case 1:
				switch (enemigo) {
				case 1:
					System.out.println("Has jugado Papel, y tu enemigo Piedra, has ganado.");
					jugador = jugador + 1;
					break;
				case 2:
					System.out.println("Has jugado Papel, y tu enemigo tambien, habeis empatado.");
					break;
				case 3:
					System.out.println("Has jugado Papel, y tu enemigo Tijeras, has perdido.");
					pc = pc + 1;
					break;
				}
				break;
			case 2:
				switch (enemigo) {
				case 1:
					System.out.println("Has jugado Tijeras, y tu enemigo Piedra, has perdido.");
					pc = pc + 1;
					break;
				case 2:
					System.out.println("Has jugado Tijeras, y tu enemigo Papel, has ganado.");
					jugador = jugador + 1;
					break;
				case 3:
					System.out.println("Has jugado Tijeras, y tu enemigo tambien, habeis empatado.");
					break;
				}
				break;
			}
		} while (!(jugador == 3 || pc == 3));
		System.out.println(
				"El recuento total ha sido, jugador: " + jugador + " puntos y el ordenador: " + pc + " puntos.");
	}

}
