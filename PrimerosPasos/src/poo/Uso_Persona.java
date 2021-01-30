package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		Persona [] lasPersonas = new Persona[2];
		
		lasPersonas[0]= new Empleado2("Luis conde ", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Bilógicas");
		
		for (Persona p: lasPersonas) {
			System.out.println(p.dameNombre()+", "+p.dameDescripcion());
		}
	}

}

abstract class Persona {

	private String nombre;
	
	public Persona(String nom) {
		
		nombre =nom;
	}
	
	
	public String dameNombre() {
		return nombre;
	}
	
	
	public abstract String dameDescripcion();
	
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id =IdSiguiente;
	}
	
	public String dameDescripcion() {
		
		return "Este Empleado tiene un Id=" + Id+" con un sueldo "+sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date  dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje/100;
		
		sueldo +=aumento;
	}
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
}

class Alumno extends Persona {
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	private String carrera;
	
	public String dameDescripcion() {
		
		return "Este alumno esta estudiando la carrera de "+ carrera;
	}
}

