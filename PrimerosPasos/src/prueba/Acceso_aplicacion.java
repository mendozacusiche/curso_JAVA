package prueba;

import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		
		String clave = "Abelardo";
		
		String pass ="";
		
		while(clave.equals(pass) ==false) {
		
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
		
					
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contraseña Incorrecta");
			
			}
			
			
			
		}
		
		System.out.println("Contraseña correcta. Acceso permitido ");
		
		
		
		
	}

}
