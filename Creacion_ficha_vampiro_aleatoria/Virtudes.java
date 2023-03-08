package Creacion_ficha_vampiro_aleatoria;

import java.util.Random;

public class Virtudes {

	private int conciencia;
	private int autocontrol;
	private int coraje;

	public Virtudes(int conciencia, int autocontrol, int coraje) {
		super();
		this.conciencia = conciencia;
		this.autocontrol = autocontrol;
		this.coraje = coraje;
	}

	public Virtudes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getConciencia() {
		return conciencia;
	}

	public void setConciencia(int conciencia) {
		this.conciencia = conciencia;
	}

	public int getAutocontrol() {
		return autocontrol;
	}

	public void setAutocontrol(int autocontrol) {
		this.autocontrol = autocontrol;
	}

	public int getCoraje() {
		return coraje;
	}

	public void setCoraje(int coraje) {
		this.coraje = coraje;
	}

	public void virtudesAleatorio() {
		Random rand = new Random();
		conciencia = 1;
		autocontrol = 1;
		coraje = 1;
		int aux = 0;

		for (int contador = 0; contador < 7; contador++) {
			aux = rand.nextInt(3);
			switch (aux) {
			case 0:
				conciencia++;
				break;
			case 1:
				autocontrol++;
				break;
			case 2:
				coraje++;
				break;
			}

		}
		System.out.println("\nVirtudes: "
				+ "\nConciencia: " + conciencia
				+ "\nAutocontrol: " + autocontrol
				+ "\nCoraje: " + coraje);
	}
}
