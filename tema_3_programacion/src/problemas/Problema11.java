package problemas;

import java.util.Scanner;

/*Dado un numero N imprimir la lista de todos los numero primos hasta dicho numero N.*/
public class Problema11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		while (true) {
			System.out.print("ingrese un numero: ");
			num = teclado.nextInt();
			if (num > 0) {
				for (int i = 2; i <= num; i++) {
					int creciente = 2;
					boolean esPrimo = true;
					while (esPrimo && creciente < i) {
						if (i % creciente == 0) {
							esPrimo = false;
						} else {
							creciente++;
						}
					}
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
