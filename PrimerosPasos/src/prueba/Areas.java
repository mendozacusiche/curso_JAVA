package prueba;
import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige un a opcion: \n1: Cuadrado  \n2: Rectangulo \n3: Triangulo \n4: Circulo ");
	
	
		int figura = entrada.nextInt();
		
		
		switch (figura) {
		
		case 1:
			
				int lado =Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				
				System.out.println("El áres del cuadrado es " + Math.pow(lado, 2));
				break;
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introdude la  base"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introdece la altura"));
			
			System.out.println("El área del rectangulo es "+ base*altura );
		
			break;
			
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introdude la  base"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introdude la  base"));
			
			System.out.println("El área del triangulo es "+ (base* altura)/2);
			
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introdude el radio"));
			
			System.out.println("El área del cículo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
		default:
			
			System.out.println("La opción no es correcta");
			
		}
		
		
	}

}
