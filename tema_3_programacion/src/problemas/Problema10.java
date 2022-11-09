package problemas;

import java.util.Scanner;

/*Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso
(o que es mayor).*/
public class Problema10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Inserte un numero: ");
		num = teclado.nextInt();
		boolean esPrimo = false;
		int primoExceso = num + 1;
		for (int i = 2; i < primoExceso; i++) {
			boolean prueboPrimo = true;
			if (primoExceso % i == 0) {
				prueboPrimo = false;

			}
			if (prueboPrimo == true) {
				esPrimo = true;
			} else {
				primoExceso = primoExceso + 1;
			}
		}
		System.out.print("El numero primo siguiente a " + num + " es " + primoExceso);
		teclado.close();
	}

}
