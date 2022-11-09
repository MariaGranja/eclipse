package tema_4_prog;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		char caracteres, caracter_cambiado;
		int posicion;
		System.out.print("Inserta una frase: ");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			caracteres = frase.charAt(i);
			posicion = (int) caracteres + 3;
			caracter_cambiado = (char) posicion;
			System.out.print(caracter_cambiado);
		}
		teclado.close();
	}
}
