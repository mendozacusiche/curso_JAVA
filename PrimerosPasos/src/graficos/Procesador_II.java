package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class Procesador_II {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		MenuProcesador_II mimarco = new MenuProcesador_II();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador_II extends JFrame {

	public MenuProcesador_II() {

		setBounds(500, 300, 550, 400);

		LaminaProcesador_II milamina = new LaminaProcesador_II();

		add(milamina);

		setVisible(true);

	}
}

class LaminaProcesador_II extends JPanel {

	public LaminaProcesador_II() {

		setLayout(new BorderLayout());

		JPanel laminamenu = new JPanel();

		JMenuBar mibarra = new JMenuBar();

		// ----------------------------------------------
		fuente = new JMenu("Fuente");

		estilo = new JMenu("Estilo");

		tamagno = new JMenu("Tamaño");

		configura_metodo("Arial", "Fuente", "Arial", 9, 10, "");
		configura_metodo("Courier", "Fuente", "Courier", 9, 10, "");
		configura_metodo("Verdana", "Fuente", "Verdana", 9, 10, "");

		// ------------------------------------------------

		configura_metodo("Negrita", "Estilo", "", Font.BOLD, 1, "src/graficos/negrita.png");
		configura_metodo("Cursiva", "Estilo", "", Font.ITALIC, 1, "src/graficos/cursiva.png");
		// --------------------------------------------------

		/*
		 * JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new
		 * ImageIcon("src/graficos/negrita.png")); JCheckBoxMenuItem cursiva = new
		 * JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/cursiva.png"));
		 * 
		 * negrita.addActionListener(new StyledEditorKit.BoldAction());
		 * cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		 * 
		 * estilo.add(negrita); estilo.add(cursiva);
		 */

//	    configura_metodo("12", "Tamaño", "", 9, 12, "");
//	    configura_metodo("16", "Tamaño", "", 9, 16, "");
//	    configura_metodo("20", "Tamaño", "", 9, 20, "");
//	    configura_metodo("24", "Tamaño", "", 9, 24, "");

		// ButtonGroup tamagno_letra = new ButtonGroup();
		ButtonGroup tamagno_letra = new ButtonGroup();

		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");

		tamagno_letra.add(doce);
		tamagno_letra.add(dieciseis);
		tamagno_letra.add(veinte);
		tamagno_letra.add(veinticuatro);

		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiar_tamaño", 12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiar_tamaño", 16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiar_tamaño", 20));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiar_tamaño", 24));

		tamagno.add(doce);
		tamagno.add(dieciseis);
		tamagno.add(veinte);
		tamagno.add(veinticuatro);

		mibarra.add(fuente);

		mibarra.add(estilo);

		mibarra.add(tamagno);

		laminamenu.add(mibarra);

		add(laminamenu, BorderLayout.NORTH);

		miarea = new JTextPane();

		add(miarea, BorderLayout.CENTER);

		JPopupMenu emergente = new JPopupMenu();

		JMenuItem negritaE = new JMenuItem("Negrita");

		JMenuItem cursivaE = new JMenuItem("Cursiva");

		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());

		emergente.add(negritaE);

		emergente.add(cursivaE);

		miarea.setComponentPopupMenu(emergente);
		
		//--------------------------------------------------------------------------
		/*JToolBar barra = new JToolBar();
		                                                //"src/graficos/negrita.png"
		JButton negritaBarra = new JButton(new ImageIcon("src/graficos/negrita.png"));
		JButton cursivaBarra = new JButton(new ImageIcon("src/graficos/cursiva.png"));
		JButton subraBarra = new  JButton(new ImageIcon("src/graficos/subrayado.png"));
		JButton amarilloBarra = new JButton(new ImageIcon("src/graficos/amarillo.png"));
		JButton azulBarra = new JButton(new ImageIcon("src/graficos/azul.png"));
		JButton rojoBarra = new  JButton(new ImageIcon("src/graficos/rojo.png"));
		
		JButton a_izquierda = new  JButton(new ImageIcon("src/graficos/izquierda.png"));
		JButton a_centrado = new  JButton(new ImageIcon("src/graficos/centrado.png"));
		JButton a_derecha = new  JButton(new ImageIcon("src/graficos/derecha.png"));
		JButton a_justificado = new  JButton(new ImageIcon("src/graficos/justificado.png"));
		
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		negritaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.yellow));
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.BLUE));
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.RED));
		
		a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda",0));
		a_centrado.addActionListener(new StyledEditorKit.AlignmentAction("Centrado",1));
		a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha",2));
		a_justificado.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		
  		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subraBarra);
		barra.add(amarilloBarra);
		barra.add(azulBarra);
		barra.add(rojoBarra);
		
		barra.add(a_izquierda);
		barra.add(a_centrado);
		barra.add(a_derecha);
		barra.add(a_justificado);*/
		
		barra = new JToolBar();
		
		configura_barra("src/graficos/negrita.png").addActionListener(new  StyledEditorKit.BoldAction());
		configura_barra("src/graficos/cursiva.png").addActionListener(new  StyledEditorKit.ItalicAction());
		configura_barra("src/graficos/subrayado.png").addActionListener(new  StyledEditorKit.UnderlineAction());
		
		barra.addSeparator();
		
		configura_barra("src/graficos/amarillo.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.yellow));
		configura_barra("src/graficos/azul.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.BLUE));
		configura_barra("src/graficos/rojo.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.RED));
		
		barra.addSeparator();
		
		configura_barra("src/graficos/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda",0));
		configura_barra("src/graficos/centrado.png").addActionListener(new StyledEditorKit.AlignmentAction("Centrado",1));
		configura_barra("src/graficos/derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("Derecha",2));
		configura_barra("src/graficos/justificado.png").addActionListener(new StyledEditorKit.AlignmentAction("Justificado",3));
		
		barra.setOrientation(1);
		
		add(barra, BorderLayout.WEST);
		
		
	}
	
	public JButton configura_barra(String ruta) {
			
		JButton boton = new JButton(new ImageIcon(ruta));
		barra.add(boton);
		
		return boton;
		
	}
	
	
	
	

	public void configura_metodo(String rotulo, String menu, String tipo_letra, int estilos, int tam,
			String ruta_icono) {

		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));

		if (menu == "Fuente") {
			fuente.add(elem_menu);

			if (tipo_letra == "Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Arial"));
			} else if (tipo_letra == "Courier") {

				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Courier"));

			} else if (tipo_letra == "Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Verdana"));
			}

		} else if (menu == "Estilo") {

			estilo.add(elem_menu);

			if (estilos == Font.BOLD) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
			} else if (estilos == Font.ITALIC) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
				//elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}

			// elem_menu.addActionListener(new StyledEditorKit.ItalicAction());

		} else if (menu == "Tamaño") {

			tamagno.add(elem_menu);

			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));

		}

		// elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos,
		// tam));

	}

//	private class Gestiona_Eventos implements ActionListener{
//
//		String tipo_letra, menu;
//		
//		int estilo_letra, tamagno_letra;
//		
//		Gestiona_Eventos(String elemento, String texto2, int estilo2, int tam_letra){
//			tipo_letra = texto2;
//			estilo_letra = estilo2;
//			tamagno_letra = tam_letra;
//			menu = elemento;
//			
//		}
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Apéndice de método generado automáticamente
//			
//			letras = miarea.getFont();
//			
//			if(menu =="Arial" || menu == "Courier" || menu == "Verdana") {
//				
//				estilo_letra= letras.getStyle();
//				tamagno_letra = letras.getSize();
//				
//			}else if(menu == "Cursiva" || menu =="Negrita") {
//				
//				if (letras.getStyle() == 1 || letras.getStyle() ==2) {
//					
//					estilo_letra = 3;
//				}
//				
//				tipo_letra = letras.getFontName();
//				tamagno_letra = letras.getSize();
//				
//			}else if (menu == "12" || menu == "16" ||menu == "20" || menu == "24") {
//				
//				estilo_letra = letras.getStyle();
//				tipo_letra = letras.getFontName();
//			}
//			
//			miarea.setFont(new Font(tipo_letra, estilo_letra, tamagno_letra));
//			
//			System.out.println("Tipo "+ tipo_letra+ " Estilo "+ estilo_letra+ " Tamaño "+tamagno_letra);
//			
//		}
//		
//	}

	private JTextPane miarea;
	private JMenu fuente, estilo, tamagno;
	private Font letras;
	private JButton negritaBarra, cursivaBarra, subraBarra, azulBarra,  rojoBarra, amarilloBarra, a_izquierda, a_centrado, a_derecha, a_justificado;
	private JToolBar barra;

}
