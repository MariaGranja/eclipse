package tema_5_prog;

import java.util.Scanner;

public class Ej5 {
	/*
	 * Escribir un método que con dos parámetros enteros p y q nos devuelva el
	 * m.c.d. (máximo común divisor) de ambos.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p, q, res;
		System.out.println("Inserte un numero");
		p = teclado.nextInt();
		System.out.println("Inserte otro numero");
		q = teclado.nextInt();
		res = mcd(p, q);
		System.out.println("El mcd es " + res);
		teclado.close();
	}

	public static int mcd(int p, int q) {
		int a = Math.max(p, q);
		int b = Math.min(p, q);
		int resultado = 0;
		do {
			resultado = b;
			b = a % b;
			a = resultado;
		} while (b != 0);
		return resultado;
	}
}
