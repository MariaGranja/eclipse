package problemasMates;

import java.util.Scanner;

public class Problema1 {
/*Programa que simula un generador de pruebas de cálculo para niños de primaria*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int operacion, acierto = 0, fallo = 0;
		int min = 1, max = 20;
		System.out.println("Selecciona un tipo de operacion de la siguiente lista:");
		System.out.println("1. Suma");
		System.out.println("2. Diferencia");
		System.out.println("3. Producto");
		System.out.print("Indica el numero elegido: ");
		operacion = teclado.nextInt();
		switch (operacion) {
		case 1:
			System.out.println("Ha elegido la suma");
			for (int i = 0; i < 10; i++) {
				double resultadoSuma, num1, num2, suma;
				num1 = Math.floor(Math.random() * (max - min + 1) + min);
				num2 = Math.floor(Math.random() * (max - min + 1) + min);
				suma = num1 + num2;
				System.out.print(num1 + "+" + num2 + "=");
				resultadoSuma = teclado.nextDouble();
				if (resultadoSuma == suma) {
					acierto += 1;
				} else
					fallo += 1;
			}
			System.out.println("Has tenido " + acierto + " aciertos y " + fallo + " fallos.");
			System.out.println("Tu calificacion es " + acierto);
			break;
		case 2:
			System.out.println("Ha elegido la diferencia");
			for (int i = 0; i < 10; i++) {
				double resultadoDiferencia, num1, num2, diferencia;
				num1 = Math.floor(Math.random() * (max - min + 1) + min);
				num2 = Math.floor(Math.random() * (max - min + 1) + min);
				diferencia = num1 - num2;
				System.out.print(num1 + "-" + num2 + "=");
				resultadoDiferencia = teclado.nextDouble();
				if (resultadoDiferencia == diferencia) {
					acierto += 1;
				} else
					fallo += 1;
			}
			System.out.print("Has tenido " + acierto + " aciertos y " + fallo + " fallos.");
			System.out.println("Tu calificacion es " + acierto);

			break;
		case 3:
			System.out.println("Ha elegido la diferencia");
			for (int i = 0; i < 10; i++) {
				double resultadoProducto, num1, num2, producto;
				num1 = Math.floor(Math.random() * (max - min + 1) + min);
				num2 = Math.floor(Math.random() * (max - min + 1) + min);
				producto = num1 * num2;
				System.out.print(num1 + "*" + num2 + "=");
				resultadoProducto = teclado.nextDouble();
				if (resultadoProducto == producto) {
					acierto += 1;
				} else
					fallo += 1;
			}
			System.out.print("Has tenido " + acierto + " aciertos y " + fallo + " fallos. ");
			System.out.println("Tu calificacion es " + acierto);
			break;
		}
		teclado.close();
	}

}
