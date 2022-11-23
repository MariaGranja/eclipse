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
		int jugador1, jugador2;
		System.out.println(
				"Juego de piedra, papel o tijera\nSelecciona con un numero la jugadada que quieras hacer\n1. Piedra\n2. Papel\n3. Tijera");
		System.out.println("Jugada usuario 1: ");
		jugador1 = teclado.nextInt();
		System.out.println("Jugada usuario 2: ");
		jugador2 = teclado.nextInt();
		switch (jugador1) {
		case 1:
			if (jugador2 == 1)
				System.out.println("Habeis empatado");
			else if (jugador2 == 2)
				System.out.println("El jugador 2 ha ganado");
			else if (jugador2 == 3)
				System.out.println("El jugador 1 ha ganado");
			break;
		case 2:
			if (jugador2 == 1)
				System.out.println("El jugador 1 ha ganado");
			else if (jugador2 == 2)
				System.out.println("Habeis empatado");
			else if (jugador2 == 3)
				System.out.println("El jugador 2 ha ganado");
			break;
		case 3:
			if (jugador2 == 1)
				System.out.println("El jugador 2 ha ganado");
			else if (jugador2 == 2)
				System.out.println("El jugador 1 ha ganado");
			else if (jugador2 == 3)
				System.out.println("Habeis empatado");
			break;
		default:
			System.out.println("La eleccion no es correcta");
			break;
		}
		teclado.close();
	}
}
