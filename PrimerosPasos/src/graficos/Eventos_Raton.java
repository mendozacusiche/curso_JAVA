package graficos;

import java.awt.event.*;

import javax.swing.JFrame;
public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRaton extends JFrame{
	
	public  MarcoRaton() {
		
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		EventosDeRaton EventoRaton = new EventosDeRaton();
		
		addMouseMotionListener(EventoRaton);
		
	}
}
//
//class EventosDeRaton extends MouseAdapter{
//	
//	/*public void mouseClicked(MouseEvent e) {
//		
//		//System.out.println("Has hecho click");
//		
//		//System.out.println("Coordenada X: "+e.getX()+ " Cordenada Y:" + e.getY());
//		
//		//System.out.println(e.getClickCount());
//		
//	}*/
//	
//	public void mousePressed(MouseEvent e) {
//		
//		//System.out.println(e.getModifiersEx());
//		
//		if(e.getModifiersEx()== MouseEvent.BUTTON1_DOWN_MASK) {
//			
//			System.out.println("Has pulsado el botón izquierdo");
//		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
//		
//			System.out.println("Has puldado la ruedadel ratón");
//			
//		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
//			
//			System.out.println(" Has pulsado el botón derecho ");
//			
//		}
//	}
//	
//	
//}

class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Apéndice de método generado automáticamente
	
		System.out.println("Estás arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Apéndice de método generado automáticamente
		
		System.out.println("Estás moviendo");
		
	}
	
}

//class EventosDeRaton implements MouseListener{
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO Apéndice de método generado automáticamente
//		
//		System.out.println("Has hecho Click");
//		
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Apéndice de método generado automáticamente
//		
//		System.out.println("Acabas de presionar");
//		
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Apéndice de método generado automáticamente
//		
//		System.out.println("Acabas de levantar");
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Apéndice de método generado automáticamente
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Apéndice de método generado automáticamente
//		
//	}
//	
//}
















