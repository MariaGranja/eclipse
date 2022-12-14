package tema_4_prog_p1;

import java.util.Scanner;

public class Ej12 {
	/*
	 * Hacer un programa para que pida una palabra de no más de 20 caracteres y
	 * efectúe todas las rotaciones posibles de dicha palabra de forma que el último
	 * carácter pase al primero y los demás corran un espacio
	 */
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int ultimo, i = 0;
		System.out.print("Inserte una frase: ");
		frase = teclado.nextLine();
		if (frase.length() > 20) {
			System.out.println("Palabra no valida.");
		} else {
			ultimo = frase.length();
			while (ultimo > i) {
				frase = frase.charAt(ultimo - 1) + frase.substring(0, (ultimo - 1));
				System.out.println(frase);
				i++;
			}
		}
		teclado.close();
	}
}
