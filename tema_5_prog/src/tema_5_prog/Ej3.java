package tema_5_prog;

import java.util.Scanner;

public class Ej3 {
	/*
	 * Hacer un programa que lea un número N filtrando a que sea mayor que cero y
	 * calcule su factorial La función a construir aquí se llamará factorial. El
	 * método main solo debe leer un valor y devolver su factorial (versión
	 * iterativa).
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, factorial;
		System.out.print("Introduzca un numero:");
		num = teclado.nextInt();
		if (num > 0) {
			factorial = factorial(num);
			System.out.println("El factorial del numero " + num + " es " + factorial);
		} else
			System.out.println("Numero no valido");
		teclado.close();
	}

	private static int factorial(int numero) {
		int resultado = 1;
		for (int i = numero; i > 0; i--) {
			resultado *= i;
		}
		return resultado;
	}

}
