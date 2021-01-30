package prueba;

import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	
		int resultado = 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		
		for( int i = numero; i> 0; i--) {
			
			resultado = resultado *i;
		}
		
		System.out.println("El factorial de "+ numero +" es "+ resultado);
	}

}
