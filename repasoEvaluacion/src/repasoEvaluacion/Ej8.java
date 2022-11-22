package repasoEvaluacion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej8 {
	/*
	 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
	 * una altura h.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double h, t;
		System.out.print("Introduzca la altura de la que cae el objeto en metros: ");
		h = teclado.nextDouble();
		t = Math.sqrt(((2 * h) / 9.81));
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("El tiempo que tardara en caer el objeto seran " + df.format(t) + " segundos.");
		teclado.close();
	}
}
