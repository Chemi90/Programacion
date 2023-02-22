package Unidad6Caso3;

import Practica02ud06.Vehiculos.Vehiculos;

public final class Math2 {

	public static double max(double[] array) {

		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}

	public static double min(double[] array) {

		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}

	public static double sum(double[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		return sum;
	}
	
	public static double mediaAritmetica(double[] array) {

		double sum = 0;
		double media=0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
			}
		media=sum/array.length;
		return media;
	}
	
	public static double mediaGeometrica(double[] array) {

		double mul=1;
		double raiz=0;
		for (int i = 0; i < array.length; i++) {
		      mul *= array[i];
		    }
		raiz=Math.pow(mul, 1.0/array.length);
			
		return raiz;
	}
}
