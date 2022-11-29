package repasoEvaluacion;

public class Ej20 {
	/*
	 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
	 * siguientes requisitos: El ordenador mostrará una tirada que consiste en
	 * mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura,
	 * campana y limón. a. Si las tres figuras son diferentes se debe mostrar el
	 * mensaje “Lo siento, ha perdido”. b. Si hay dos figuras iguales y una
	 * diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. c. Si 
	 * las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10
	 * monedas”.
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido a la maquina tragaperras.\n---------------------------------");
		// Estas variables van a almacenar las figuras que saldran al azar
		int figuras, figura1 = 0, figura2 = 0, figura3 = 0;
		System.out.println();
		// Se generan 3 figuras al azar
		for (int i = 1; i <= 3; i++) {
			figuras = (int) (Math.random() * 5 + 1);
			// se almacenan las tres figuras
			if (i == 1) {
				figura1 = figuras;
			} else if (i == 2) {
				figura2 = figuras;
			} else if (i == 3) {
				figura3 = figuras;
			}
			switch (figuras) {
			case 1:
				System.out.println("Corazon");
				break;
			case 2:
				System.out.println("Diamante");
				break;
			case 3:
				System.out.println("Herradura");
				break;
			case 4:
				System.out.println("Campana");
				break;
			case 5:
				System.out.println("Limon");
				break;
			default:
				System.out.println("Nada");
			}
		}
		System.out.println("------------------------------------------------------");
		//se muestran los resultados segun las condiciones
		if ((figura1==figura2)&&(figura2==figura3)) {
			System.out.println("Enhorabuena, ha ganado 10 monedas");
		}else if((figura1==figura2)||(figura1==figura3)||(figura2==figura3)) {
			System.out.println("Bien, ha recuperado su moneda");
		}else {
			System.out.println("Lo siento, ha perdido");
		}
	}
}
