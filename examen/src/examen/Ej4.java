package examen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej4 {
	/* Programa que calcula cambios a devolver. */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String producto;
		double precio, total,pagado,devolver;
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
		pagado=teclado.nextDouble();
		if(pagado<total) {
			System.out.println("Error. La cantidad a pagar es "+precio_total.format(total)+"euros");
		}else if(pagado==total) {
			System.out.println("La cantidad es exacta");
		}else {
			devolver=pagado-total;
			
		}
	}
}
