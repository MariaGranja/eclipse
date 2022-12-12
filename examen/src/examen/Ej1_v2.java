package examen;

import java.util.Scanner;

public class Ej1_v2 {
	/*
	 * Solicita un entero positivo e imprime lineas con asteriscos
	 * 
	 * @author Maria Granja
	 */
	public static void main(String[] args) {
		int num;// numero que solicitamos
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduzca un entero positivo: ");
			num = teclado.nextInt();
			if (num < 1) {
				System.out.println("Error: Numero no valido");
			}
		} while (num < 1);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {// espacios
				System.out.print(" ");
			}
			for (int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		teclado.close();
	}
}
