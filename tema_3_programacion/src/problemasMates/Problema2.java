package problemasMates;

import java.util.Scanner;

public class Problema2 {
	/* Programa que te hace adivinar un numero entre el 1 y 50 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int adivinanza, acierto = 0, intento;
		int min = 1, max = 50;
		System.out.println("Adivina un numero entre el 1 y 50.");
		System.out.println("Pensando...");
		adivinanza = (int) Math.floor(Math.random() * (max - min + 1) + min);
		while (acierto != adivinanza) {
			for (int i = 1; i <= 7; i++) {
				System.out.print("Inserta un numero: ");
				acierto = teclado.nextInt();
				intento = 7 - i;
				if (acierto > adivinanza) {
					System.out.println("Te has pasado.");
					System.out.println("Te quedan " + intento + " intentos.");
				} else if (acierto < adivinanza) {
					System.out.println("No has llegado.");
					System.out.println("Te quedan " + intento + " intentos.");
				} else {
					System.out.print("¡Has acertado!");
					break;
				}
			}
			System.out.print("Has agotado todos los intentos");
			break;
		}
		teclado.close();
	}
}
