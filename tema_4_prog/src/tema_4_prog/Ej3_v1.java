package tema_4_prog;

import java.util.Scanner;

public class Ej3_v1 {
	public static void main(String[] args) {
		/*
		 * Programa que lea una frase y una palabra y que nos diga la posición de dicha
		 * palabra en la frase y si no la encuentra devuelva un cero.
		 */
		Scanner teclado=new Scanner(System.in);
		String frase, palabra;
		System.out.print("Inserta una frase: ");
		frase=teclado.nextLine();
		System.out.print("Inserta una palabra: ");
		palabra=teclado.nextLine();
		int posicion=frase.indexOf(palabra);
		System.out.print(posicion);
		
		
		teclado.close();
	}
}
