package tema_5_prog;

import java.util.Scanner;

public class Ej7 {
	/*
	 * Escribir un método al que se le dé como parámetro un valor r, que representa
	 * el radio de una figura, una opción: un dato entero que será 1, 2 ó 3. El
	 * método debe devolver: • En el caso opción 1, la longitud del circulo de radio
	 * r dada por la expresión 2*PI*r • En el caso opción 2, la superficie del
	 * circulo dada por la expresión PI*r2 • En el caso opción 3, el volumen de una
	 * esfera de radio r dada por la expresión 4/3*PI*r3 NOTA: PI es la constante
	 * 3,14159
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double r, resultado;
		int eleccion;
		System.out.println("Introduzca el valor r: ");
		r = teclado.nextDouble();
		System.out.println(
				"Eliga una opcion a calcular\n1. Longitud del circulo\n2. Superficie del circulo\n3. Volumen de la esfera");
		eleccion = teclado.nextInt();
		switch (eleccion) {
		case 1:
			resultado = longitud(r);
			System.out.println("La longitud del circulo con radio " + r + " es de " + resultado);
			break;
		case 2:
			resultado = superficie(r);
			System.out.println("La superficie del circulo con radio " + r + " es de " + resultado);
			break;
		case 3:
			resultado = volumen(r);
			System.out.println("El volumen de la esfera con radio " + r + " es de " + resultado);
			break;
		}
		teclado.close();
	}

	public static double longitud(double num) {
		final double pi = 3.14159;
		double res = 2 * pi * num;
		return res;
	}

	public static double superficie(double num) {
		final double pi = 3.14159;
		double res = pi * (Math.pow(num, 2));
		return res;
	}

	public static double volumen(double num) {
		final double pi = 3.14159;
		double res = (4 / 3) * pi * (Math.pow(num, 3));
		return res;
	}
}
