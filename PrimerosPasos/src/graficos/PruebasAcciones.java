package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebasAcciones {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoAccion marco = new MarcoAccion();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoAccion extends JFrame {

	public MarcoAccion() {
		setTitle("Prueba Acciones");

		setBounds(600, 350, 600, 300);

		PanelAccion lamina = new PanelAccion();

		add(lamina);
	}
}

class PanelAccion extends JPanel {

	public PanelAccion() {

		AccionColor accionAmarillo = new AccionColor("Amariilo", new ImageIcon("src/graficos/amarillo.png"),
				Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/azul.png"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.png"), Color.RED);

		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));

//		JButton botonAmarillo = new JButton("Amarillo");
//		JButton botonAzul = new JButton("Azul");
//		JButton botonRojo = new JButton("Rojo");
//		
//		add(botonAmarillo);
//		add(botonAzul);
//		add(botonRojo);

	}
	
	InputMap mapaEntrada=getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	
	
	
	//mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
	
	//ActionMap mapaAccion = getActionMap();
	
	//mapaAccion.put("fondo_amarillo", accionAmarillo);
	
	private class AccionColor extends AbstractAction {

		public AccionColor(String nombre, Icon icono, Color color_boton) {

			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina del Color" + nombre);
			putValue("color_de_fondo", color_boton);
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			Color c = (Color) getValue("color_de_fondo");

			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME)+" Descripcion: "+ getValue(Action.SHORT_DESCRIPTION));
			
		}

	}

}
