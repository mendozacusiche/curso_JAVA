package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoConTexto mimarco = new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {

		setVisible(true);
		
		setSize(600, 450);
		
		setLocation(400, 200);
		
		setTitle("primer Texto");
		
		Lamina milamina = new Lamina();
		
		add(milamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponet(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100,100);
	}
	
}
