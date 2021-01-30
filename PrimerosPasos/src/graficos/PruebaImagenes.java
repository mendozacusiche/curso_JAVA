package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		MarcoImagen mimarco = new MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoImagen extends JFrame {
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		
		setBounds(750, 300, 300, 200);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
	}
}

class LaminaConImagen extends JPanel{

	
	public LaminaConImagen() {
		
		try {
			imagen =ImageIO.read(new File("src/graficos/estrella.png"));
		}catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//File miimagen = new File("icono.gif");
		
		
		int anchuraImagen = imagen.getWidth(this);
		
		int alturaImagen = imagen.getHeight(this);
		
		g.drawImage(imagen, 0,0, null);
		
		for (int i =0; i <300; i++) {
			for (int j=0; j <200 ; j++) {
				
				if(i+j >0) {
				
					g.copyArea(0, 0,anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				}
				
			}
		}
		
		
	}
	
	private Image imagen;
}
