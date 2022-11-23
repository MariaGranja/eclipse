package repasoEvaluacion;

import java.util.Scanner;

public class Ej14 {
	/*
	 * Escribe un programa que pinte una pirámide rellena con un carácter
	 * introducido por teclado que podrá ser una letra, un número o un símbolo como
	 * *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
	 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
	 * hacia la izquierda o hacia la derecha y la altura de la misma.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número de niveles que tendrá la pirámide: ");

		int numeroNiveles = teclado.nextInt();

		int numeroPosiciones = numeroNiveles * 2 - 1;
		int posInicial = numeroNiveles;
		int posFinal = numeroNiveles;

		for (int i = 0; i < numeroNiveles; i++) {
			int contador = 1;
			String resultado = "";

			for (int j = 0; j <= numeroPosiciones; j++) {
				if ((j < posInicial) || (j > posFinal)) {
					resultado += " ";
				} else {
					if (j < numeroNiveles) {
						resultado += contador;
						contador++;
					} else {
						resultado += contador;
						contador--;
					}
				}
			}
			System.out.println(resultado);
			posFinal++;
			posInicial--;
		}
		teclado.close();
	}
}
