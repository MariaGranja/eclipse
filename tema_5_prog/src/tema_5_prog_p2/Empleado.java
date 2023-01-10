package tema_5_prog_p2;

import java.util.Scanner;

public class Empleado {
	/*
	 * Crear una clase llamada Empleado que contenga como datos miembro el nombre y
	 * el número de empleado, y como métodos miembro leerDatos para leer los datos
	 * desde teclado y verDatos para mostrarlos en pantalla, además de los getters y
	 * setters que sean necesarios.
	 */
	String nombre;
	int numero_empleado;

	public Empleado() {
		this.numero_empleado = 0;
		this.nombre = "";
	}

	public Empleado(String nombre, int numero_empleado) {
		this.numero_empleado = numero_empleado;
		this.nombre = nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNumero(int numero_empleado) {
		this.numero_empleado = numero_empleado;
	}

	public int getNumero() {
		return numero_empleado;
	}

	public static  Empleado leerDatos(Scanner entrada) {
		int numero_empleado=entrada.nextInt();
		String nombre=entrada.next();
		return new Empleado(nombre,numero_empleado);
	}

	public static void verDatos(String nombre, int numero_empleado) {
		System.out.println(nombre+numero_empleado);
	}
}
