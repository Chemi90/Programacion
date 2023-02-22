package Unidad5Caso4;

import java.util.Random;

public class Urna {

	protected int blanca;
	protected int negra;
	static private Random r = new Random();

	public Urna(int blanca, int negra) {
		super();
		this.blanca = blanca;
		this.negra = negra;
	}

	public int getBlanca() {
		return blanca;
	}

	public void setBlanca(int blanca) {
		this.blanca = blanca;
	}

	public int getNegra() {
		return negra;
	}

	public void setNegra(int negra) {
		this.negra = negra;
	}

	public int totalBolas() {
		return negra + blanca;
	}

	public Color bola() {
		int bolaRandom = r.nextInt(totalBolas()) + 1;
		if (bolaRandom <= blanca) {
			blanca--;
			return Color.blanca;
		} else {
			negra--;
			return Color.negra;
		}
	}

	public int ponerBlanca() {
		blanca++;
		return blanca;
	}

	public int ponerNegra() {
		negra++;
		return negra;
	}

}
