package repasoEvaluacion;

import java.util.Scanner;

public class Ej2 {
	/*
	 * Escribe un programa que sume, reste, multiplique y divida dos números
	 * introducidos por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		System.out.print("Introduce un numero: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce otro numero: ");
		num2 = teclado.nextDouble();
		System.out.println("El resultado de la suma es " + (num1 + num2));
		System.out.println("El resultado de la resta es " + (num1 - num2));
		System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
		System.out.println("El resultado de la division es " + (num1 / num2));
		teclado.close();
	}
}
