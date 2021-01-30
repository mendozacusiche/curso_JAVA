package graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LibreDisposicion {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoLibre mimarco = new MarcoLibre();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoLibre extends JFrame{
	
	public MarcoLibre() {
		
		setBounds(450, 350, 600, 400);
		
		LaminaLibre milamina = new LaminaLibre();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}

class LaminaLibre extends JPanel{
	
	public LaminaLibre() {

		//setLayout(null);

		setLayout(new EnColumnas());
//		JButton boton1= new JButton("boton1");
//		JButton boton2 = new JButton("boton2");
//		boton1.setBounds(50, 50, 150, 50);
//		boton2.setBounds(200,100,120,25);
//		add(boton1);
//		add(boton2);
		
		JLabel nombre = new JLabel("Nombre");
		JLabel apellido = new JLabel("Apellido");
		JLabel edadd = new JLabel("Edad");
		JLabel telf = new JLabel("Telefono");
		
		JTextField c_nombre =new JTextField();
		JTextField c_apellido =new JTextField();
		JTextField c_edad =new JTextField();
		JTextField c_telf =new JTextField();
		
		/*
		nombre.setBounds(20, 17, 80, 10);
		c_nombre.setBounds(100, 20, 100, 20);
		apellido.setBounds(20, 60, 80, 15);
		c_apellido.setBounds(100, 55, 100, 20);
		*/
		
		add(nombre);
		add(c_nombre);
		add(apellido);
		add(c_apellido);
		add(edadd);
		add(c_edad);
		add(telf);
		add(c_telf);
	}
}



class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Apéndice de método generado automáticamente
		
		int d = micontenedor.getWidth();
		
		x = d/2;
		 
		
		int contador=  0;
		
		int n = micontenedor.getComponentCount();
		
		for(int i = 0; i < n; i++) {
			contador ++;
			
			Component c = micontenedor.getComponent(i);
		
			c.setBounds(x-100, y, 100, 20);
			
			x +=100;
			
			if (contador %2 == 0) {
				x =d/2;
				y += 40;
				
			}
		}
		
	}
	
	
	private int x;
	private int y = 20;
}





















