package Unidad5Caso3;

public class MainMtriz {

	public static void main(String[] args) {

		
		Matriz m1 = new Matriz(3);
		Matriz m2 = new Matriz(3);

		int[] vector1 = { 3, 2, 1, 1, 2, 3, 2, 3, 1 };
		int[] Vector2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1 };

		m1.asignarDatos(vector1);
		m2.asignarDatos(Vector2);

		System.out.println("Matriz 1: \n" + m1);
		System.out.println("Matriz 2: \n" + m2);

		System.out.println("Suma de array " + 1 + " y del array " + 2);
		m1.suma(m2);
		System.out.println("Producto de array " + 1 + " y del array " + 2);
		m1.producto(m2);
	}

}
