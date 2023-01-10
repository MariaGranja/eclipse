package tema_5_prog_p2;

public class Disco {
	/*
	 * Crear una clase Disco para guardar información sobre los discos de música que
	 * tenemos.La información asociada a cada uno de los discos es: Titulo, n de
	 * canciones, precio y fecha de compra.
	 */
	String titulo;
	int n_canciones, fecha_de_compra;
	double precio;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getN_canciones() {
		return n_canciones;
	}

	public void setN_canciones(int n_canciones) {
		this.n_canciones = n_canciones;
	}

	public int getFecha_de_compra() {
		return fecha_de_compra;
	}

	public void setFecha_de_compra(int fecha_de_compra) {
		this.fecha_de_compra = fecha_de_compra;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}