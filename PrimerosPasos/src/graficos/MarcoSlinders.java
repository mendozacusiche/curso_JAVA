package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSlinders {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Frame_Sliders mimarco = new Frame_Sliders();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame_Sliders extends JFrame {

	public Frame_Sliders() {

		setBounds(550, 400, 550, 350);

		Lamina_Sliders milamina = new Lamina_Sliders();

		add(milamina);

		setVisible(true);

	}

}

class Lamina_Sliders extends JPanel {

	public Lamina_Sliders() {

//		JSlider control = new JSlider(0,100,50);
//		
//		control.setMajorTickSpacing(50);
//		control.setMinorTickSpacing(25);
//		
//		control.setPaintTicks(true);
//
//		control.setFont(new Font("Serif", Font.ITALIC, 12));
//		
//		control.setSnapToTicks(true);
//		
//		add(control);

		setLayout(new BorderLayout());

		rotulo = new JLabel("EN un lugar de la Mancha de  cuyo nombre");

		add(rotulo, BorderLayout.CENTER);

		control = new JSlider(8, 50, 12);

		control.setMajorTickSpacing(20);

		control.setMinorTickSpacing(5);

		control.setPaintTicks(true);

		control.setPaintLabels(true);

		control.setFont(new Font("Sarif", Font.ITALIC, 10));

		control.addChangeListener(new EventoSlider());

		JPanel laminaSlider = new JPanel();

		laminaSlider.add(control);

		add(laminaSlider, BorderLayout.NORTH);

	}

	private class EventoSlider implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Apéndice de método generado automáticamente

			// contador ++;

			// System.out.println("estás manipulando el deslizante"+ control.getValue());

			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));

		}

	}

	private JLabel rotulo;

	private JSlider control;

	private static int contador;
}
