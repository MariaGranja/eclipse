package examen;

import java.util.Scanner;

public class Ej4_v2 {
	/*
	 * Programa que calcula un precio a partir de unos cuantos datos e indica la
	 * contidad a devolver
	 */
	public static void main(String[] args) {
		String producto;
		double precio, total, pago;
		int unidades;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el nombre del producto: ");
		producto = teclado.nextLine();
		System.out.println("Introduzca unidades:");
		unidades = teclado.nextInt();
		System.out.println("introduzca el precio");
		precio = teclado.nextDouble();
		total = precio * unidades;
		System.out.format("%S %9.2f %3d %11.2f%n", producto, precio, unidades, total);
		do {
			System.out.println("Introduzca cantidad para pagar");
			pago = teclado.nextDouble();
			teclado.nextLine();
			if (pago < total) {
				System.out.println("Error");
			}
		} while (pago < total);
		teclado.close();
	}
}
