package Creacion_ficha_vampiro_aleatoria;

import java.util.Random;

public class Brujah extends CreacionGeneral {

	private int presencia;
	private int potencia;
	private int celeridad;

	public int getPresencia() {
		return presencia;
	}

	public void setPresencia(int presencia) {
		this.presencia = presencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCeleridad() {
		return celeridad;
	}

	public void setCeleridad(int celeridad) {
		this.celeridad = celeridad;
	}

	public Brujah(int fuerza, int destreza, int resistencia, int carisma, int manipulacion, int apariencia,
			int percepcion, int inteligencia, int astucia, int alerta, int atletismo, int callejeo, int consciencia,
			int empatia, int expresion, int intimidacion, int liderezgo, int pelea, int subterfugio, int armas_de_fuego,
			int artesania, int conducir, int etiqueta, int interpretacion, int latrocinio, int pelea_con_armas,
			int sigilo, int supervivencia, int trato_con_animales, int academicismo, int ciencia, int finanzas,
			int informatica, int investigacion, int leyes, int medicina, int ocultismo, int politica, int tecnologia,
			int presencia, int potencia, int celeridad) {
		super(fuerza, destreza, resistencia, carisma, manipulacion, apariencia, percepcion, inteligencia, astucia,
				alerta, atletismo, callejeo, consciencia, empatia, expresion, intimidacion, liderezgo, pelea,
				subterfugio, armas_de_fuego, artesania, conducir, etiqueta, interpretacion, latrocinio, pelea_con_armas,
				sigilo, supervivencia, trato_con_animales, academicismo, ciencia, finanzas, informatica, investigacion,
				leyes, medicina, ocultismo, politica, tecnologia);
		this.presencia = presencia;
		this.potencia = potencia;
		this.celeridad = celeridad;
	}

	public Brujah() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brujah(int fuerza, int destreza, int resistencia, int carisma, int manipulacion, int apariencia,
			int percepcion, int inteligencia, int astucia, int alerta, int atletismo, int callejeo, int consciencia,
			int empatia, int expresion, int intimidacion, int liderezgo, int pelea, int subterfugio, int armas_de_fuego,
			int artesania, int conducir, int etiqueta, int interpretacion, int latrocinio, int pelea_con_armas,
			int sigilo, int supervivencia, int trato_con_animales, int academicismo, int ciencia, int finanzas,
			int informatica, int investigacion, int leyes, int medicina, int ocultismo, int politica, int tecnologia) {
		super(fuerza, destreza, resistencia, carisma, manipulacion, apariencia, percepcion, inteligencia, astucia,
				alerta, atletismo, callejeo, consciencia, empatia, expresion, intimidacion, liderezgo, pelea,
				subterfugio, armas_de_fuego, artesania, conducir, etiqueta, interpretacion, latrocinio, pelea_con_armas,
				sigilo, supervivencia, trato_con_animales, academicismo, ciencia, finanzas, informatica, investigacion,
				leyes, medicina, ocultismo, politica, tecnologia);
		// TODO Auto-generated constructor stub
	}

	public void brujahDisciplinas() {
		Random rand = new Random();
		int contador = 0;
		int aux = 0;

		for (contador = 0; contador < 3; contador++) {
			aux = rand.nextInt(3);
			switch (aux) {
			case 0:
				if (presencia < 3)
					presencia++;
				else
					contador--;
				break;
			case 1:
				if (potencia < 3)
					potencia++;
				else
					contador--;
				break;
			case 2:
				if (celeridad < 3)
					celeridad++;
				else
					contador--;
				break;
			}
		}

	}

	@Override
	public String toString() {
		return super.toString() + "Disciplinas:\n" + " presencia=" + presencia + ", potencia=" + potencia
				+ ", celeridad=" + celeridad;
	}

}