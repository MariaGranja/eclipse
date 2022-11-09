package problemas;

import java.util.Scanner;

public class Problema6 {
	/*
	 * Programa que va leyendo números por el teclado hasta que lea el cero, que
	 * indicará el fin de la entrada de datos. El programa calcular y escribe la
	 * suma de los números introducidos en lugar par y de los introducidos en lugar
	 * impar.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, suma_par = 0, suma_impar = 0, i = 1;
		System.out.print("Inserte un numero: ");
		num = teclado.nextInt();
		if (num == 0) {
			System.out.println("No existe lectura de datos");
		} else {
			do {
				System.out.print("Inserte un numero: ");
				num = teclado.nextInt();
				if (i % 2 == 0) {
					suma_par += num;
				} else
					suma_impar += num;
				i++;
			} while (num != 0);
			System.out.println("La suma de los numeros introducidos en lugares pares es " + suma_par);
			System.out.println("La suma de los numeros introducidos en lugares impares es " + suma_impar);
			teclado.close();
		}
	}
}
