package abel.sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame {

	public MarcoCliente() {

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setVisible(true);

		addWindowListener(new EnvioOline());

	}

}

// -------------------------------ENVIO DE SENAL ONLINE--------------------
class EnvioOline extends WindowAdapter {

	public void windowOpened(WindowEvent e) {

		try {

			Socket misoket = new Socket("192.168,0,194", 999);

			PaqueteEnvio datos = new PaqueteEnvio();

			datos.setMensaje(" Online ");

			ObjectOutputStream paquete_datos = new ObjectOutputStream(misoket.getOutputStream());

			paquete_datos.writeObject(datos);

			misoket.close();

		} catch (Exception e2) {
			// TODO: handle exception
		}

	}

}
//-----------------------------------------------------------------------------------

class LaminaMarcoCliente extends JPanel implements Runnable {

	public LaminaMarcoCliente() {

		String nick_usuario = JOptionPane.showInputDialog("Nick !");

		JLabel n_nick = new JLabel("NICK: ");

		add(n_nick);

		nick = new JLabel();

		nick.setText(nick_usuario);
		add(nick);

		JLabel texto = new JLabel(" Oline");

		add(texto);

		ip = new JComboBox();
		ip.addItem("Usuario 1");
//		ip.addItem("Usuario 2");
//		ip.addItem("Usuario 3");
//		ip.addItem("Usuario 4");
//		ip.addItem("Usuario 5");
//		ip.addItem("Usuario 6");
//		ip.addItem("Usuario 7");
//		ip.addItem("Usuario 8");
//		ip.addItem("Usuario 9");
//		ip.addItem("Usuario 10");
//		ip.addItem("Usuario 11");
//		ip.addItem("Usuario 12");
//		ip.addItem("Usuario 13");
//		ip.addItem("Usuario 14");
//		ip.addItem("Usuario 15");
//		ip.addItem("Usuario 16");
//		ip.addItem("Usuario 17");
//		ip.addItem("Usuario 18");
//		ip.addItem("Usuario 19");
//		ip.addItem("Usuario 20");

		add(ip);

		campochat = new JTextArea(12, 20);

		add(campochat);
		campo1 = new JTextField(20);

		add(campo1);

		miboton = new JButton("Enviar");

		EnviaTexto mievento = new EnviaTexto();

		miboton.addActionListener(mievento);

		add(miboton);

		Thread mihilo = new Thread(this);

		mihilo.start();
	}

	private class EnviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			// System.out.println(campo1.getText());
			// 192.168.1.57 172.17.0.1
			// inet 172.17.0.1/16

			campochat.append("\n" + campo1.getText());

			try {

				Socket misocket = new Socket("172.17.0.1", 9999);

				PaqueteEnvio datos = new PaqueteEnvio();

				datos.setNick(nick.getText());

				datos.setIp(ip.getSelectedItem().toString());

				datos.setMensaje(campo1.getText());

				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());

				paquete_datos.writeObject(datos);

				misocket.close();
				// DataOutputStream flujo_salida = new
				// DataOutputStream(misocket.getOutputStream());

				// flujo_salida.writeUTF(campo1.getText());

				// flujo_salida.close();

			} catch (IOException e1) {

				// TODO Auto-generated catch block
				e1.printStackTrace();

				System.out.println(e1.getMessage());
			}
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			ServerSocket servidor_cliente = new ServerSocket(9090);

			Socket cliente;

			PaqueteEnvio PaqueteRecibido;

			while (true) {

				cliente = servidor_cliente.accept();

				ObjectInputStream flujoentrada = new ObjectInputStream(cliente.getInputStream());

				PaqueteRecibido = (PaqueteEnvio) flujoentrada.readObject();

				if (!PaqueteRecibido.getMensaje().equals(" Oline")) {

					campochat.append("\n" + PaqueteRecibido.getNick() + " : " + PaqueteRecibido.getMensaje());

				} else {

					// campochat.append("\n"+PaqueteRecibido.getIps());

					ArrayList<String> IpsMenu = new ArrayList<String>();

					IpsMenu = PaqueteRecibido.getIps();
					
					ip.removeAllItems();

					for (String Z : IpsMenu) {

						ip.addItem(Z);
					}
				}

			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	private JTextField campo1;
	private JComboBox ip;
	private JLabel nick;
	private JTextArea campochat;
	private JButton miboton;

}

class PaqueteEnvio implements Serializable {

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ArrayList<String> getIps() {
		return Ips;
	}

	public void setIps(ArrayList<String> ips) {
		Ips = ips;
	}

	private String nick, ip, mensaje;
	private ArrayList<String> Ips;
}
