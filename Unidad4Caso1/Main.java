package Unidad4Caso1;

import Unidad4Caso1.SerVivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerVivo servivo1 = new SerVivo((byte) 3);
		SerVivo servivo2 = new SerVivo((byte) 5);
		System.out.println("El mayor SerVivo es el " + servivo1.mayor(servivo2));
		
		servivo1 = new Humano((byte)34,"Homero");
		servivo2 = new Humano((byte)9,"Bart");
		
		System.out.println("El mayor SerVivo es el " + servivo1.mayor(servivo2));
		
		if(servivo1.mayor(servivo2).equals(servivo1)) System.out.println(servivo2);
		else System.out.println(servivo1);
	}

}
