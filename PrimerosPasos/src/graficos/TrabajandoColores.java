package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

import javax.swing.JFrame;
public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		MarcoConColor mimarco = new MarcoConColor();
		
		//mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}


class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("Preba con colores");
		
		setSize(400,400);
		
		LaminaConColor milamina = new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
	}
	
}



class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 =(Graphics2D)g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200,150);
		
		g2.setPaint(Color.blue);
		
		//g2.draw(rectangulo);
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		//g2.setPaint(Color.cyan);
		
		Color micolor = new Color(125,189,200);
		
		g2.setPaint(micolor);
		
		//g2.draw(elipse);
		
		g2.fill(elipse);
		
	
	}
}





