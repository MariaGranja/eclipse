package tema_5_prog;

import java.util.Scanner;

public class Ej4 {
	/*
	 * Dado un número N que se pedirá por teclado y debe ser positivo, imprimir la
	 * lista de todos los numero primos hasta dicho número incluido. Hacer este
	 * programa usando el método primo que ya tenéis construido.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		while (true) {
			System.out.print("ingrese un numero: ");
			numero = teclado.nextInt();
			if (numero > 0) {
				for (int i = 2; i <= numero; i++) {
					boolean esPrimo = Ej1.esPrimo(i);
					if (esPrimo) {
						System.out.println("El numero " + i + " es un numero primo");
					}
				}
				{
					break;
				}

			} else
				System.out.println("el numero ingresado no es correcto. " + "intentalo de nuevo");
		}
		teclado.close();
	}
}
