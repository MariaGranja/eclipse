package tema_5_prog;

import java.util.Scanner;

public class Ej8 {
	/*
	 * Dados m elementos de un conjunto que se desean agrupar de n en n, el número
	 * de combinaciones posibles es m!/(n!*(m-n)!), siendo siempre m >=n (hay que
	 * validarlo) Escribir un método para que, dados como parámetros m y n, nos
	 * calcule el número de combinaciones de m sobre n. Usad el método factorial del
	 * ejercicio 3.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int m, n, x, res;
		System.out.println("Introduzca m: ");
		m = teclado.nextInt();
		System.out.println("introduzca n:");
		n = teclado.nextInt();
		if (m >= n) {
			x = m - n;
			m = Ej3.factorial(m);
			n = Ej3.factorial(n);
			x = Ej3.factorial(x);
			res = m / (n * x);
			System.out.println(res);
		} else
			System.out.println("Numeros no validos");
		teclado.close();
	}
}
