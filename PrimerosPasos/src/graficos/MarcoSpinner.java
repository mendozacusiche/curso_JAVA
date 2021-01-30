package graficos;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class MarcoSpinner {

	public static void main(String[] args) {

		// TODO Apéndice de método generado automáticamente

		FrameSpinner mimarco = new FrameSpinner();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameSpinner extends JFrame {

	public FrameSpinner() {

		setBounds(550, 350, 550, 350);

		setVisible(true);

		add(new LaminaSpinner());

	}
}

class LaminaSpinner extends JPanel {

	public LaminaSpinner() {

		// String lista[] =
		// GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {

			public Object getNextValue() {

				return super.getPreviousValue();

			}

			public Object getPresiousValue() {

				return super.getNextValue();

			}

		});

		Dimension d = new Dimension(200, 20);

		control.setPreferredSize(d);

		add(control);
	}

//	private class MiModeloJspinner extends SpinnerNumberModel{
//		
//		
//		public MiModeloJspinner() {
//			
//			super(5,0,10,1);
//		}
//		
//		public Object getNextValue() {
//			
//			return super.getPreviousValue();
//			
//		}
//		
//		public Object getPresiousValue() {
//			
//			return super.getNextValue();
//			
//		}
//		
//		
//	}

}
