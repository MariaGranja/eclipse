package repasoEvaluacion;

import java.util.Scanner;

public class Ej1 {
	/*
	 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
	 * convertir debe ser introducida por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double euros, peseta;
		System.out.print("Introduce la cantidad en euros: ");
		euros = teclado.nextDouble();
		peseta = euros * 166.286;
		System.out.println(euros + " euros en pesetas son " + peseta + " pesetas");
		teclado.close();
	}

}
