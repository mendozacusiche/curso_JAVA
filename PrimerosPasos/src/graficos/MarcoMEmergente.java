package graficos;

import java.awt.*;
import javax.swing.*;
public class MarcoMEmergente {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		MarcoEmergenteM mimarco = new MarcoEmergenteM();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoEmergenteM extends JFrame{
	
	public MarcoEmergenteM() {
		
		setBounds(100,100,300,300);
		
		LaminaEmergenteM milamina = new LaminaEmergenteM();
				
		add(milamina);
		
		setVisible(true);
	}
	
}



class LaminaEmergenteM extends JPanel{
	
	public LaminaEmergenteM() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		
		JMenu estilos = new JMenu("Estilo");
		
		JMenu tamagno = new JMenu("Tamaño");
		
		mibarra.add(fuente);
		mibarra.add(estilos);
		mibarra.add(tamagno);
		
		
		laminaMenu.add(mibarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		JTextPane miarea = new JTextPane();
		
		add(miarea, BorderLayout.CENTER);
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opcion1 =new JMenuItem("opcion 1");
		
		JMenuItem opcion2 = new JMenuItem("opcion 2");
		
		JMenuItem opcion3 = new JMenuItem("opcion 3");
		
		emergente.add(opcion1);
		
		emergente.add(opcion2);
		
		emergente.add(opcion3);
		
		miarea.setComponentPopupMenu(emergente);
		
	}
}















