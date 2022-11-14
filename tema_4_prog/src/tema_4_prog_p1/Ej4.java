package tema_4_prog_p1;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba una frase: ");
		String frase = teclado.nextLine();
		System.out.println("Elige una opcion");
		System.out.println("1. Pasar todo a mayusculas");
		System.out.println("2. Pasar todo a minusculas");
		int eleccion = teclado.nextInt();
		switch (eleccion) {
		case 1:
			System.out.print(frase.toUpperCase());
			break;
		case 2:
			System.out.print(frase.toLowerCase());
			break;
		}
		teclado.close();
	}
}
