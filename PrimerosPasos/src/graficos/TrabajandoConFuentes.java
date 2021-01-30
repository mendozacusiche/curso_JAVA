package graficos;
import javax.swing.*;
import java.awt.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoConFuente mimarco = new MarcoConFuente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		mimarco.setVisible(true);
	}

}


class MarcoConFuente extends JFrame{
	
	public MarcoConFuente() {
		
		setTitle("Prueba con Fuente");
		
		setSize(400, 400);
		
		LaminaConFuente  milamina = new LaminaConFuente();
		
		add(milamina);
		
		milamina.setForeground(Color.BLUE);
		
	}
}
class LaminaConFuente extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 =(Graphics2D)g;
		
		Font mifuente = new Font("DJB Letter Game Tiles", Font.BOLD, 30);
		
		g2.setFont(mifuente);
		
		//g2.setColor(Color.blue.brighter().brighter());
		
		g2.drawString("Abelardo", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 20));
		
		//g2.setColor(new Color(128,90,50).brighter().brighter());
		
		g2.drawString("Cusrso de Java", 100, 200);
		
	}
}



