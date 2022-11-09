package problemas;

import java.util.Scanner;

public class Problema7 {
	/*
	 * Programa que lee una secuencia de datos numéricos de longitud indefinida, de
	 * manera que cuando el número sea el cero cesará la entrada de dicha secuencia.
	 * El programa imprime la media de todos ellos, el mayor y el menor.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, suma_media = 0, i = 0, media, mayor, menor;
		System.out.print("Inserta un numero: ");
		num = teclado.nextInt();
		menor = mayor = num;
		do {
			System.out.print("Inserta un numero: ");
			num = teclado.nextInt();
			suma_media += num;
			i++;

			if (num > mayor) {
				mayor = num;
			}
			if (num < menor && num != 0) {
				menor = num;
			}
		} while (num != 0);
		i = i - 1;
		media = suma_media / i;
		System.out.println("La media de los numeros es " + media);
		System.out.println("El numero mayor es " + mayor);
		System.out.print("El numero menor es " + menor);

		teclado.close();
	}
}
