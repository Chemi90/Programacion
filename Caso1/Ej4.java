package Caso1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		System.out.println("Introduce un mes:");
		Scanner sc = new Scanner(System.in);
		String mes = sc.nextLine();
		mes = mes.toLowerCase();
		switch (mes) {
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
			System.out.println(mes + " tiene 31 d�as");
			break;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			System.out.println(mes + "tiene 30 d�as");
			break;
		case "febrero":
			System.out.println(mes + "tiene 28 � 29 d�as");
			break;
		default:
			System.out.println(mes + "no es un mes valido");
		}
		sc.close();

	}

}
