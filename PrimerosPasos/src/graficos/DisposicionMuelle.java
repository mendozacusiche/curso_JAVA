package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class DisposicionMuelle {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoMuelle mimarco = new MarcoMuelle();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoMuelle extends JFrame{
	
	public MarcoMuelle() {
		
		setBounds(300,  400, 1000, 350);
		
		LaminaMuelle milamina = new LaminaMuelle();
		
		add(milamina);
		
		setVisible(true);
		
		
	}
	
}


class LaminaMuelle extends JPanel{
	
	public LaminaMuelle() {
		
		JButton boton1 =  new JButton ("boton1");
		JButton boton2 =  new JButton ("boton2");
		JButton boton3 =  new JButton ("boton3");
		
		SpringLayout milayout = new SpringLayout();
		
		setLayout(milayout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		Spring mimuelle = Spring.constant(0,10,100);
		
		Spring muelle_rigido = Spring.constant(10);
		
		milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
		milayout.putConstraint(SpringLayout.WEST, boton2, muelle_rigido, SpringLayout.EAST, boton1);
		milayout.putConstraint(SpringLayout.WEST, boton3, muelle_rigido, SpringLayout.EAST, boton2);
		milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
	}
}

























































































