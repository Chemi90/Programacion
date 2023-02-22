package Caso2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del triangulo:");
		
		int num = sc.nextInt();
		
		sc.close();
		
		for (int i=1;i<=num;i++) {
			for (int a=1;a<=num-i;a++) {
				System.out.print(" ");
			}
			for(int asteriscos=1; asteriscos<=(i); asteriscos++){
	            System.out.print("* ");
	        }
	        System.out.println();
		}

	}

}
