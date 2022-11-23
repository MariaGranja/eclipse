package repasoEvaluacion;

public class Ej13 {
	/*
	 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
	 * utilizando un bucle for, un bucle while y un bucle do-while.
	 */
	public static void main(String[] args) {
		int i = 320, e = 320, o = 320;
		System.out.println("Hecho con bucle for");
		for (int x = 0; i >= 160; x++) {
			System.out.println(i);
			i -= 20;
		}
		System.out.println("Hecho con blucle while");
		while (o >= 160) {
			System.out.println(o);
			o -= 20;
		}
		System.out.println("Hecho con bucle do while");
		do {
			System.out.println(e);
			e -= 20;
		} while (e >= 160);
	}
}
