package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}


class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Area de texto");
		
		setBounds(500, 300, 500,350);
		
		setLayout(new BorderLayout());
		
		laminaBotones= new JPanel();
		
		botonInsetar = new JButton("Insetar");
		
		botonInsetar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Apéndice de método generado automáticamente
				
				areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordar");
			}
		});
		
		laminaBotones.add(botonInsetar);
		
		botonSaltoLinea = new  JButton("Salto Linea");
		
		botonSaltoLinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Apéndice de método generado automáticamente
				
				boolean saltar = !areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				/*if(saltar) {
					botonSaltoLinea.setText("Quitar salto");
				}else {
					
					botonSaltoLinea.setText("Salto linea");
					
				}*/
				botonSaltoLinea.setText(saltar ? "Quita salto" : "Salto Linea");
				
			}
		});
		
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto = new JTextArea(8,20);
		
		laminaConBarras = new JScrollPane(areaTexto);
		
		add(laminaConBarras, BorderLayout.CENTER);
		
		
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsetar, botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaConBarras;
	
}

































































