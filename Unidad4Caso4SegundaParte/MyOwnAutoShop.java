package Unidad4Caso4SegundaParte;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Truck coche1 = new Truck (100, 2000, "amarillo", 2600);
		Sedan coche2 = new Sedan (150, 5000, "verde", 18);
		Ford coche3 = new Ford (120, 3000, "marrón", 1998, 500);
		Ford coche4 = new Ford (220, 15000, "rojo", 2017, 1350);
		Car coche5 =new Car (180, 6000, "azul");
		

		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(coche3);
		System.out.println(coche4);
		System.out.println(coche5);
	}

}
