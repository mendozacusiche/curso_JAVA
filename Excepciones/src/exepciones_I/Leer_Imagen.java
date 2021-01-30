package exepciones_I;

import java.awt.*;

import javax.swing.*;

import javax.imageio.*;

import java.io.*;

public class Leer_Imagen {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		MarcoImagen mimarco = new  MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		
		setBounds(750,300, 300, 200);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
		
		//setVisible(true);
		
	}
	
	
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		
		try {
	
		imagen = ImageIO.read(new File("src/exepciones_I/garfil.gif"));
	
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("La imagen no se encuentra en la ruta");
		}
		}
	
	
	public void paintConponent(Graphics g) throws NullPointerException {
		
		super.paintComponent(g);
		
		if(imagen == null) {
			g.drawString("no podemos cargar la imagen", 10, 10);
		
		}else {
		
			try {
		
		int anchuraImagen = imagen.getWidth(this);
		int alturaImagen= imagen.getHeight(this);
		
		g.drawImage(imagen,0,0 ,null);
		
		for (int i =0; i < 300 ; i++) {
			
			for(int j=0 ; j < 200;j++) {
				if (i + j >0) {
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
			
				}
				}
			
		}
			}catch (NullPointerException e) {
				// TODO: handle exception
				
				g.drawString("Nose ha podido car la imagen", 10, 10);
			}
		}
	}
	
	
	private Image imagen;
	
}






















