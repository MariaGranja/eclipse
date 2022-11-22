package repasoEvaluacion;

import java.util.Scanner;

public class Ej10 {
	/*
	 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
	 * los segundos que faltan para llegar a la medianoche.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String hora;
		int horas, minutos, segundos;
		System.out.print("Introduce la hora que es(hh:mm): ");
		hora = teclado.nextLine();
		horas = Integer.parseInt(hora.substring(0, 2));
		minutos = Integer.parseInt(hora.substring(3, 5));
		horas = 24 - horas;
		minutos = 60 - minutos;
		segundos = (horas * 60) + (minutos * 120);
		System.out.println("Quedan " + segundos + " segundos para medianoche.");
		teclado.close();
	}
}
