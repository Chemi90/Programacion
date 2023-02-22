package Unidad5Caso2;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notaMedia = 0;

		// Introducimos el numero de alumnos
		System.out.print("Introduce el numero de alumnos: ");
		int i;
		i = sc.nextInt();

		// creamos el array para las notas
		double[] notas = new double[i];

		// bucle para introducir las notas en el array
		for (i = 0; i < notas.length; i++) {
			System.out.print("Introduce la nota del alumno " + i + ": ");
			double n;
			n = sc.nextDouble();
			notas[i] = n;
		}

		// bucle para sacar sumar todas las notas
		for (i = 0; i < notas.length; i++) {
			notaMedia = notas[i] + notaMedia;
		}
		// aqui dividimos todas las notas entre la cantidad de alumnos
		notaMedia = notaMedia / i;
		System.out.println("La nota media es: " + notaMedia);

		// Bucle para ver que alumno supera la nota media
		for (i = 0; i < notas.length; i++) {
			if (notas[i] > notaMedia)
				System.out.println("El alumno numero " + i + " supera la nota media.");
		}

		sc.close();
	}

}
