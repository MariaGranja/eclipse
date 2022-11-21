package tema_4_prog_p2;

import java.util.Scanner;

public class ej5 {
	/*
	 * Programa que pide una palabra por teclado e intercambia la última y la
	 * primera letra.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra, primera, ultima;
		int num_letras;
		System.out.println("Escriba una palabra: ");
		palabra = teclado.nextLine();
		primera = palabra.substring(0, 1);
		num_letras = palabra.length();
		ultima = palabra.substring(num_letras - 1, num_letras);
		palabra = palabra.substring(0, num_letras - 1);
		palabra = palabra.replaceFirst(primera, ultima).concat(primera);
		System.out.println(palabra);

		teclado.close();
	}
}
