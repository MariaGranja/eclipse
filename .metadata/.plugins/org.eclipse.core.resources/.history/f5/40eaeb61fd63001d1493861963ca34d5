package tema_4_prog;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		int mayuscula = 0, minuscula = 0, numero = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = teclado.nextLine();
		int n = frase.length();
		if (n < 80) {
			for (int i = 0; i < n; i++) {
				if (Character.isUpperCase(frase.charAt(i)))
					mayuscula++;
				if (Character.isLowerCase(frase.charAt(i)))
					minuscula++;
				if (Character.isDigit(frase.charAt(i)))
					numero++;
			}
			System.out.println("El numero de mayusculas es " + mayuscula);
			System.out.println("El numero de minusculas es " + minuscula);
			System.out.println("El numero de numeros es " + numero);
		} else
			System.out.println("no valido");
		teclado.close();
	}
}
