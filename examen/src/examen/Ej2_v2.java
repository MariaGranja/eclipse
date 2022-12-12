package examen;

import java.math.BigInteger;
import java.util.Scanner;

public class Ej2_v2 {
	/*
	 * Programas que solicita un IBAN hasta ser valido
	 * 
	 * @author Maria Granja
	 */
	public static void main(String[] args) {
		String iban;// el que solicitamos
		Scanner teclado = new Scanner(System.in);
		boolean valido = true;
		do {
			System.out.println("Introduzca un IBAN");
			iban = teclado.nextLine().toUpperCase();
			valido = iban.length() == 24;// longitud
			if (valido) {// formato
				valido = Character.isLetter(iban.charAt(0)) && Character.isLetter(iban.charAt(1));
				int cont = 2;
				while (valido && cont < 24) {
					valido = Character.isDigit(iban.charAt(cont));
					cont++;
				}
				if (!valido) {
					System.out.println("El formato no es correcto");
				} else {
					String control = "00" + iban.substring(4, 12);
					int suma = 0, multiplicador = 1;
					for (int i = 0; i < 10; i++) {
						suma += (multiplicador % 11) * (control.charAt(i) - '0');

					}
					int digito = 11 - suma % 11;
					if (digito == 10) {
						digito = 1;
					} else if (digito == 11) {
						digito = 0;
					}
					valido = digito == iban.charAt(12) - '0';
				}
				if (!valido) {
					System.out.println("El 2 digito es erroneo");
				} else {
					String control = iban.substring(4) + (iban.charAt(0) - 'A' + 10) + (iban.charAt(1) - 'A' + 10)
							+ "00";
					BigInteger numero = new BigInteger(control);
					numero = numero.remainder(new BigInteger("97"));
					new BigInteger("98").subtract(numero);
					String digitos = numero.toString();
					if (digitos.length() == 1) {
						digitos = "0" + digitos;
						valido = digitos.equals(iban.substring(2, 3));
					}
				}
			}
		} while (!valido);
		teclado.close();
	}

}