package exepciones_I;

import java.util.*;

import javax.swing.JOptionPane;

public class Areas_Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Elige una opcion :"
				+ "\n Cuadrado: "
				+ "\nRectangulo:  "
				+ "\nTriangulo: "
				+ "\n");
		
		try {
			figura = entrada.nextInt();
		
		}catch (Exception e) {
			// TODO: handle exception
		
			System.out.println("Ha ocurrido un error");
		}finally {
			
			entrada.close();
			
		}
		
		
		switch (figura) {
		case 1: 
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce"));
			System.out.println(Math.pow(lado, 2));
			break;
		
			case 2:
				
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base"));
				
				int altura =  Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				
				System.out.println("El area del rectangulo: "+base * altura);
			break;
			
			case 3: 
				
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				
				altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				
				System.out.println("El area del triangulo es :  "+ (base*altura)/2);
				
			
		
		default:
			
			System.out.println("La opcion no es correcta");
		}
		
		
		//--------------------------------------------------
		
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce  tu altura en cm"));
		
		
		System.out.println(" Si eres hombre tu peso ideal es: "+(altura -110)+ " kg");
		
		
		System.out.println("Si eres mujer tu peso idel es: "+(altura-120)+" kg");
	}
	static int figura;
}











































































