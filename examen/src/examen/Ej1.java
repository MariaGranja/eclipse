package examen;

import java.util.Scanner;

public class Ej1 {
	/*
	 * Programa que solicite introducir un entero positivo y obtenga por pantalla la
	 * siguiente salida, según el valor introducido.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, contador = 0;
		System.out.print("Inserte un numero: ");
		num = teclado.nextInt();
		while (num > 0) {
			for (int i = 0; i < contador; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
			contador++;
			num--;
		}
		teclado.close();
	}
}
