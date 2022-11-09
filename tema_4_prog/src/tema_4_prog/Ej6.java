package tema_4_prog;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Inserte una frase");
		char caracter;
		String frase = teclado.nextLine();
		int vocal = 0, consonante = 0, numero = 0;
		frase = frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
				vocal++;
			} else if (caracter >= 'A' && caracter <= 'Z') {
				consonante++;
			} else if (caracter >= '0' && caracter <= '9') {
				numero++;
			}
		}
		System.out.println("Numero de vocales: " + vocal);
		System.out.println("Numero de consonantes: " + consonante);
		System.out.println("Numero de numeros: " + numero);
		teclado.close();
	}

}
