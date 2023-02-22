package Caso2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero que quieras cambiar a binario: ");
		
		int num = sc.nextInt();
		
		int x=0;
		int aux=num, aux2=num;
		
		int[] binario = new int [50]; 
		int[] octal = new int [50];
		int[] hexa = new int [50]; 
		
		
		//PASO A BINARIO
		do {
			if (num>=2) {
				binario[x]=num%2;
				num=Math.round(num/2);
			}
			else {
				binario[x]=1;
				num=Math.round(num/2);
			}
			x++;;
		} while (num>=1);
		do {
			x--;
			System.out.print(binario[x]);
			
		} while(x>0);
		System.out.println(" este seria el numero en binario.");
		System.out.println();
		
		
		//PASO A OCTAL
		x=0;
		do {
			if (aux>=8) {
				octal[x]=aux%8;
				aux=Math.round(aux/8);
			}
			else {
				octal[x]=aux;
				break;
			}
			x++;
		}while(aux>-1);
		do {
			
			System.out.print(octal[x]);
			x--;
		} while(x>=0);
		System.out.println(" este seria el numero en octal.");
		System.out.println();
		
		
		//PASO A HEXADECIMAL
		x=0;
		do {
			if(aux2>=16) {
				hexa[x]=aux2%16;
				aux2=Math.round(aux2/16);
			}
			else {
				hexa[x]=aux2;
				break;
			}
			x++;
		}while(aux>=0);
		do {
			switch(hexa[x]) {
			case 0: System.out.print(0);break;
			case 1: System.out.print(1);break;
			case 2: System.out.print(2);break;
			case 3: System.out.print(3);break;
			case 4: System.out.print(4);break;
			case 5: System.out.print(5);break;
			case 6: System.out.print(6);break;
			case 7: System.out.print(7);break;
			case 8: System.out.print(8);break;
			case 9: System.out.print(9);break;
			case 10: System.out.print("A");break;
			case 11: System.out.print("B");break;
			case 12: System.out.print("C");break;
			case 13: System.out.print("D");break;
			case 14: System.out.print("E");break;
			case 15: System.out.print("F");break;
			}
			x--;
		}while(x>=0);
		System.out.println(" este seria el numero en hexadecimal.");
		
		sc.close();
	}

}
