package prueba;

public class Manipula_Cadenas_II {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		String Frase ="Hoy es un estupendo dia para aprender a Programar en Java";
		
		String frase_resumen = Frase.substring(0, 29)+"Irnos a la playa y olvidarnos de todo..."+" y " +
		Frase.substring(29, 57);
		
		System.out.println(frase_resumen);
	}

}
