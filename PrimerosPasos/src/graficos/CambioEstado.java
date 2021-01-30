package graficos;

import java.awt.Frame;
import java.awt.event.*;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente


		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setVisible(true);
		setBounds(300,300,500,350);
		
		CambiaEstado nuevoEstado = new CambiaEstado();
		
		addWindowStateListener(nuevoEstado);
		
	}
}



class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("La ventana ha cambiado de estado");
		
		//System.out.println(e.getNewState());
		
		
		if(e.getNewState() ==Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana  esta en pantalla completa");
		}else if(e.getNewState() ==Frame.NORMAL){
		
			System.out.println("La ventana esta en etado norml");
		}else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana está minimizada");
		}
		
	}
	
}

