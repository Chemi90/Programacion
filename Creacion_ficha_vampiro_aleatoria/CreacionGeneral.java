package Creacion_ficha_vampiro_aleatoria;

import java.util.Random;
import java.util.Scanner;

public class CreacionGeneral {
	
	
	//atributos
		//fisicos
	private int fuerza;
	private int destreza;
	private int resistencia;
		//sociales
	private int carisma;
	private int manipulacion;
	private int apariencia;
		//mentales
	private int percepcion;
	private int inteligencia;
	private int astucia;
	
	//habilidades
		//talentos
	private int alerta;
	private int atletismo;
	private int callejeo;
	private int consciencia;
	private int empatia;
	private int expresion;
	private int intimidacion;
	private int liderazgo;
	private int pelea;
	private int subterfugio;
		//talentos
	private int armas_de_fuego;
	private int artesania;
	private int conducir;
	private int etiqueta;
	private int interpretacion;
	private int latrocinio;
	private int pelea_con_armas;
	private int sigilo;
	private int supervivencia;
	private int trato_con_animales;
		//conocimientos
	private int academicismo;
	private int ciencia;
	private int finanzas;
	private int informatica;
	private int investigacion;
	private int leyes;
	private int medicina;
	private int ocultismo;
	private int politica;
	private int tecnologia;
	
	//getters an setters atributos
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	public int getManipulacion() {
		return manipulacion;
	}
	public void setManipulacion(int manipulacion) {
		this.manipulacion = manipulacion;
	}
	public int getApariencia() {
		return apariencia;
	}
	public void setApariencia(int apariencia) {
		this.apariencia = apariencia;
	}
	public int getPercepcion() {
		return percepcion;
	}
	public void setPercepcion(int percepcion) {
		this.percepcion = percepcion;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getAstucia() {
		return astucia;
	}
	public void setAstucia(int astucia) {
		this.astucia = astucia;
	}
	
	//getter and setter habilidades
	public int getAlerta() {
		alerta = Math.max(3, 3);
		return alerta;
	}
	public void setAlerta(int alerta) {
		this.alerta = alerta;
	}
	public int getAtletismo() {
		return atletismo;
	}
	public void setAtletismo(int atletismo) {
		this.atletismo = atletismo;
	}
	public int getCallejeo() {
		return callejeo;
	}
	public void setCallejeo(int callejeo) {
		this.callejeo = callejeo;
	}
	public int getConsciencia() {
		return consciencia;
	}
	public void setConsciencia(int consciencia) {
		this.consciencia = consciencia;
	}
	public int getEmpatia() {
		return empatia;
	}
	public void setEmpatia(int empatia) {
		this.empatia = empatia;
	}
	public int getExpresion() {
		return expresion;
	}
	public void setExpresion(int expresion) {
		this.expresion = expresion;
	}
	public int getIntimidacion() {
		return intimidacion;
	}
	public void setIntimidacion(int intimidacion) {
		this.intimidacion = intimidacion;
	}
	public int getLiderazgo() {
		return liderazgo;
	}
	public void setLiderazgo(int liderazgo) {
		this.liderazgo = liderazgo;
	}
	public int getPelea() {
		return pelea;
	}
	public void setPelea(int pelea) {
		this.pelea = pelea;
	}
	public int getSubterfugio() {
		return subterfugio;
	}
	public void setSubterfugio(int subterfugio) {
		this.subterfugio = subterfugio;
	}
	public int getArmas_de_fuego() {
		return armas_de_fuego;
	}
	public void setArmas_de_fuego(int armas_de_fuego) {
		this.armas_de_fuego = armas_de_fuego;
	}
	public int getArtesania() {
		return artesania;
	}
	public void setArtesania(int artesania) {
		this.artesania = artesania;
	}
	public int getConducir() {
		return conducir;
	}
	public void setConducir(int conducir) {
		this.conducir = conducir;
	}
	public int getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(int etiqueta) {
		this.etiqueta = etiqueta;
	}
	public int getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(int interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int getLatrocinio() {
		return latrocinio;
	}
	public void setLatrocinio(int latrocinio) {
		this.latrocinio = latrocinio;
	}
	public int getPelea_con_armas() {
		return pelea_con_armas;
	}
	public void setPelea_con_armas(int pelea_con_armas) {
		this.pelea_con_armas = pelea_con_armas;
	}
	public int getSigilo() {
		return sigilo;
	}
	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}
	public int getSupervivencia() {
		return supervivencia;
	}
	public void setSupervivencia(int supervivencia) {
		this.supervivencia = supervivencia;
	}
	public int getTrato_con_animales() {
		return trato_con_animales;
	}
	public void setTrato_con_animales(int trato_con_animales) {
		this.trato_con_animales = trato_con_animales;
	}
	public int getAcademicismo() {
		return academicismo;
	}
	public void setAcademicismo(int academicismo) {
		this.academicismo = academicismo;
	}
	public int getCiencia() {
		return ciencia;
	}
	public void setCiencia(int ciencia) {
		this.ciencia = ciencia;
	}
	public int getFinanzas() {
		return finanzas;
	}
	public void setFinanzas(int finanzas) {
		this.finanzas = finanzas;
	}
	public int getInformatica() {
		return informatica;
	}
	public void setInformatica(int informatica) {
		this.informatica = informatica;
	}
	public int getInvestigacion() {
		return investigacion;
	}
	public void setInvestigacion(int investigacion) {
		this.investigacion = investigacion;
	}
	public int getLeyes() {
		return leyes;
	}
	public void setLeyes(int leyes) {
		this.leyes = leyes;
	}
	public int getMedicina() {
		return medicina;
	}
	public void setMedicina(int medicina) {
		this.medicina = medicina;
	}
	public int getOcultismo() {
		return ocultismo;
	}
	public void setOcultismo(int ocultismo) {
		this.ocultismo = ocultismo;
	}
	public int getPolitica() {
		return politica;
	}
	public void setPolitica(int politica) {
		this.politica = politica;
	}
	public int getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(int tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	//constructores
	public CreacionGeneral(int fuerza, int destreza, int resistencia, int carisma, int manipulacion, int apariencia,
			int percepcion, int inteligencia, int astucia, int alerta, int atletismo, int callejeo, int consciencia,
			int empatia, int expresion, int intimidacion, int liderazgo, int pelea, int subterfugio, int armas_de_fuego,
			int artesania, int conducir, int etiqueta, int interpretacion, int latrocinio, int pelea_con_armas,
			int sigilo, int supervivencia, int trato_con_animales, int academicismo, int ciencia, int finanzas,
			int informatica, int investigacion, int leyes, int medicina, int ocultismo, int politica, int tecnologia) {
		super();
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.resistencia = resistencia;
		this.carisma = carisma;
		this.manipulacion = manipulacion;
		this.apariencia = apariencia;
		this.percepcion = percepcion;
		this.inteligencia = inteligencia;
		this.astucia = astucia;
		this.alerta = alerta;
		this.atletismo = atletismo;
		this.callejeo = callejeo;
		this.consciencia = consciencia;
		this.empatia = empatia;
		this.expresion = expresion;
		this.intimidacion = intimidacion;
		this.liderazgo = liderazgo;
		this.pelea = pelea;
		this.subterfugio = subterfugio;
		this.armas_de_fuego = armas_de_fuego;
		this.artesania = artesania;
		this.conducir = conducir;
		this.etiqueta = etiqueta;
		this.interpretacion = interpretacion;
		this.latrocinio = latrocinio;
		this.pelea_con_armas = pelea_con_armas;
		this.sigilo = sigilo;
		this.supervivencia = supervivencia;
		this.trato_con_animales = trato_con_animales;
		this.academicismo = academicismo;
		this.ciencia = ciencia;
		this.finanzas = finanzas;
		this.informatica = informatica;
		this.investigacion = investigacion;
		this.leyes = leyes;
		this.medicina = medicina;
		this.ocultismo = ocultismo;
		this.politica = politica;
		this.tecnologia = tecnologia;
	}
	public CreacionGeneral() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void InicializarVampiroAtributos() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Elige el tipo de personaje, fisico, social o mental: ");
		String atributo = sc.nextLine();
		int contador =0;
		int aux=0;
		fuerza=1;
		destreza=1;
		resistencia=1;
		carisma=1;
		manipulacion=1;
		apariencia=1;
		percepcion=1;
		inteligencia=1;
		astucia=1;
		
		switch (atributo) {
	    case "fisico":
	    	for (contador = 0;contador<7;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (fuerza<4) fuerza++;
	    		else contador--;
	    		break;
	    		case 1: if (destreza<4) destreza++;
	    		else contador--;
	    		break;
	    		case 2: if (resistencia<4) resistencia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<5;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (carisma<5) carisma++;
	    		else contador--;
	    		break;
	    		case 1: if (manipulacion<5) manipulacion++;
	    		else contador--;
	    		break;
	    		case 2: if (apariencia<5) apariencia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<3;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (percepcion<5) percepcion++;
	    		else contador--;
	    		break;
	    		case 1: if (inteligencia<5) inteligencia++;
	    		else contador--;
	    		break;
	    		case 2: if (astucia<5) astucia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<13;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (alerta<3) alerta++;
	    		else contador--;
	    		break;
	    		case 1: if (atletismo<3) atletismo++;
	    		else contador--;
	    		break;
	    		case 2: if (callejeo<3) callejeo++;
	    		else contador--;
	    		break;
	    		case 3: if (consciencia<3) consciencia++;
	    		else contador--;
	    		break;
	    		case 4: if (empatia<3) empatia++;
	    		else contador--;
	    		break;
	    		case 5: if (expresion<3) expresion++;
	    		else contador--;
	    		break;
	    		case 6: if (intimidacion<3) intimidacion++;
	    		else contador--;
	    		break;
	    		case 7: if (liderazgo<3) liderazgo++;
	    		else contador--;
	    		break;
	    		case 8: if (pelea<3) pelea++;
	    		else contador--;
	    		break;
	    		case 9: if (subterfugio<3) subterfugio++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<9;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (armas_de_fuego<3) armas_de_fuego++;
	    		else contador--;
	    		break;
	    		case 1: if (artesania<3) artesania++;
	    		else contador--;
	    		break;
	    		case 2: if (conducir<3) conducir++;
	    		else contador--;
	    		break;
	    		case 3: if (etiqueta<3) etiqueta++;
	    		else contador--;
	    		break;
	    		case 4: if (interpretacion<3) interpretacion++;
	    		else contador--;
	    		break;
	    		case 5: if (latrocinio<3) latrocinio++;
	    		else contador--;
	    		break;
	    		case 6: if (pelea_con_armas<3) pelea_con_armas++;
	    		else contador--;
	    		break;
	    		case 7: if (sigilo<3) sigilo++;
	    		else contador--;
	    		break;
	    		case 8: if (supervivencia<3) supervivencia++;
	    		else contador--;
	    		break;
	    		case 9: if (trato_con_animales<3) trato_con_animales++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<5;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (academicismo<3) academicismo++;
	    		else contador--;
	    		break;
	    		case 1: if (ciencia<3) ciencia++;
	    		else contador--;
	    		break;
	    		case 2: if (finanzas<3) finanzas++;
	    		else contador--;
	    		break;
	    		case 3: if (informatica<3) informatica++;
	    		else contador--;
	    		break;
	    		case 4: if (investigacion<3) investigacion++;
	    		else contador--;
	    		break;
	    		case 5: if (leyes<3) leyes++;
	    		else contador--;
	    		break;
	    		case 6: if (medicina<3) medicina++;
	    		else contador--;
	    		break;
	    		case 7: if (ocultismo<3) ocultismo++;
	    		else contador--;
	    		break;
	    		case 8: if (politica<3) politica++;
	    		else contador--;
	    		break;
	    		case 9: if (tecnologia<3) tecnologia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	        break;
	    case "social":
	    	for (contador = 0;contador<5;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (fuerza<4) fuerza++;
	    		else contador--;
	    		break;
	    		case 1: if (destreza<4) destreza++;
	    		else contador--;
	    		break;
	    		case 2: if (resistencia<4) resistencia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	contador=0;
	    	for (contador = 0;contador<7;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (carisma<5) carisma++;
	    		else contador--;
	    		break;
	    		case 1: if (manipulacion<5) manipulacion++;
	    		else contador--;
	    		break;
	    		case 2: if (apariencia<5) apariencia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<3;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (percepcion<5) percepcion++;
	    		else contador--;
	    		break;
	    		case 1: if (inteligencia<5) inteligencia++;
	    		else contador--;
	    		break;
	    		case 2: if (astucia<5) astucia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<9;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (alerta<3) alerta++;
	    		else contador--;
	    		break;
	    		case 1: if (atletismo<3) atletismo++;
	    		else contador--;
	    		break;
	    		case 2: if (callejeo<3) callejeo++;
	    		else contador--;
	    		break;
	    		case 3: if (consciencia<3) consciencia++;
	    		else contador--;
	    		break;
	    		case 4: if (empatia<3) empatia++;
	    		else contador--;
	    		break;
	    		case 5: if (expresion<3) expresion++;
	    		else contador--;
	    		break;
	    		case 6: if (intimidacion<3) intimidacion++;
	    		else contador--;
	    		break;
	    		case 7: if (liderazgo<3) liderazgo++;
	    		else contador--;
	    		break;
	    		case 8: if (pelea<3) pelea++;
	    		else contador--;
	    		break;
	    		case 9: if (subterfugio<3) subterfugio++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<13;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (armas_de_fuego<3) armas_de_fuego++;
	    		else contador--;
	    		break;
	    		case 1: if (artesania<3) artesania++;
	    		else contador--;
	    		break;
	    		case 2: if (conducir<3) conducir++;
	    		else contador--;
	    		break;
	    		case 3: if (etiqueta<3) etiqueta++;
	    		else contador--;
	    		break;
	    		case 4: if (interpretacion<3) interpretacion++;
	    		else contador--;
	    		break;
	    		case 5: if (latrocinio<3) latrocinio++;
	    		else contador--;
	    		break;
	    		case 6: if (pelea_con_armas<3) pelea_con_armas++;
	    		else contador--;
	    		break;
	    		case 7: if (sigilo<3) sigilo++;
	    		else contador--;
	    		break;
	    		case 8: if (supervivencia<3) supervivencia++;
	    		else contador--;
	    		break;
	    		case 9: if (trato_con_animales<3) trato_con_animales++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<5;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (academicismo<3) academicismo++;
	    		else contador--;
	    		break;
	    		case 1: if (ciencia<3) ciencia++;
	    		else contador--;
	    		break;
	    		case 2: if (finanzas<3) finanzas++;
	    		else contador--;
	    		break;
	    		case 3: if (informatica<3) informatica++;
	    		else contador--;
	    		break;
	    		case 4: if (investigacion<3) investigacion++;
	    		else contador--;
	    		break;
	    		case 5: if (leyes<3) leyes++;
	    		else contador--;
	    		break;
	    		case 6: if (medicina<3) medicina++;
	    		else contador--;
	    		break;
	    		case 7: if (ocultismo<3) ocultismo++;
	    		else contador--;
	    		break;
	    		case 8: if (politica<3) politica++;
	    		else contador--;
	    		break;
	    		case 9: if (tecnologia<3) tecnologia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	        break;    
	    case "mental":
	    	for (contador = 0;contador<3;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (fuerza<4) fuerza++;
	    		else contador--;
	    		break;
	    		case 1: if (destreza<4) destreza++;
	    		else contador--;
	    		break;
	    		case 2: if (resistencia<4) resistencia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	contador=0;
	    	for (contador = 0;contador<5;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (carisma<5) carisma++;
	    		else contador--;
	    		break;
	    		case 1: if (manipulacion<5) manipulacion++;
	    		else contador--;
	    		break;
	    		case 2: if (apariencia<5) apariencia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<7;contador++) {
	    		aux = rand.nextInt(3);
	    		switch (aux) {
	    		case 0: if (percepcion<5) percepcion++;
	    		else contador--;
	    		break;
	    		case 1: if (inteligencia<5) inteligencia++;
	    		else contador--;
	    		break;
	    		case 2: if (astucia<5) astucia++;
	    		else contador--;
	    		break;
	    		}
	    	}	for (contador = 0;contador<5;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (alerta<3) alerta++;
	    		else contador--;
	    		break;
	    		case 1: if (atletismo<3) atletismo++;
	    		else contador--;
	    		break;
	    		case 2: if (callejeo<3) callejeo++;
	    		else contador--;
	    		break;
	    		case 3: if (consciencia<3) consciencia++;
	    		else contador--;
	    		break;
	    		case 4: if (empatia<3) empatia++;
	    		else contador--;
	    		break;
	    		case 5: if (expresion<3) expresion++;
	    		else contador--;
	    		break;
	    		case 6: if (intimidacion<3) intimidacion++;
	    		else contador--;
	    		break;
	    		case 7: if (liderazgo<3) liderazgo++;
	    		else contador--;
	    		break;
	    		case 8: if (pelea<3) pelea++;
	    		else contador--;
	    		break;
	    		case 9: if (subterfugio<3) subterfugio++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<9;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (armas_de_fuego<3) armas_de_fuego++;
	    		else contador--;
	    		break;
	    		case 1: if (artesania<3) artesania++;
	    		else contador--;
	    		break;
	    		case 2: if (conducir<3) conducir++;
	    		else contador--;
	    		break;
	    		case 3: if (etiqueta<3) etiqueta++;
	    		else contador--;
	    		break;
	    		case 4: if (interpretacion<3) interpretacion++;
	    		else contador--;
	    		break;
	    		case 5: if (latrocinio<3) latrocinio++;
	    		else contador--;
	    		break;
	    		case 6: if (pelea_con_armas<3) pelea_con_armas++;
	    		else contador--;
	    		break;
	    		case 7: if (sigilo<3) sigilo++;
	    		else contador--;
	    		break;
	    		case 8: if (supervivencia<3) supervivencia++;
	    		else contador--;
	    		break;
	    		case 9: if (trato_con_animales<3) trato_con_animales++;
	    		else contador--;
	    		break;
	    		}
	    	}
	    	for (contador = 0;contador<13;contador++) {
	    		aux = rand.nextInt(10);
	    		switch (aux) {
	    		case 0: if (academicismo<3) academicismo++;
	    		else contador--;
	    		break;
	    		case 1: if (ciencia<3) ciencia++;
	    		else contador--;
	    		break;
	    		case 2: if (finanzas<3) finanzas++;
	    		else contador--;
	    		break;
	    		case 3: if (informatica<3) informatica++;
	    		else contador--;
	    		break;
	    		case 4: if (investigacion<3) investigacion++;
	    		else contador--;
	    		break;
	    		case 5: if (leyes<3) leyes++;
	    		else contador--;
	    		break;
	    		case 6: if (medicina<3) medicina++;
	    		else contador--;
	    		break;
	    		case 7: if (ocultismo<3) ocultismo++;
	    		else contador--;
	    		break;
	    		case 8: if (politica<3) politica++;
	    		else contador--;
	    		break;
	    		case 9: if (tecnologia<3) tecnologia++;
	    		else contador--;
	    		break;
	    		}
	    	}
	        break;
	    default:
	        System.out.println("Dato invalido.");
	}
		
		
		sc.close();
	}
	
	
	//To String
	@Override
	public String toString() {
		return "\nATRIBUTOS: \n"
				+ "\nFisicos: \n"
				+ " fuerza=" + fuerza + ", destreza=" + destreza + ", resistencia=" + resistencia
				+ "\n\nSociales: "
				+ "\n carisma=" + carisma + ", manipulacion=" + manipulacion + ", apariencia=" + apariencia
				+ "\n\nMentales: "
				+ "\n percepcion=" + percepcion + ", inteligencia=" + inteligencia + ", astucia=" + astucia
				+ "\n\nHABILIDADES\n"
				+ "\nTalentos: \n" +
				" alerta=" +
				+ alerta + ", atletismo=" + atletismo + ", callejeo=" + callejeo + ", consciencia=" + consciencia
				+ "\n empatia=" + empatia + ", expresion=" + expresion + ", intimidacion=" + intimidacion
				+ ", liderazgo=" + liderazgo + "\n pelea=" + pelea + ", subterfugio=" + subterfugio 
				+ "\n\nTecnicas: "
				+ "\n armas_de_fuego="
				+ armas_de_fuego + ", artesania=" + artesania + ", conducir=" + conducir + ", etiqueta=" + etiqueta
				+ "\n interpretacion=" + interpretacion + ", latrocinio=" + latrocinio + ", pelea_con_armas="
				+ pelea_con_armas + ", sigilo=" + sigilo + "\n supervivencia=" + supervivencia + ", trato_con_animales="
				+ trato_con_animales
				+ "\n\nConocimientos: "
				+ "\n academicismo=" + academicismo + ", ciencia=" + ciencia + ", finanzas="
				+ finanzas + ", informatica=" + informatica + "\n investigacion=" + investigacion + ", leyes=" + leyes
				+ ", medicina=" + medicina + ", ocultismo=" + ocultismo + "\n politica=" + politica + ", tecnologia="
				+ tecnologia+"\n\n";
		
	}
	
	public void InicializarTrasfondosVirtudes() {
		Virtudes vir = new Virtudes();
		Trasfondos tras = new Trasfondos();
		tras.trasfondoAleatorio();
		tras.trasfondoEleccion();
		vir.virtudesAleatorio();
	}
}