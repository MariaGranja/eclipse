package tema_4_prog;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		char caracteres, caracter_cambiado;
		int posicion, numero;
		System.out.print("Inserta una frase: ");
		frase = teclado.nextLine();
		System.out.print("Inserta un numero: ");
		numero = teclado.nextInt();
		frase = frase.toUpperCase();
		if (numero >= 1 && numero <= 10) {
			for (int i = 0; i < frase.length(); i++) {
				caracteres = frase.charAt(i);
				posicion = (int) caracteres + numero;
				caracter_cambiado = (char) posicion;
				System.out.print(caracter_cambiado);
			}
			teclado.close();
		}
	}
}
