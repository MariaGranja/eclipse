package tema_5_prog_p1;

import java.util.Scanner;

public class Ej9 {
	/*
	 * Escribir un programa que llame a un método con los coeficientes de una
	 * ecuación de segundo grado, a, b y c, y devuelva sus raíces en el caso de ser
	 * reales. Nota. Las raíces de una ecuación son :
	 * 
	 * R1=(-b+raíz(b^2-4*a*c))/(2*a) R2=(-b-raíz(b^2-4*a*c))/(2*a)
	 * 
	 * Para la raíz llamar a la clase Math y el método raíz que es sqrt. Esta
	 * función solo se puede aplicar en el caso de que valor sea positivo es decir:
	 * b^2 -4*a*c > 0.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		int diferenciador;
		double R1, R2;
		System.out.println("Introduce un numero: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		b = teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		c = teclado.nextInt();
		diferenciador = b * b - 4 * a * c;
		if (diferenciador > 0) {
			R1 = r1(a, b, c);
			System.out.println("R1 es " + R1);
			R2 = r2(a, b, c);
			System.out.println("R2 es" + R2);
		} else
			System.out.println("El diferenciador da negativo por lo tanto no es valido");
		teclado.close();
	}

	public static double r1(int num1, int num2, int num3) {
		double res1 = (-num2 + (Math.sqrt((num2 * num2) - 4 * num1 * num3))) / (2 * num1);
		return res1;
	}

	public static double r2(int num1, int num2, int num3) {
		double res2 = (-num2 - (Math.sqrt((num2 * num2) - 4 * num1 * num3))) / (2 * num1);
		return res2;
	}

}
