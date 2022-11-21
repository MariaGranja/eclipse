package tema_4_prog_p2;

import java.util.Scanner;

public class Ej4 {
	/*
	 * Programa que pide por teclado dos nombres con su apellido. Después debe
	 * intercambiar los apellidos a los nombres y mostrarlos.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre1, apellido1, nombre2, apellido2;
		System.out.println("Introduce un nombre y un apellido: ");
		nombre1 = teclado.nextLine();
		System.out.println("Introduce otro nombre y apellido");
		nombre2 = teclado.nextLine();
		apellido1 = nombre1.split(" ")[1].trim();
		apellido2 = nombre2.split(" ")[1].trim();
		nombre1 = nombre1.replace(apellido1, apellido2);
		nombre2 = nombre2.replace(apellido2, apellido1);
		System.out.println(nombre1);
		System.out.println(nombre2);
		teclado.close();
	}
}
