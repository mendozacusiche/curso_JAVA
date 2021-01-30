package prueba;

import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu mombre por favor");
	
		String edad = JOptionPane.showInputDialog("Ingrese su edad");
	
		int edad_usuario = Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("hola  "+ nombre_usuario + " Tienes "+ (edad_usuario+1)+" años");
	}
	

}
