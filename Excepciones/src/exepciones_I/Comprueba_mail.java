package exepciones_I;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {

		String el_mail = JOptionPane.showInputDialog("Introduce  mail");

		try {

			examinar_mail(el_mail);

		} catch (Exception e) {

			// TODO: handle exception

			System.out.println("La direccion de mail no es valido");
		
			e.printStackTrace();
		}
	}

	static void examinar_mail(String mail) throws Longitud_mail_erronea {
		int arroba = 0;
		boolean punto = false;

		for (int i = 0; i < mail.length(); i++) {

			if (mail.length() <= 3) {

				// ArrayIndexOutOfBoundsException mi_excepcion = new
				// ArrayIndexOutOfBoundsException();

				throw new Longitud_mail_erronea("El mail es demasidado corto");
			} else

			if (mail.charAt(i) == '@') {
				arroba++;
			}
			if (mail.charAt(i) == '.') {
				punto = true;
			}
		}

		if (arroba == 1 && punto == true) {
			System.out.println("Es correcto");
		} else {

			System.out.println("mail incorrecto");
		}

	}

}

class Longitud_mail_erronea extends Exception {

	public Longitud_mail_erronea() {

	}

	public Longitud_mail_erronea(String msj_error) {

		super(msj_error);

	}

}
