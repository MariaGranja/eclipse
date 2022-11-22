package repasoEvaluacion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej5 {
	/*
	 * Escribe un programa que calcule la nota que hace falta sacar en el segundo
	 * examen de la asignatura Programación para obtener la media deseada. Hay que
	 * tener en cuenta que la nota del primer examen cuenta el 12% y la del segundo
	 * examen un 28%. Nota: Al normalizar sus valores, la nota del primer examen
	 * cuenta el 30% y la del segundo el 70%.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota, evaluacion, notaEx;

		System.out.print("Introduce la nota del primar examen: ");
		nota = teclado.nextDouble();

		System.out.print("¿Que nota quieres sacar en la segunda evaluacion? ");
		evaluacion = teclado.nextDouble();

		notaEx = ((evaluacion - (nota * 0.3)) / 0.7);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.printf("Para tener un " + evaluacion + " en la segunda evaluacion necesitas sacar un "
				+ df.format(notaEx) + " en el segundo examen.");
		teclado.close();
	}
}
