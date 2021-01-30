package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class Pruebass {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		String fuente = JOptionPane.showInputDialog("Introduce una fuente");
		
		boolean estalafuente = false;
		
		String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
		for(String s: nombreDeFuentes) {//DJB Letter Game Tiles
			System.out.println(s);
			
			if (s.equalsIgnoreCase(fuente)) {
				
				estalafuente = true;
			}
		}
		
		if(estalafuente) {
			System.out.println("Fuente instalada");
		}else {
			System.out.println("No está instalada la fuente");
		}
		
	}

}
