package Examen;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aux1, aux2, aux3, aux4, num1, num2;

		System.out.print("Escribe el primer numero entero: ");
		num1 = sc.nextInt();
		System.out.print("Escribe el segundo numero entero: ");
		num2 = sc.nextInt();
		aux1 = num1;
		aux2 = num2;
		aux3 = num1;
		aux4 = num2;
		do {
			if (aux2 > 10) {
				aux2 = aux2 - 10;
			}

			if (aux1 > 10) {
				aux1 = aux1 - 10;
			}

		} while (!(aux1 < 10 && aux2 < 10));

		do {
			if (aux3 > 10) {
				aux3 =Math.round( aux3 / 10);
			}

			if (aux4 > 10) {
				aux4 = Math.round(aux4 / 10);
			}

		} while (!(aux3 < 10 && aux4 < 10));
		
		/*System.out.println(aux1 + " " + aux2 + " " + aux3 + " " +aux4);*/
		
		if (aux1 == aux2 && aux3 == aux4) {
			System.out
					.println("El numero " + num1 + " y el numero " + num2 + " terminan y empiezan en la misma cifra, el " + aux3 + " y el " + aux1);
		} else {
			System.out.println(num1 + " y " + num2 + " no terminan y empiezan en la misma cifra.");
		}
		
		sc.close();

	}

}
