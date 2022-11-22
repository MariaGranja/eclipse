package repasoEvaluacion;

import java.util.Scanner;

public class Ej7 {
	/*
	 * Vamos a ampliar el ejercicio 4 anterior para considerar las horas extras.
	 * Escribe un programa que calcule el salario semanal de un trabajador teniendo
	 * en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a
	 * 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double horas, sueldo, horasOrdinarias = 0, horasExtras;
		System.out.print("Por favor, introduzca el numero de horas trabajadas durante la semana: ");
		horas = teclado.nextDouble();
		horasExtras = horas - 40;
		if (horasExtras <= 0)
			sueldo = horas * 12;
		else {
			horasOrdinarias = horas - horasExtras;
			sueldo = horasOrdinarias * 12 + horasExtras * 16;
		}

		System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros.");
		teclado.close();
	}
}
