package exepciones_I;

import javax.swing.*;

public class Fallos {
	
	public static void main(String[] args) {
		
		int [] mi_matriz = new int[5];

		mi_matriz[0] = 5;
		mi_matriz[1]= 38;
		mi_matriz[2] = 15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		
		
		for(int i = 0 ; i < 5; i++) {
			
			System.out.println("Posicion "+ i+" = " + mi_matriz[i]);
		}
		
		
		//Pedimo los datos a la persona
		
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce edad"));
		
		System.out.println("Hola "+ nombre+" tienes "+edad +" años "+ " El programa termino su ejecucion");
		
		
	}

}






















