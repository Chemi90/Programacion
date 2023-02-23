package Unidad8Caso1;

public abstract class telefono {

	private int numero;
	private int recibirllamada;
	
	public telefono(int llamar, int recibirllamada) {
		super();
		this.numero = numero;
		this.recibirllamada = recibirllamada;
	}

	public telefono() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLlamar() {
		return numero;
	}

	public void setLlamar(int numero) {
		this.numero = numero;
	}

	public int getRecibirllamada() {
		return recibirllamada;
	}

	public void setRecibirllamada(int recibirllamada) {
		this.recibirllamada = recibirllamada;
	}

	public int llamar (int num) {
		System.out.print("Llamando al numero: ");
		return num;
	}
	
	
	@Override
	public String toString() {
		return "telefono [llamar=" + numero + ", recibirllamada=" + recibirllamada + "]";
	}
	
	
	
}
