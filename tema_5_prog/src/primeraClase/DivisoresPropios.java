package primeraClase;

public class DivisoresPropios {
	int numero;
	public DivisoresPropios() {
		System.out.println("Soy el constructor sin parametros");
	}
	
	public DivisoresPropios(int num) {
		this();
		numero=num;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
		
}
