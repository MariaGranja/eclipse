package ejercicios;

import java.util.Scanner;

public class ej30 {
	public static void main(String[]args) {
		int i, j, z;
		int laMayor;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Inserta i ");
		i=teclado.nextInt();
		System.out.print("Inserta j ");
		j=teclado.nextInt();
		System.out.print("Inserta z ");
		z=teclado.nextInt();
		if (i>j && i>z) {
			laMayor=i;
			System.out.println(laMayor);
		}else if (j>i && j>z){
			laMayor=j;
			System.out.println(laMayor);
		}else if (z>i&&z>j) {
			laMayor=z;
			System.out.println(laMayor);
		}
		teclado.close();
	}
}
	