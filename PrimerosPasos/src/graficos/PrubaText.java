package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PrubaText {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoText mimarco = new MarcoText();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}


class MarcoText extends JFrame{
	
	public MarcoText() {
		
		setBounds(600,300,600,350);
		
		LaminaTexto milamina = new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel milamina2 = new JPanel();
		
		milamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("",JLabel.CENTER);
		
		JLabel texto1 = new JLabel("Email: ");
		
		milamina2.add(texto1);
		
		campo1 = new JTextField(20);
		
		milamina2.add(campo1);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton miboton =new JButton("Evaluar");
		
		DameTexto mievento = new DameTexto();
		miboton.addActionListener(mievento);
		
		milamina2.add(miboton);
		
		add(milamina2,BorderLayout.NORTH);
			
	}
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Apéndice de método generado automáticamente
			
			int correcto = 0;
			String email = campo1.getText().trim();
			
			
			for(int i=0; i < email.length(); i++) {
				
				if(email.charAt(i)=='@') {
					correcto++;
				}
				
			}
			
			if(correcto != 1) {
				resultado.setText("Incorrecto");
			}else {
				resultado.setText("Correcto");
			}
			
			
			System.out.println(campo1.getText().trim());
			
		}
		
	}
	
	private JTextField campo1;
	private JLabel resultado;
}














































