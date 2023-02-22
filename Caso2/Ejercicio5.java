package Caso2;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		GregorianCalendar calendar = new GregorianCalendar();

		System.out.print("Intorduce el a�o a mirar si es bisiesto: ");
		
		int anio = sc.nextInt();
		sc.close();
		
		
		
		//CON LA FUNCION DEL CALENDARIO GREGORIANO
		if (calendar.isLeapYear(anio))
			System.out.println("El a�o es bisiesto");
		else
			System.out.println("El a�o no es bisiesto");
		
		
		
		//CON LOS CONDICIONALES
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El a�o es bisiesto");
		else
			System.out.println("El a�o no es bisiesto");

	}

}
