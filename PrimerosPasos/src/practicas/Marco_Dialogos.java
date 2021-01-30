package practicas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Marco_Dialogos extends JFrame {

	public Marco_Dialogos() {

		setTitle("Prueba de dialogos");

		setBounds(500, 300, 600, 450);

		JPanel lamina_cuadricula = new JPanel();

		lamina_cuadricula.setLayout(new GridLayout(2, 3));

		String primero[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };

		lamina_tipo = new Lamina_Botones("Tipo", primero);

		lamina_tipo_mensajes = new Lamina_Botones("TIPO DE MENSAJE", new String[] {

				"ERROR_MESSAGE", "INFORMATION_MENSSAGE", "WORNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"

		});

		lamina_mensaje = new Lamina_Botones("MENSAJE", new String[] {

				"Cadena", "Icono", "Componentes", "Otros", "Object[]",

		});

		lamina_opcion = new Lamina_Botones("CONFIRMAR", new String[] {

				"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION",

		});

		lamina_opciones = new Lamina_Botones("OPCIONES", new String[] {

				"String[]", "Icon[]", "Object[]",

		});

		lamina_entrada = new Lamina_Botones("ENTRADA", new String[] {

				"Campo de texto", "Combo",

		});

		setLayout(new BorderLayout());

		lamina_cuadricula.add(lamina_tipo);
		lamina_cuadricula.add(lamina_tipo_mensajes);
		lamina_cuadricula.add(lamina_mensaje);
		lamina_cuadricula.add(lamina_opcion);
		lamina_cuadricula.add(lamina_opciones);
		lamina_cuadricula.add(lamina_entrada);
		//lamina_cuadricula.add(new Lamina_Ejemplo());

		// COnstruimos la lamina inferior

		JPanel lamina_mostrar = new JPanel();

		JButton boton_mostrar = new JButton("Mostrar");

		boton_mostrar.addActionListener(new AccionMostrar());

		lamina_mostrar.add(boton_mostrar);

		add(lamina_mostrar, BorderLayout.SOUTH);

		add(lamina_cuadricula, BorderLayout.CENTER);
	}

	/************************************************************
	 * 
	 * @author abelardo
	 *
	 *         /
	 *********************************************************/

	public Object dameMensaje() {

		String s = lamina_mensaje.dameSeleccion();

		if (s.equals("Cadena")) {

			return cadenaMensaje;

		} else if (s.equals("Icono")) {

			return iconoMensaje;
		} else if (s.equals("Componentes")) {
			System.out.println("si entro al if");
			return componenteMensaje;
		} else if (s.equals("Otros")) {

			return objetoMensaje;
		} else if (s.equals("Object[]")) {
			return new Object[] { cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje, };
		} else {

			return null;
		}

	}
	
	//****************DEVUELVE TIPO DE ICONO y tan bine numero de  botones en confirmar***************(*********
	
	public int dameTipo(Lamina_Botones lamina) {
		
		String s = lamina.dameSeleccion();
		
		if(s.equals("ERROR_MESSAGE")|| s.equals("YES_NO_OPTION")) {
			
			return 0;
		}else if(s.equals("INFORMATION_MESSAGE") ||s.equals("YES_NO_CANCEL_OPTION")) {
			
			return 1;
		}else if(s.equals("WARNING_MESSAGE")|| s.equals("DEFAULT_OPTION")) {
			
			return 2;
		}else if(s.equals("QUESTION_MESSAGE")) {
			
			return 3;
		}else if(s.equals("PLAIN_MESSAGE")|| s.equals("DEFAULT_OPTION")) {
			
			return -1;
		}else {
			
			return 0;
		}
		
	}
	
	//---------------DA OPCIONES A LA LAMINA OPCION----------
	
	public Object[] dameOpciones(Lamina_Botones lamina) {
		
		String s= lamina.dameSeleccion();
		
		if (s.equals("String[]")) {
			
			return new String [] {"Amarillo", "Azul", "Rojo"};
		}else if (s.equals("Icon[]")){
			
			return new Object[] {new ImageIcon("src/graficos/azul.png"),
					new ImageIcon("src/graficos/amarilla.png"),
					new ImageIcon("src/graficos/roja.png")};
		}else if(s.equals("Object[]")){
				
			return new Object[]{cadenaMensaje,
					iconoMensaje,
					componenteMensaje,
					objetoMensaje};
			
				
		}else
		{
			
			return null;
		}
		
	}
	
	

	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Apéndice de método generado automáticamente

			// System.out.println(lamina_tipo.dameSeleccion());

			if (lamina_tipo.dameSeleccion().equals("Mensaje")) {

				JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes));

			} else if (lamina_tipo.dameSeleccion().equals("Confirmar")) {

				// JOptionPane.showConfirmDialog(Marco_Dialogos.this,"Mensaje", 0,0);
				JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_opcion), dameTipo(lamina_tipo_mensajes));
			} else if (lamina_tipo.dameSeleccion().equals("Entrada")) {
					
				if(lamina_entrada.dameSeleccion().equals("Campo de texto")) {
					
					JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes));
					
				}else {
					
					JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes), null, new String[] {"Amarillo","Azul", "Rojo"}, "Azul"); 
				}
				

			} else if (lamina_tipo.dameSeleccion().equals("Opcion")) {

				JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 1, dameTipo(lamina_tipo_mensajes), null, dameOpciones(lamina_opciones), null);

			}

		}

	}

	private Lamina_Botones lamina_entrada, lamina_tipo, lamina_tipo_mensajes, lamina_mensaje, lamina_opcion,
			lamina_opciones;

	private String cadenaMensaje = "Mensaje";

	private Icon iconoMensaje = new ImageIcon("src/graficos/azul.png");

	private Object objetoMensaje = new Date();

	private Component componenteMensaje = new Lamina_Ejemplo();
}

class Lamina_Ejemplo extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

		g2.setPaint(Color.YELLOW.darker());

		g2.fill(rectangulo);

		//setVisible(true);
	}

	
	
	
	
	
	
	
	
	
}


