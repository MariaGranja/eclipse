package repasoEvaluacion;

import java.util.Scanner;

public class Ej9 {
	/*
	 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
	 * nacimiento.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String fecha;
		int dia, mes;
		System.out.print("Introduce tu fecha de nacimiento (dd/mm): ");
		fecha = teclado.nextLine();
		dia = Integer.parseInt(fecha.substring(0, 2));
		mes = Integer.parseInt(fecha.substring(3, 5));
		switch (mes) {
		case 1:
			if (dia < 21)
				System.out.println("Eres capricornio");
			else
				System.out.println("Eres acuario");
			break;
		case 2:
			if (dia < 20)
				System.out.println("Eres acuario");
			else
				System.out.println("Eres piscis");
			break;
		case 3:
			if (dia < 21)
				System.out.println("Eres piscis");
			else
				System.out.println("Eres aries");
			break;
		case 4:
			if (dia < 20)
				System.out.println("Eres aries");
			else
				System.out.println("Eres tauro");
			break;
		case 5:
			if (dia < 21)
				System.out.println("Eres tauro");
			else
				System.out.println("Eres geminis");
			break;
		case 6:
			if (dia < 21)
				System.out.println("Eres geminis");
			else
				System.out.println("Eres cancer");
			break;
		case 7:
			if (dia < 23)
				System.out.println("Eres cancer");
			else
				System.out.println("Eres leo");
			break;
		case 8:
			if (dia < 23)
				System.out.println("Eres leo");
			else
				System.out.println("Eres virgo");
			break;
		case 9:
			if (dia < 23)
				System.out.println("Eres virgo");
			else
				System.out.println("Eres libra");
			break;
		case 10:
			if (dia < 23)
				System.out.println("Eres libra");
			else
				System.out.println("Eres escorpio");
			break;
		case 11:
			if (dia < 22)
				System.out.println("Eres escorpio");
			else
				System.out.println("Eres sagitario");
			break;
		case 12:
			if (dia < 22)
				System.out.println("Eres sagitario");
			else
				System.out.println("Eres capricornio");
			break;
		}
		teclado.close();
	}
}
