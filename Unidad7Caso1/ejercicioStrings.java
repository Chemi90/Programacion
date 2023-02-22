package Unidad7Caso1;

import java.util.Scanner;

public class ejercicioStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a string: ");
	      String input = sc.nextLine();
	      StringBuffer sb = new StringBuffer(input);

	      // La cadena de caracteres en mayúsculas.
	      System.out.println("String en mayusculas: " + input.toUpperCase());

	      // La cadena de caracteres en minúsculas.
	      System.out.println("String en minusculas: " + input.toLowerCase());

	      // Los dos primeros caracteres de la cadena (solo en caso de que la longitud de esta sea de dos o más caracteres).
	      if (input.length() >= 2) {
	         System.out.println("Primeros dos caracteres: " + input.substring(0, 2));
	      } else {
	         System.out.println("El String es demasaido corto para mostrar los dos primeros caracteres.");
	      }

	      // Los dos últimos caracteres de la cadena (solo en caso de que la longitud de esta sea de dos o más caracteres).
	      if (input.length() >= 2) {
	         System.out.println("Dos ultimos caracteres: " + input.substring(input.length() - 2));
	      } else {
	         System.out.println("String es demasiado corto para mosotras los dos ultimos caracteres.");
	      }

	      // El número de ocurrencias en la cadena del último carácter.
	      int count = 0;
	      char lastChar = input.charAt(input.length() - 1);
	      for (int i = 0; i < input.length(); i++) {
	         if (input.charAt(i) == lastChar) {
	            count++;
	         }
	      }
	      System.out.println("Número de ocurrencias del último carácter: " + count);

	      // La cadena con todas las ocurrencias del primer carácter en mayúsculas.
	      char firstChar = input.charAt(0);
	      String replacedString = input.replace(firstChar, Character.toUpperCase(firstChar));
	      System.out.println("String con  todas  las  ocurrencias  del  primer  carácter  en mayúsculas: " + replacedString);

	      // La cadena con tres asteriscos por delante y por detrás.
	      System.out.println("String  con tres asteriscos por delante y por detrás: ***" + input + "***");

	      // La cadena invertida.
	      sb.reverse();
	      System.out.println("String invertido: " + sb.toString());

	}

}
