package exepciones_I;

import javax.swing.JOptionPane;

public class Varias_Execepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			division();
			
		}catch(ArithmeticException e) {
			
			System.out.println("Estas dividiendo por 0");
			
		}catch(NumberFormatException e) {
			
			System.out.println("No has introducido un numero entero");
		
			System.out.println("Se ha generado un error de este tipo: "+e.getMessage());
		}
		
		

	}
	
	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		
		System.out.println("El resultado es: "+ num1 / num2);
		
	}

}
