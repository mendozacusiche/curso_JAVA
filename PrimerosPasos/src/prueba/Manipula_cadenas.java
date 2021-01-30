package prueba;

public class Manipula_cadenas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		String nombre = "Abelardo";
		
		System.out.println("Mi nombre es  "+ nombre);

		System.out.println("Mi nombre tiene "+nombre.length()+ " letras.");
		
		System.out.println("La primera letra de mi nombre es "+nombre+" es la "+ nombre.charAt(0));
		
		 int ultima_letra;
		 
		 ultima_letra = nombre.length();
		 
		 System.out.println(" La ultima letra es "+nombre.charAt(ultima_letra-1));
		
	}

}
