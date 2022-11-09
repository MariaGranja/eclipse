package problemas;

import java.util.Scanner;

public class Problema2 {
	/*
	 * Leer un número N que debe filtrarse entre 1 y 10 y a continuación calcular y
	 * escribir la tabla de multiplicar de ese número con el siguiente formato:
	 */
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int num, resultado, i = 1;
		System.out.print("Inserta un numero: ");
		num = teclado.nextInt();
		if (num >= 1 && 10 >= num) {
			System.out.println("TABLA DE MULTIPLICAR DE " + num);
			while (i <= 10) {
				resultado = num * i;
				System.out.print(num + "*" + i + "=" + resultado);
				i++;
			}
		} else
			System.out.println("No es posible hacer la tabla");
		teclado.close();
	}
}
