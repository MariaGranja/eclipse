package tema_4_prog;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase, frase_par = " ", frase_impar = " ";
		System.out.print("frase: ");
		frase = teclado.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			if (i % 2 == 0) {
				frase_par = frase_par + frase.charAt(i);
			} else
				frase_impar = frase_impar + frase.charAt(i);
		}
		System.out.println("Los caracteres impares son: " + frase_impar);
		System.out.println("Los carcateres pares son: " + frase_par);
		teclado.close();
	}
}
