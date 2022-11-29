package repasoEvaluacion;

import java.util.Scanner;

public class Ej15 {
	/*
	 * Realiza un programa que pida primero un número y a continuación un dígito. El
	 * programa nos debe dar la posición (o posiciones) contando de izquierda a
	 * derecha que ocupa ese dígito en el número introducido.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String numero;
		char digito;
		int posicion;
		System.out.print("Introduce un numero: ");
		numero = teclado.nextLine();
		System.out.println("Indica un numero para buscar dento del numero: ");
		digito = teclado.next().charAt(0);
		posicion = numero.indexOf(digito);
		System.out.println(posicion);
		teclado.close();
	}
}
