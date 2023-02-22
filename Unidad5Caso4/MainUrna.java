package Unidad5Caso4;

import java.util.Scanner;

public class MainUrna {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el numero de bolas blancas para introducir en la urna: ");
		int blancas = sc.nextInt();
		System.out.print("Introduce el numero de bolas negras para introducir en la urna: ");
		int negras = sc.nextInt();
		Urna urna1 = new Urna(blancas, negras);
		Color bola1, bola2;

		System.out.println();
		while (urna1.totalBolas() > 1) {
			bola1 = urna1.bola();
			System.out.println("Saco bola de color: " + bola1);
			bola2 = urna1.bola();
			System.out.println("Saco bola de color: " + bola2);

			if (bola1 == bola2) {
				urna1.ponerBlanca();
				System.out.println("Añado una bola blanca.");
			} else {
				urna1.ponerNegra();
				System.out.println("Añado una bola negra.");
			}
			System.out
					.println("Quedan " + urna1.getBlanca() + " bolas blancas, y " + urna1.getNegra() + " bolas negras");
			System.out.println();
		}
		System.out.println("La ultima bola es de color: " + urna1.bola());
	}
}
