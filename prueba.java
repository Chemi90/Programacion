import java.util.Random;

public class prueba {

	public static void main(String[] args) {
		String DNI = "";
		Random rand = new Random();
		int numDNI = rand.nextInt(100000000) + 23;
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
				'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
				'Q', 'V', 'H'
				, 'L', 'C', 'K', 'E'};
	    int rest = (int) (numDNI % 23);
	    char letraDNI = letras[rest];
		
		DNI=Integer.toString(numDNI).concat(Character.toString(letraDNI));
		
		System.out.println(DNI);

	}

}
