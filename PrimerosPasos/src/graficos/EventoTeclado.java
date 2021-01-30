package graficos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyListener.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class EventoTeclado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		MarcoConTeclas mimarco = new MarcoConTeclas();
	
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas () {
		
		setVisible(true);
		setBounds(700, 300, 600,450);
		
		EventoDeTeclado teclado = new EventoDeTeclado();
		
		addKeyListener(teclado);
		
	}
	
}


class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Apéndice de método generado automáticamente
		
		char letra = e.getKeyChar();
		System.out.println(letra);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Apéndice de método generado automáticamente
		
		//int codigo = e.getKeyCode();
		
		//System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Apéndice de método generado automáticamente
		
	}
	
}












