package problemas;

import java.util.Scanner;

public class Problema4 {
	/*
	 * Programa que lee un número N y escribe en la pantalla mediante un mensaje si
	 * es o no primo
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean primo = false;
		int divisor = 2;
		System.out.print("Introduce un numero: ");
		numero = teclado.nextInt();
		while (!primo && divisor <= numero / 2) {
			primo = numero % divisor == 0;
			divisor++;
		}
		if (primo) {
			System.out.println("No es primo");
		} else
			System.out.println("Es primo");
		teclado.close();
	}
}
