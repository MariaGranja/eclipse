package tema_4_prog_p2;

import java.util.Scanner;

public class Ej3 {
	/*
	 * Programa que pide por teclado una palabra y dice si es un palíndromo o no.
	 * Una palabra es un palíndromo si se lee igual de izquierda a derecha que de
	 * derecha a izquierda.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra, invertida = "";
		System.out.print("Inserta una palabra: ");
		palabra = teclado.nextLine();
		for (int i = palabra.length() - 1; i >= 0; i--) {
			invertida += palabra.charAt(i);
		}
		if (invertida.equals(palabra)) {
			System.out.print("La palabra " + palabra + " es un palindromo.");
		} else
			System.out.print("La palabra " + palabra + " no es un palindromo.");
		teclado.close();
	}
}
