package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Empleados trabajador1 = new Empleados("Paco");

		Empleados trabajador2 = new Empleados("Ana");

		Empleados trabajador3 = new Empleados("Antonio");
		
		Empleados trabajador4 = new Empleados("Maria");

		trabajador1.cambiarSeccion("RRHH");


		System.out.println(trabajador1.devuelveDatos());
	

		System.out.println(trabajador2.devuelveDatos());

		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdsiguiente());
		
	}

}

class Empleados {

	public Empleados(String nom) {

		nombre = nom;
		seccion = "Administración";
		this.Id= Idsiguiente;
		Idsiguiente++;
		
	}
	
	public static String dameIdsiguiente(){
		return"El Idsiguiente es: "+ Idsiguiente;
		
	}

	public void cambiarSeccion(String seccion) {

		this.seccion = seccion;
	}



	public String devuelveDatos() {

		return "El nombre es: " + nombre + " la seccion es " + seccion +" y el id "+ Id;
	}

	private final String nombre;
	private String seccion;
	
	public  int Id;
	private static int Idsiguiente =1;
}
