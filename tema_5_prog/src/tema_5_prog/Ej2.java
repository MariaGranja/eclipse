package tema_5_prog;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p, q, divisor_p, divisor_q;

		System.out.print("Introduzca un numero:");
		p = teclado.nextInt();
		System.out.print("Introduzca otro numero: ");
		q = teclado.nextInt();

		divisor_p = divisores(p);
		divisor_q = divisores(q);
		if (divisor_p > divisor_q)
			System.out.println("El numero "+p+" tiene mas divisores");
		else
			System.out.println("El numero "+q+" tiene mas divisores");
		teclado.close();
	}

	private static int divisores(int numero) {
		int divisor = 1, contador = 0;
		while (numero >= divisor) {
			if (numero % divisor == 0) {
				contador++;
			}
			divisor++;
		}
		return contador;
	}
}
