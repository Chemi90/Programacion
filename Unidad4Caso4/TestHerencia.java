package Unidad4Caso4;

public class TestHerencia {

	public static void main(String[] args) {

		ProductoFresco p1 = new ProductoFresco("04/11/2023", "156363A", "09/8/2023", "España");
		ProductoRefrigerado p2 = new ProductoRefrigerado("14/02/2024", "1356156156F", "5614CE");
		ProductoCongelado p3 = new ProductoCongelado("20/08/2500", "15615614B", "-800ºC");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
