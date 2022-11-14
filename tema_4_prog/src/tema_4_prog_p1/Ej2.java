package tema_4_prog_p1;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		/*
		 * Dada una frase de no más de 80 caracteres hacer un programa que busque
		 * cuántas mayúsculas y minúsculas tiene y lo imprima.
		 */
		int mayuscula = 0, minuscula = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = teclado.nextLine();
		int n = frase.length();
		if (n < 80) {
			for (int i = 0; i < n; i++) {
				if (Character.isUpperCase(frase.charAt(i))) {
					mayuscula++;
				}
				else if (Character.isLowerCase(frase.charAt(i))) {
					minuscula++;
				}
			}
			System.out.println("El numero de mayusculas es " + mayuscula);
			System.out.println("El numero de minusculas es " + minuscula);
		} else
			System.out.println("no valido");
		teclado.close();
	}
}
