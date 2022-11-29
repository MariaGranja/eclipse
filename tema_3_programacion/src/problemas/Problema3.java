package problemas;

import java.util.Scanner;

public class Problema3 {
	/*
	 * Programa que, una vez que lea un número N por teclado, calcule y escriba los
	 * divisores propios de N por la pantalla.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i = 2, resultado, resto;
		System.out.print("Inserta una numero: ");
		num = teclado.nextInt();
		if (num <= 3) {
			System.out.println("El numero " + num + " no tiene divisores propios");
		} else {
			while (num != i && num > i) {
				resto = num % i;
				resultado = num / i;
				if (resto == 0) {
					System.out.println(num + "/" + i + "=" + resultado);
					System.out.println("El numero " + i + " es un divisor propio");
				}
				i++;
			}
		}
		teclado.close();
	}
}