package examen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej4 {
	/* Programa que calcula cambios a devolver. */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String producto;
		double precio, total, pagado;
		int unidades;
		System.out.print("Introduzca el producto a comprar: ");
		producto = teclado.nextLine();
		System.out.print("Introduzca el precio unitario: ");
		precio = teclado.nextDouble();
		System.out.print("Indique las unidades a comprar: ");
		unidades = teclado.nextInt();
		total = precio * unidades;
		DecimalFormat unitario = new DecimalFormat("000000.00");
		DecimalFormat unidad = new DecimalFormat("000");
		DecimalFormat precio_total = new DecimalFormat("00000000.00");
		System.out.println("El precio total de " + unidad.format(unidades) + " de " + producto + " con precio "
				+ unitario.format(precio) + "euros es de " + precio_total.format(total) + "euros");
		System.out.println("-------------------------------------");
		System.out.print("Introduzca la cantidad a pagar: ");
		pagado = teclado.nextDouble();
		if (pagado < total) {
			System.out.println("Error. La cantidad a pagar es " + precio_total.format(total) + "euros");
		} else if (pagado == total) {
			System.out.println("La cantidad es exacta");
		} else {
			int devolver = (int) (pagado - total);
			if (devolver >= 500) {
				System.out.println("Devulve " + (devolver / 500) + " billetes de 500");
				devolver = devolver % 500;
			}
			if (devolver >= 200) {
				System.out.println("Devuelve " + (devolver / 200) + " billetes de 200");
				devolver = devolver % 200;
			}
			if (devolver >= 100) {
				System.out.println("Devuelve " + (devolver / 100) + " billetes de 100");
				devolver = devolver % 100;
			}
			if (devolver >= 50) {
				System.out.println("Devuelve " + (devolver / 50) + " billetes de 50");
				devolver = devolver % 50;
			}
			if (devolver >= 20) {
				System.out.println("Devuelve " + (devolver / 20) + " billetes de 20");
				devolver = devolver % 20;
			}
			if (devolver >= 5) {
				System.out.println("Devuelve " + (devolver / 5) + " billetes de 5");
				devolver = devolver % 5;
			}
			if (devolver >= 2) {
				System.out.println("Devuelve " + (devolver / 2) + " monedas de 2");
				devolver = devolver % 2;
			}
			if (devolver >= 1) {
				System.out.println("Devuelve " + (devolver / 1) + " monedas de 1");
			}
			System.out.println("Y " + (int) ((pagado - total) * 100) + " centimos");
		}
		teclado.close();
	}
}
