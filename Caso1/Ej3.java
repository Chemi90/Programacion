package Caso1;

public class Ej3 {

	public static void main(String[] args) {
		int fila;
		int num;

		for (fila = 1; fila < 10; fila++) {
			for (num = 1; num <= fila; num++) {
				System.out.print(fila + ",");
			}
			System.out.println("");
		}

	}

}