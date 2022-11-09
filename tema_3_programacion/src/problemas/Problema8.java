package problemas;

import java.util.Scanner;

/*Hacer un programa que lea un número N filtrando que debe ser mayor que cero y 
 * calcule su factorial.*/
public class Problema8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i, factorial = 1;
		System.out.print("Inserte un numero: ");
		num = teclado.nextInt();
		for (i = num; i > 0; i--) {
			factorial *= i;
		}
		System.out.print("El factorial de" + " " + num + " " + "es" + " " + factorial);
		teclado.close();
	}
}
