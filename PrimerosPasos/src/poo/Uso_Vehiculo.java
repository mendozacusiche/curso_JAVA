package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {

		/*Coche micoche = new Coche();

		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));

		System.out.println(micoche.dime_datos_Generales());

		System.out.println(micoche.dime_Color());

		micoche.configura_Asientos(JOptionPane.showInputDialog("¿ Tiene asientos de cuero?"));

		System.out.println(micoche.dime_asientos());

		micoche.configura_Climatizador(JOptionPane.showInputDialog("¿ Tiene climatizador ?"));

		System.out.println(micoche.dime_climatizador());

		System.out.println(micoche.dime_peso_coche());

		System.out.println("El precio final del coche es: " + micoche.presio_coche());
		*/
		
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Azul");
		
		Furgoneta mifurgoneta1Furgoneta1 = new Furgoneta(7, 580);
		
		mifurgoneta1Furgoneta1.establece_color("Blanco");
		
		mifurgoneta1Furgoneta1.configura_Asientos("si");
		
		mifurgoneta1Furgoneta1.configura_Climatizador("si");

		
		System.out.println(micoche1.dime_datos_Generales()+" "+micoche1.dime_Color());
		
	
		System.out.println(mifurgoneta1Furgoneta1.dime_datos_Generales()+ mifurgoneta1Furgoneta1.dimeDatosFurgoneta());
	}

}
