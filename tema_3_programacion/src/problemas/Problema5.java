package problemas;

import java.util.Scanner;

public class Problema5 {
	/*
	 * Hacer un programa que lea una serie de números por teclado de manera que
	 * cuando el número leído sea el cero ya no se introduzcan más; el programa debe
	 * calcular y escribir la suma de los números de la serie y cuántos se han
	 * introducido en total.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0, suma = 0, i = 0;
		do {
			System.out.print("Inserta un numero: ");
			numero = teclado.nextInt();
			suma += numero;
			i++;
		} while (numero != 0);
		i = i - 1;
		System.out.println("La suma de los numeros es " + suma);
		System.out.println("La cantidad de numeros introducidos es " + i);
		teclado.close();
	}
}
