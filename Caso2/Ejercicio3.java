package Caso2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la cantidad de numeros a comparar y calcular: ");

		int num = sc.nextInt();
		int aux = num, pares = 0, contPares = 0, mayorq = 0, menorq = 0,aux2=1;

		int array[] = new int[50];

		// INTRODUCIMOS LOS NUMEROS AL ARRAY
		num = 0;
		do {
			System.out.print("Introduce el numero " + aux2 + ": ");
			array[num] = sc.nextInt();
			num++;
			aux2++;
		} while (num < aux);

		// HALLAMOS EL MAYOR Y MENOR DE TODOS
		num = 0;
		mayorq=array[num];
		menorq=array[num];
		do {
			if (mayorq < array[num])
				mayorq = array[num];
			if (menorq > array[num])
				menorq = array[num];
			num++;
		} while (aux > num);

		// HALLAMOS LA MEDIA DE LOS NUMEROS PARES
		num = 0;
		do {
			if (array[num] % 2 == 0) {
				pares = array[num] + pares;
				contPares++;
			}
			num++;
		} while (aux > num);

		// ESCRIBIMOS LOS RESULTADOS
		System.out.println("El numero mayor introducido es el: " + mayorq);
		System.out.println("El numero menor instroducido es el: " + menorq);
		System.out.println("La media de los numeros pares es: " + Math.round(pares / contPares));

		sc.close();
	}

}
