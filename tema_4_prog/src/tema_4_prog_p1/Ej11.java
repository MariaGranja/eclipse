package tema_4_prog_p1;

import java.util.Scanner;

public class Ej11 {
	/*
	 * Programa que lee una frase (máximo 60 caracteres) y diga cuántas letras
	 * distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto
	 * de letras debemos trabajar solo con mayúsculas. Indica cuáles son los
	 * ficheros de entrada y salida del compilador.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		char letra;
		int veces = 0, diferente = 0;
		System.out.print("Escriba una frase: ");
		frase = teclado.nextLine().toUpperCase().replace(" ", "");
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			boolean nueva = true;
			for (int j = 0; j < i; j++) {
				if (letra == frase.charAt(j))
					nueva = false;
			}
			if (nueva) {
				diferente++;
				for (int j = i + 1; j < frase.length(); j++) {
					if (letra == frase.charAt(j)) {
						veces++;
					}
				}
				System.out.println("La frecuenca de la letra " + letra + " es: " + (float) veces / frase.length());
			}
		}
		System.out.println("Hay " + diferente + " letras diferentes");
		teclado.close();
	}
}