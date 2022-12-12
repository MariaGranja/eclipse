package examen;

import java.util.Scanner;

public class Ej3_v2 {
	/*
	 * Convierto un numero a otra base
	 * 
	 * @author Maria Granja
	 */
	public static void main(String[] args) {
		int numero, base;
		String convertido = "";
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		numero = Math.abs(teclado.nextInt());
		do {
			System.out.print("Introcuzca la base:");
			base = teclado.nextInt();
		} while (base < 2 || base > 16);
		int aux = numero;
		do {
			int resto = aux % base;
			convertido = (base > 10 ? (resto > 9 ? resto - 10 + 'A' : resto) : resto) + convertido;
			aux /= base;
		} while (aux > 0);
		System.out.println("El numero " + numero + " en base " + base + " es " + convertido);
		teclado.close();
	}
}
