package Unidad5Caso5;

public class Main {

	public static void main(String[] args) {

		Electrodomestico[] elec = new Electrodomestico[10];

		Television tele1 = new Television(100, Color.azul, ConsumoEnergetico.C, 10, 50, true);
		Lavadora lava1 = new Lavadora();
		Lavadora lava2 = new Lavadora(150, 50);
		Television tele2 = new Television();
		Television tele3 = new Television(200, Color.gris, ConsumoEnergetico.C, 10, 50, true);
		Television tele4 = new Television(100, Color.azul, ConsumoEnergetico.E, 10, 50, false);
		Television tele5 = new Television(20, Color.blanco, ConsumoEnergetico.C, 10, 50, true);
		Television tele6 = new Television(30, 10);
		Television tele7 = new Television(80, Color.azul, ConsumoEnergetico.B, 10, 5, false);
		Television tele8 = new Television(500, Color.negro, ConsumoEnergetico.F, 10, 50, true);

		elec[0] = tele1;
		elec[1] = lava1;
		elec[2] = lava2;
		elec[3] = tele2;
		elec[4] = tele3;
		elec[5] = tele4;
		elec[6] = tele5;
		elec[7] = tele6;
		elec[8] = tele7;
		elec[9] = tele8;

		for (int i=0;i<elec.length;i++) {
			elec[i].precioFinal();
			System.out.println(elec[i]);
		}
	}

}
