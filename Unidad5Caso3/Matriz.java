package Unidad5Caso3;

public class Matriz {

	// atributos
	private int[][] array;
	private int tamaño;

	// constructor, donde solo se le pasa el tamaño y el array depende del tamaño
	public Matriz(int tamaño) {
		super();
		this.tamaño = tamaño;
		array = new int[tamaño][tamaño];
	}

	// getter y setters el array solo tiene getter
	public int[][] getArray() {
		return array;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	// metodo asignar datos mediante un array unidimensional
	public void asignarDatos(int[] vector) {
		int contador = 0;
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				array[i][j] = vector[contador++];
			}
		}
	}


	// metodo suma
	public void suma(Matriz m) {
		int[][] arrayAux = new int[tamaño][tamaño];
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				arrayAux[i][j] = m.array[i][j] + m.array[i][j];
			}
		}
		System.out.println("La suma de ambos array da: ");
		for (int i = 0; i < arrayAux.length; i++) {
			System.out.print("( ");
			for (int j = 0; j < arrayAux[i].length; j++) {
				System.out.print(arrayAux[i][j] + " ");
			}
			System.out.println(")");
		}
		System.out.println();
	}

	// metodo producto
	public void producto(Matriz m) {
		int[][] arrayAux = new int[tamaño][tamaño];
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				arrayAux[i][j] = m.array[i][j] * m.array[i][j];
			}
		}
		System.out.println("El producto de ambos arrya da: ");
		for (int i = 0; i < arrayAux.length; i++) {
			System.out.print("( ");
			for (int j = 0; j < arrayAux[i].length; j++) {
				System.out.print(arrayAux[i][j] + " ");
			}
			System.out.println(")");
		}
	}

	// toString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append("( ");
			for (int j = 0; j < array[i].length; j++) {
				sb.append(array[i][j]).append(" ");
			}
			sb.append(")\n");
		}
		return sb.toString();
	}

}
