package exepciones_I;

import java.io.IOException;
import java.util.*;

public class Entrad_datos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del Programa");
		System.out.println();

		Scanner entrada = new Scanner(System.in);

		int decision = entrada.nextInt();

		if (decision == 1) {
			try {
			pedirDatos();
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("datos ingresados no validos");
			}
		} else {

			System.out.println("Adios");

			System.exit(0);
		}
		entrada.close();
	}

	static void pedirDatos() throws InputMismatchException {
		//try {
			Scanner entrada = new Scanner(System.in);

			System.out.println("Introduce tu nombre por favor");

			String nombre_usuario = entrada.nextLine();

			System.out.println("Introdece tu edad, por favor");

			int edad = entrada.nextInt();

			System.out.println("Hola " + nombre_usuario + "El año que viene tendras " + (edad + 1) + " años");
			entrada.close();
		//} catch (InputMismatchException e) {

			System.out.println("que demonios has introducido ");
		//}

		System.out.println("Hemos terminado");

	}

}
