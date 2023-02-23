package Unidad8Caso1;

import java.util.Random;

public class telefonoMovil extends telefono{

	private String operador;

	public telefonoMovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public telefonoMovil(int llamar, int recibirllamada) {
		super(llamar, recibirllamada);
		// TODO Auto-generated constructor stub
	}

	public String getOperador() {
		return operador;
	}

	private void setOperador() {
		Random ran = new Random();
		int num = ran.nextInt(4) + 1;
		
		if(num==1)this.operador="Vodafone";
		else if (num==2)this.operador="Orange";
		else if (num==3)this.operador="Movistar";
		else this.operador="Axartel";
	}
	
	@Override
	public int llamar (int num) {
		System.out.print("Llamando al operador: "+operador+" con numero: ");
		return num;
	}
	
}
