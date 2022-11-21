package tema_4_prog_p2;

import java.util.Scanner;

public class Ej1 {
	/*
	 * Escribir un programa que pida por teclado una cadena y una letra, de manera
	 * que ponga en mayúsculas cada ocurrencia de la letra que haya en la cadena y
	 * lo muestre por pantalla.
	 */
	public static void main(String[] args) {
		String frase, letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Inserte una frase: ");
		frase = teclado.nextLine();
		System.out.print("Escriba una letra: ");
		letra = teclado.nextLine();
		frase = frase.replaceAll(letra, letra.toUpperCase());
		System.out.print(frase);
		teclado.close();
	}
}