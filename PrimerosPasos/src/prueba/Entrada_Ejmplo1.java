package prueba;
import java.util.*;

public class Entrada_Ejmplo1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Ingrese tu nombre , por favor ");
	
		String nombre_Usuario= entrada.nextLine();
		
		System.out.println("Introduce su edad ");
		int edad = entrada.nextInt();
		
		System.out.println("hola "+ nombre_Usuario+ "  El año que biene tendras la edad de " +(edad +1));
	}

}
