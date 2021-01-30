package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class PruebaDibjo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		MarcoConDibujos mimarco = new MarcoConDibujos();
		
		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("Prueba de Dibujo");
		
		setSize(400,400);
		
		LaminaConfiguras milamina = new LaminaConfiguras();
				
		add(milamina);
	}
}

class LaminaConfiguras extends JPanel{

	public void paintComponet(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D  g2 =(Graphics2D)g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroenX = rectangulo.getCenterX();
		
		double CentroenY = rectangulo.getCenterY();
		
		double radio = 150 ;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		
		g2.draw(circulo);
		//g.drawRect(50, 50, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		//g.drawArc(50, 100, 100, 200, 120, 150);
	}
}









