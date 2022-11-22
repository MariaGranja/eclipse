package repasoEvaluacion;

import java.util.Scanner;

public class Ej11 {
	/*
	 * Realiza un programa que calcule el precio de unas entradas de cine en función
	 * del número de personas y del día de la semana. El precio base de una entrada
	 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros.
	 * Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11
	 * euros. Con la tarjeta CinePas se obtiene un 10% de descuento. Si un jueves,
	 * un grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
	 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
	 * 1 individual que son 41 euros (33 + 8).
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		int personas, precio;
		System.out.print("Introduce el dia de la semana: ");
		dia = teclado.nextLine().toLowerCase();
		System.out.print("Introduce el numero de personas: ");
		personas = teclado.nextInt();
		
		if (dia.equals("miercoles")) {
			precio = personas * 5;
		} else if (dia.equals("jueves")) {
			int pareja = personas % 2;
			if (pareja == 0) {
				personas = personas / 2;
				precio = personas * 11;
			} else {
				personas = personas / 2;
				precio = personas * 11 + 8;
			}
		} else {
			precio = personas * 8;
		}

		System.out.println("El precio final es de " + precio + " euros.");
		teclado.close();
	}
}
