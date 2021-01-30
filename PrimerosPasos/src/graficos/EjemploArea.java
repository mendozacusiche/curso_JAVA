package graficos;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		MarcoArea mimarco = new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoArea extends JFrame{
	
	public MarcoArea() {
		setBounds(500, 300, 500, 350);
		
		LaminaArea milamina = new LaminaArea();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}


class LaminaArea extends JPanel{
	
	
	public LaminaArea() {
		
		 miarea = new JTextArea(8,20);
		
		JScrollPane laminaBarras = new JScrollPane(miarea);
		
		//miarea.setLineWrap(true);
		
		add(laminaBarras);
	
		JButton miboton =new JButton("Dale");
		
		miboton.addActionListener(new GestionaArea());
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Apéndice de método generado automáticamente
		
			
			System.out.println(miarea.getText());
			
		}
		
	}
	
	private JTextArea miarea;
	
}




















