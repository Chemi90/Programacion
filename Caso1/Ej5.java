package Caso1;

public class Ej5 {

	public static void main(String[] args) {
		int num;
		System.out.println("1 es primo");
		int contador = 1;
		int veces = 0;
		for (num = 2; num <= 100; num++) {
			veces = 0;
			for (int aux = 1; aux <= num; aux++) {
				if (num % aux == 0)
					veces++;
			}
			if (veces == 2) {
				System.out.println(num + " es primo");
				contador++;
			}
		}
		System.out.println("Hay " + contador + " numeros primos desde el 1 hasta el 100");

	}

}

//ESTA MAL HACERLO BIEN
