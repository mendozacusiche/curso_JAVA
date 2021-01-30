package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class Ejemplo_radio {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		Marco_radio mimarco = new Marco_radio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Marco_radio extends JFrame{
	
	public Marco_radio() {
		setVisible(true);
		
		setBounds(550, 300, 500, 350);
		
		Lamina_radio milamina= new Lamina_radio();
		
		add(milamina);
		
		
	}
}


class Lamina_radio extends JPanel{
	
	public Lamina_radio() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre.....");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		
		add(texto, BorderLayout.CENTER);
		
		lamina_bontones= new JPanel();
		migrupo = new ButtonGroup();
		
		
		
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy grande", false, 26);
		
		add(lamina_bontones, BorderLayout.SOUTH);
		
		/*ButtonGroup migrupo = new ButtonGroup();
		
		boton1 = new JRadioButton("Pequeño",false);
		boton2 = new JRadioButton("Mediano",false);
		boton3 = new JRadioButton("Grande",false);
		boton4 = new JRadioButton("Muy grande",false);
		
		JPanel lamina_radio = new JPanel();
		
		Evento_radio mievento = new Evento_radio();
		
		boton1.addActionListener(mievento);
		boton2.addActionListener(mievento);
		boton3.addActionListener(mievento);
		boton4.addActionListener(mievento);
		
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);
		
		
		lamina_radio.add(boton1);
		lamina_radio.add(boton2);
		lamina_radio.add(boton3);
		lamina_radio.add(boton4);
		
		
		add(lamina_radio, BorderLayout.SOUTH);
		
	}
	
	
	private class Evento_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Apéndice de método generado automáticamente
			
			if(e.getSource() ==boton1) {
				//System.out.println("has pulsado el 1");
				texto.setFont(new  Font("Serif", Font.PLAIN, 10));
			}else if(e.getSource() == boton2) {
				texto.setFont(new  Font("Serif", Font.PLAIN, 12));
				
			}else if(e.getSource() == boton3) {
				texto.setFont(new  Font("Serif", Font.PLAIN, 18));
			}else if(e.getSource() ==boton4) {
				texto.setFont(new  Font("Serif", Font.PLAIN, 34));
			}
			
		}*/
		
		
	}
	
	public void colocarBotones(String nombre, boolean seleccionado, final int tamagno) {
		
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		
		migrupo.add(boton);
		
		lamina_bontones.add(boton);
		ActionListener mievento = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Apéndice de método generado automáticamente
				
				texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
			}
		};
		
		boton.addActionListener(mievento);
		
	}
	
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;

	private ButtonGroup migrupo;
	
	private JPanel lamina_bontones;
}

















































