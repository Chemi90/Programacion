package Caso1;

public class Ej1 {

	public static void main(String[] args) {
		int fila = 0, columna = 0;
		do {
			columna++;
			do {
				System.out.print(fila + ", ");	
				fila++;
			} while (fila<columna);
			fila=0;
			System.out.println("");
		}while(columna<10);

	}

}