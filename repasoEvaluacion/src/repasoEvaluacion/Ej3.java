package repasoEvaluacion;

import java.util.Scanner;

public class Ej3 {
	/* Escribe un programa que calcule el área de un rectángulo. */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double base, altura, area;
		System.out.print("Introduce la altura del rectangulo: ");
		altura = teclado.nextDouble();
		System.out.print("Introduce la base del rectangulo: ");
		base = teclado.nextDouble();
		area = base * altura;
		System.out.println("El area del rectangulo es " + area);
		teclado.close();
	}
}
