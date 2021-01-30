package prueba;

import javax.swing.*;


public class Comprueba_mail {

	public static void main(String[] args) {
		
		
		int arroba =0;
		
		boolean puntos = false;
		
		String mail= JOptionPane.showInputDialog("Introduce mail");
		
		for( int i = 0; i < mail.length(); i++) {
		
			
			if(mail.charAt(i)=='@') {
				
				arroba ++;
			}
			
			if(mail.charAt(i)=='.') {
				puntos = true;
			}
			
		}
		
		if (arroba == 1 && puntos == true) {
			
			System.out.println("El mail es correcto ");
		}else {
			System.out.println("No es correcto");
		}
		
		//System.out.println(mail.length());
		
		
	}
}
