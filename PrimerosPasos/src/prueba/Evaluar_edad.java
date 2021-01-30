package prueba;

import java.util.*;

public class Evaluar_edad {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad, por favor");

		int edad = entrada.nextInt();

		if (edad >= 18) {
			System.out.println(" Usted es mayor de");

		} else {
			System.out.println("Usted aun no es mayor de edad ");
		}

	}

}
