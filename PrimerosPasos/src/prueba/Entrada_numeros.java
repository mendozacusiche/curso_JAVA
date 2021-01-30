package prueba;
import javax.swing.*;

public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		//double x = 10000.0;
		
		String num1 =JOptionPane.showInputDialog("Indroduce un numero");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.println("la Raix de "+ num2+ "es");
		//System.out.printf("%1.2f",x/3);
		
		System.out.printf("%1.4f", Math.sqrt(num2));
	}

}
