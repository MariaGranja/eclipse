package primeraClase;

public class Aplicacion {
	public static void main(String[] args) {
		DivisoresPropios dp;
		dp = new DivisoresPropios();
		dp.setNumero(20);
		System.out.println("El valor de numero es: " + dp.getNumero());
	}
}
