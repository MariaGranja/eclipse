package tema_4_prog_p2;

import java.util.Scanner;

public class Ej7 {
	/*
	 * Programa que pide por teclado una palabra y muestre por pantalla cuál es la
	 * vocal que más veces contiene junto al número de veces que la tiene.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		char vocal;
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		System.out.print("Escribe una palabra: ");
		palabra = teclado.nextLine().toLowerCase();
		for (int x = 0; x < palabra.length(); x++) {
			vocal = palabra.charAt(x);
			if (vocal == 'a')
				a++;
			else if (vocal == 'e')
				e++;
			else if (vocal == 'i')
				i++;
			else if (vocal == 'o')
				o++;
			else if (vocal == 'u')
				u++;
		}
		if (a > e && a > i && a > o && a > u)
			System.out.println("la vocal que mas se repite es la a con " + a + " repeticiones.");
		else if (e > a && e > i && e > o && e > u)
			System.out.println("la vocal que mas se repite es la e con " + e + " repeticiones.");
		else if (i > a && i > e && i > o && i > u)
			System.out.println("la vocal que mas se repite es la i con " + i + " repeticiones.");
		else if (o > a && o > i && e < o && o > u)
			System.out.println("la vocal que mas se repite es la o con " + o + " repeticiones.");
		else if (u > a && u > i && u > o && e < u)
			System.out.println("la vocal que mas se repite es la u con " + u + " repeticiones.");
		else
			System.out.println("Tiene el mismo numero de vocales.");
		teclado.close();
	}
}
