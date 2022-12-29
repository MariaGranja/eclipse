package tema_5_prog;

import java.util.Scanner;

public class Ej6 {
	/*
	 * Escribir un método que reciba dos parámetros enteros p y q y devuelva el
	 * mínimo común múltiplo de ambos.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p, q, res;
		System.out.println("Inserte un numero: ");
		p = teclado.nextInt();
		System.out.println("Inserta otro numero: ");
		q = teclado.nextInt();
		res = mcm(p, q);
		System.out.println("El mcm es " + res);
		teclado.close();
	}

	public static int mcm(int p, int q) {
		int a = Math.max(p, q);
		int b = Math.min(p, q);
		int resultado = (a / Ej5.mcd(p, q)) * b;
		return resultado;
	}
}
