package tema_4_prog_p2;

import java.util.Scanner;

public class Ej6 {
	/*
	 * Programa que pide por teclado una frase y cambie cada ocurrencia de la
	 * palabra “si” por la palabra “no”. Después lo muestra por pantalla.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.print("Introduce una frase: ");
		frase = teclado.nextLine();
		frase = frase.replaceAll("si", "no");
		System.out.println(frase);
		teclado.close();
	}
}
