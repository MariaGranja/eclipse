package repasoEvaluacion;

import java.util.Scanner;

public class Ej12 {
	/*
	 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
	 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una
	 * opción incorrecta, el programa deberá mostrar un mensaje de error.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String jugador1, jugador2;
		System.out.println("Jugada usuario 1");
		jugador1 = teclado.next();
		System.out.println("Jugada usuario 2");
		jugador2 = teclado.next();
	}
}
