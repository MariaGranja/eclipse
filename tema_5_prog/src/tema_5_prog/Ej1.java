package tema_5_prog;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean primo = true;
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();
		primo = esPrimo(numero);
		System.out.println("el numero" + numero + primo != null ? "" : "no" + "es primo");

		teclado.close();
	}

	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo;
		primo = true;
		while (primo && contador < numero) {
			primo = numero % contador != 0;
			contador++;
		}
		return primo;
	}
}
