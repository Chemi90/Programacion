package Unidad4Caso1;

import java.util.Objects;

public class SerVivo {

	private byte edad;

	
	public SerVivo(byte edad) {
		super();
		this.edad = edad;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public boolean equals (Object obj) {
		SerVivo sv = (SerVivo) obj;
		if (sv.edad==this.edad) return true;
			else return false;
		
		//Version simplificada
		// return sv.edad==this.edad;
	}
	@Override
	public String toString() {
		return "SerVivo con edad: " + this.edad + ".";
	}
	public SerVivo mayor (SerVivo otro) {
		if(this.edad>=otro.edad) return this;
		else return otro;
	}

}
