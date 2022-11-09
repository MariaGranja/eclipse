package problemas;

import java.util.Scanner;

public class Problema1 {
	/*
	 * Escribir un programa que calcule e imprima la suma de los números enteros
	 * comprendidos entre A y B que deben leerse por teclado y filtrarse para que
	 * A<=B. Los valores de A y B no deben incluirse en la suma.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A, B, suma = 0;
		System.out.print("Inserte A: ");
		A = teclado.nextInt();
		System.out.print("Inserte B: ");
		B = teclado.nextInt();
		if (A <= B) {
			for (int i = A + 1; i < B; i++) {
				suma = suma + i;
			}
			System.out.println("La suma de los numeros es: " + suma);
		} else {
			System.out.println("No se puede realizar la suma");
		}
		teclado.close();
	}

}