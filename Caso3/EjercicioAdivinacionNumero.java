package Caso3;

import java.util.Scanner;

public class EjercicioAdivinacionNumero {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int aux, intentos = 0, num, numadivinar;
		
		System.out.print("Introduce el rango desde el 1 al numero maximo que quieras: ");
		int rango = sc.nextInt();
		
		System.out.println("Prueba suerte para acertar el numero del 1 al " + rango + ".");
		numadivinar = (int) (Math.random() * rango + 1);
		
		System.out.print("¿Cuantas oportunidades quieres?: ");
		
		int contador = sc.nextInt();
		
		aux = contador;
		
		do {
			intentos = intentos + 1;
			System.out.print("Introduce tu intento numero " + intentos + ": ");
			num = sc.nextInt();
			if (num == numadivinar) {
				System.out.println("ACERTASTEEE CRUUUUUCK!!!!");
				contador = 1;
			}
			if (num > numadivinar) {
				System.out.println("Te has pasado, algo mas pequeño.");
			}
			if (num < numadivinar) {
				System.out.println("Uyyyy no llegas, algo mayor.");
			}
			contador = contador - 1;
		} while (contador > 0);
		if (aux == intentos && num!=numadivinar) {
			System.out.println("Inutiiiiiillllll.");
		}
		System.out.println("El numero a adivinar es el: " + numadivinar);
		sc.close();
	}

}
