package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoVentana mimarco = new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2= new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana1");
		
		mimarco2.setTitle("Ventana2");
		
		mimarco.setBounds(300,300, 500, 350);
		mimarco2.setBounds(900,300, 500, 350);
		
		
	}

}


class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		//setTitle("Respondiendo*");
		//setBounds(300, 300, 500, 350);
		setVisible(true);
		
		//M_Ventana oyente_ventana = new M_Ventana();
		
		//addWindowListener(oyente_ventana);
	
		addWindowListener(new M_Ventana());
		
	}
}


//class M_Ventana implements WindowListener{
//	
//	public void windowActivated(WindowEvent e) {
//		
//		System.out.println("Ventana Activada");
//		
//	}
//
//	public void windowClosed(WindowEvent e) {
//		
//		System.out.println("La ventana ha sido cerrada");
//		
//	}
//	
//	public void windowClosing(WindowEvent e) {
//		
//		System.out.println("Cerrando ventana");
//	}
//	
//	public void windowDeactivated(WindowEvent e) {
//		
//		System.out.println("Ventana Desactivada");
//	}
//	
//	public void windowDeiconified(WindowEvent e) {
//		
//		System.out.println("Ventana Restarada");
//		
//	}
//	
//	public void windowIconified(WindowEvent e) {
//		
//		System.out.println("Ventana minilizada");
//		
//	}
//	
//	public void windowOpened(WindowEvent e) {
//		
//		System.out.println("Ventana Abierta");
//		
//	}
//	
//}

class M_Ventana extends WindowAdapter{
	
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada ");
		
	}
	
}










