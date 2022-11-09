package problemas;

import java.util.Scanner;

/*Realizar un programa que elija mediante un menú un tipo de figura:Triángulo,Cuadrado,Rectángulo.
Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos
la muestre.*/
public class Problema12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int figura;
		System.out.println("Selecciona la figura para calcular el area de la siguiente lista:");
		System.out.println("1. Triangulo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Rectangulo");
		System.out.print("Introduce el numero elegido: ");
		figura = teclado.nextInt();
		switch (figura) {
		case 1:
			System.out.println("Ha seleccionado el triangulo");
			// A=(b*h)/2
			double a, b, h;
			System.out.print("Introduce la medida de la base (m): ");
			b = teclado.nextDouble();
			System.out.println("Introduce la medida de la altura (m): ");
			h = teclado.nextDouble();
			a = (b * h) / 2;
			System.out.print("El area del triangulo es " + a + " m^2");
			break;
		case 2:
			System.out.println("Ha seleccionado el cuadrado");
			// A=l*l
			double A, l;
			System.out.print("Introduce la medida del lado (m): ");
			l = teclado.nextDouble();
			A = l * l;
			System.out.print("El area del cuadrado es " + A + " m^2");
			break;
		case 3:
			System.out.println("Ha seleccionado el rectangulo");
			// A=l*a
			double area, largo, ancho;
			System.out.print("Introduce la medida del largo (m): ");
			largo = teclado.nextDouble();
			System.out.print("Introduce la medida del ancho (m): ");
			ancho = teclado.nextDouble();
			area = largo * ancho;
			System.out.print("El area del rectangulo es " + area + " m^2");
			break;
		default:
			System.out.println("El numero que ha seleccionado no es valido");
			break;
		}
		teclado.close();
	}

}
