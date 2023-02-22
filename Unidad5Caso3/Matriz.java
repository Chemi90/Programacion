package Unidad5Caso3;

public class Matriz {

	// atributos
	private int[][] array;
	private int tama�o;

	// constructor, donde solo se le pasa el tama�o y el array depende del tama�o
	public Matriz(int tama�o) {
		super();
		this.tama�o = tama�o;
		array = new int[tama�o][tama�o];
	}

	// getter y setters el array solo tiene getter
	public int[][] getArray() {
		return array;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	// metodo asignar datos mediante un array unidimensional
	public void asignarDatos(int[] vector) {
		int contador = 0;
		for (int i = 0; i < tama�o; i++) {
			for (int j = 0; j < tama�o; j++) {
				array[i][j] = vector[contador++];
			}
		}
	}


	// metodo suma
	public void suma(Matriz m) {
		int[][] arrayAux = new int[tama�o][tama�o];
		for (int i = 0; i < tama�o; i++) {
			for (int j = 0; j < tama�o; j++) {
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
		int[][] arrayAux = new int[tama�o][tama�o];
		for (int i = 0; i < tama�o; i++) {
			for (int j = 0; j < tama�o; j++) {
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
