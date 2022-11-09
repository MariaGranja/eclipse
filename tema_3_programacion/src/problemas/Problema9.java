package problemas;

import java.util.Scanner;

/*Hacer un programa que lea un número y nos diga si es perfecto o no.*/
public class Problema9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i = 1, resto, suma = 0;
		System.out.print("Inserta una numero: ");
		num = teclado.nextInt();
		while (num != i && num > i) {
			resto = num % i;
			if (resto == 0) {
				suma += i;
			}
			i++;
		}
		if (suma == num) {
			System.out.print("El numero" + " " + num + " " + "es perfecto");
		} else
			System.out.print("El numero" + " " + num + " " + "no es perfecto");
		teclado.close();
	}
}
