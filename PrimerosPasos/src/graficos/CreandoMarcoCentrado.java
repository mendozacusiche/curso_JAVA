package graficos;

import java.awt.Toolkit;

import javax.swing.*;

import java.awt.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		mimarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanioPantalle = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanioPantalle.height;
		
		int anchoPantalla = tamanioPantalle.width;
	
		
		setSize(anchoPantalla/2, alturaPantalla/2);
	
		setLocation(anchoPantalla/4, alturaPantalla/4);
	
		setTitle("Marco centrado");
		
		Image miIcono= mipantalla.getImage("/home/abelardo/Curso de Java/PrimerosPasos/prueba/src/icono.gif");
		
		setIconImage(miIcono);
	}
	
}
