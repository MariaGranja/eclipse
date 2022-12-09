package examen;

import java.util.Scanner;

public class Ej3 {
	/*
	 * Escribe un conversor genérico, de decimal a cualquier base, al menos, hasta
	 * hexadecimal (base 16).
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, base, modulo, cociente;
		String solucion = "";
		System.out.println("Inserte un numero positivo en base 10: ");
		num = teclado.nextInt();
		System.out.println("Inserte la base a la que quiere pasar: ");
		base = teclado.nextInt();
		cociente = num / base;
		modulo = num % base;
		while (cociente != 0) {
			solucion = modulo + solucion;
			modulo = cociente % base;
			cociente = cociente / base;

		}
		solucion = modulo + solucion;
		System.out.println(solucion);
		teclado.close();
	}
}
