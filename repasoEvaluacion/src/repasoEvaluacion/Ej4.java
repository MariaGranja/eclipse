package repasoEvaluacion;

import java.util.Scanner;

public class Ej4 {
	/*
	 * Escribe un programa que calcule el salario semanal de un empleado en base a
	 * las horas trabajadas, a razón de 12 euros la hora.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double horas, sueldo;
		System.out.println("Introduce las horas trabajadas: ");
		horas = teclado.nextDouble();
		sueldo = horas * 12;
		System.out.println("El salario semanal es de " + sueldo + " euros");
		teclado.close();
	}
}
