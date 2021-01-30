package poo;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTemportazador2 {
	public static void main(String[] args) {
		
		Reloj mireloj = new Reloj();
		
		mireloj.enMarcha(250, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar par terminar");
	
		System.exit(0);
	}
}


class Reloj{
	
	public void enMarcha(int intervalo, final boolean sonido) {
		
		class DameLaHora2 implements ActionListener{
			
			//public void actionPerformed(ActionEvent evento) 
			  public void actionPerformed(ActionEvent e) {
				
				Date ahora = new Date();
				
				System.out.println("Te pongo la hora cada 3 sg: "+ahora);
			
				if (sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer mitemporizador = new Timer(intervalo, oyente);
		
		mitemporizador.start();
	}
	
	private int intervalo;
	private boolean sonido;
	

}








