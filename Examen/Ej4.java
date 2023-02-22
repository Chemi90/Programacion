package Examen;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Introduce tres numeros, el primero: ");
		int num1 = sc.nextInt();
		System.out.print("el segundo: ");
		int num2 = sc.nextInt();
		System.out.print("el tercero: ");
		int num3 = sc.nextInt();
		
		if (num1%2==0 && num2%2==0 && num3%2==0) System.out.println("PARES");
		if (num1%2!=0 && num2%2!=0 && num3%2!=0) System.out.println("IMPARES");
		if (num1%2!=0 && num2%2==0 && num3%2==0 ||
				num1%2==0 && num2%2!=0 && num3%2==0 ||
				num1%2==0 && num2%2==0 && num3%2!=0) System.out.println("SEMIPARES");
		
		sc.close();
	
	}

}
