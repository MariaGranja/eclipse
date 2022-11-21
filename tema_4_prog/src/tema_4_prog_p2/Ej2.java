package tema_4_prog_p2;

import java.util.Scanner;

public class Ej2 {
	/*
	 * Programa que pide por teclado una cadena y una letra, de manera que elimine
	 * las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo
	 * muestre por pantalla.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase, letra;
		System.out.print("Introduzca una frase: ");
		frase = teclado.nextLine();
		System.out.print("Introduzca una letra: ");
		letra = teclado.nextLine();
		for (int i = 0; i < 3; i++) {
			frase = frase.replaceFirst(letra, "");
		}
		System.out.print("La frase resultante es: " + frase);
		teclado.close();
	}
}
