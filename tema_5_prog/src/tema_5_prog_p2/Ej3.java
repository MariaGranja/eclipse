package tema_5_prog_p2;

import java.util.Scanner;

public class Ej3 {
	/*
	 * Cada trabajador tiene un numero identificativo que va de 1 a 100, además se
	 * controla su nombre, estado civil (S/C), turno (D/N), titulación (0 a 4) y
	 * años en la empresa. Escribir el código para definir la clase Trabajador y
	 * desarrollar los métodos para:
	 * 
	 * • Constructor con parámetros fijos para un trabajador nuevo 
	 * 
	 * • Modificar cualquier dato menos el identificador
	 * 
	 * • Visualizar los datos de un trabajador dado
	 *  
	 * • Calcular la nómina de un trabajador teniendo en cuenta que:
	 * 
	 * 		• El salario base es de 425 euros para todos 
	 * 
	 * 		• Se paga 100 euros extra en turno N
	 *  
	 * 		• Se paga 75 euros por año de antigüedad 
	 * 
	 * 		• La titulación se paga 250,500,1000,1250,1500 según sea de 0 a 4
	 * 
	 * • Se efectúa una retención de impuestos de la nómina del 12% a todos salvo a
	 * los casados que se les retiene el 10% 
	 * 
	 * Declarar los atributos y métodos correspondientes, desarrollarlos y probarlos en un programa
	 */
	public static void main(String[]args) {
		Scanner teclado=new Scanner (System.in);
		int numero, titulacion, años_empresa;
		String nombre;
		char estado_civil, turno;
		System.out.println("Introducir numero identificativo: ");
		numero=teclado.nextInt();
	}
}
