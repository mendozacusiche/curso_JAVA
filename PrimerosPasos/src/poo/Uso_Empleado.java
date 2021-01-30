package poo;

import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH = new Jefatura(" Abelardo ", 55000, 2020, 9, 23);
		
		jefe_RRHH.estableceIncentiivo(2570);
		
		Empleado [] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Ferndez");
		misEmpleados[4] = jefe_RRHH;//Pilimorfismo en accion . Principio de sustucion
		misEmpleados[5] = new Jefatura(" Maria ", 95000, 1999, 5, 30);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		
		
		jefa_Finanzas.estableceIncentiivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		
		
		Empleado director_comercial = new Jefatura(" Sandra ", 85000, 2012, 05, 05);
		
		Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 06, 07);
		
		
		if (director_comercial instanceof Empleado) {
			
			System.out.println("Es de tipo Jefatura");
		}
		
		if (ejemplo instanceof Comparable) {
			System.out.println("Impleanta la interfaz comparable");
		}
		
		System.out.println("El Jefe "+ jefa_Finanzas.dameNombre()+" tiene un bonus de: "+
				jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de: "+ misEmpleados[3].establece_bonus(200));
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: "+e.dameNombre()
					+" Sueldo: "+ e.dameSueldo()
					+" Fecha de Alta: "+e.dameFechaContrato());
			
		}
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id =IdSiguiente;
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base +gratificacion;
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String dameNombre() {
		return nombre +" Id "+Id;
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
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.Id < otroEmpleado.Id) {
			
			return -1;
		}
		
		if(this.Id > otroEmpleado.Id) {
			
			return 1;
		}
		
		return 0;
		
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
}


class Jefatura extends Empleado implements Jefes{

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentiivo(double b) {
	
		incentivo = b;
		
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un  miembro de la  direccion ha tomado una decision de: "+decision;
		
	}
	
	
	public double establece_bonus(double gratificacion) {
		
		double prima = 2000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
		
	}
	
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe +incentivo;
	}
	
	private double incentivo;
}











