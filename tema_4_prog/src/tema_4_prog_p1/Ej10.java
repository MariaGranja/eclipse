package tema_4_prog_p1;

import java.util.Scanner;

public class Ej10 {
	/*
	 * Programa que lea códigos de personas de 8 caracteres de modo que los cuatro
	 * primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto
	 * carácter sea solo (H ó M) sexo, el sexto un número que representa el curso 1
	 * ó 2 y los caracteres séptimo y octavo pueden tener cualquier valor. Rechazar
	 * los códigos que no cumplan estas condiciones. La finalización de entrada de
	 * códigos se produce cuando se introduce el código “00000000”.
	 */
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		String codigo = "";
		int hombres_primero = 0, mujeres_primero = 0, hombres_segundo = 0, mujeres_segundo = 0, suma_codigo = 0;
		do {
			System.out.print("Introduce un codigo: ");
			codigo = teclado.next();
			if (codigo.length() == 8) {
				codigo=codigo.toUpperCase();
				int año = Integer.parseInt(codigo.substring(0, 4));
				char sexo = codigo.charAt(4);
				char curso = codigo.charAt(5);
				if (año >= 1990 && año <= 1995) {
					System.out.println("Año de nacimiento: " + año);
				} else {
					System.out.println("Año no valido");
				}
				if (sexo == 'M' && curso == '1') {
					System.out.println("Sexo masculino");
					System.out.println("Esta en el curso 1");
					hombres_primero++;
				} else if (sexo == 'F' && curso == '1') {
					System.out.println("Sexo femenino");
					System.out.println("Esta en el curso 1");
					mujeres_primero++;

				} else if (sexo == 'M' && curso == '2') {
					System.out.println("Sexo masculino");
					System.out.println("Esta en el curso 2");
					hombres_segundo++;
				} else if (sexo == 'F' && curso == '2') {
					System.out.println("Sexo femenino");
					System.out.println("Esta en el curso 2");
					mujeres_segundo++;
				} else {
					System.out.println("Sexo no valido");
					System.out.println("Curso no valido");
				}
				suma_codigo++;
			} else {
				System.out.println("El codigo no es valido");
			}
		} while (codigo.equals("00000000") != true);
		System.out.println("El numero de hombres en primero es " + hombres_primero);
		System.out.println("El numero de mujeres en primero es " + mujeres_primero);
		System.out.println("El numero de hombres en segundo es " + hombres_segundo);
		System.out.println("El numero de mujeres en segundo es " + mujeres_segundo);
		System.out.println("El numero de codigos validos es " + suma_codigo);

		teclado.close();
	}
}
