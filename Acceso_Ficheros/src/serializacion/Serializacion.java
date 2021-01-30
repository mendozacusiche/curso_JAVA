package serializacion;

import java.util.*;
import java.io.*;

public class Serializacion {
	public static void main(String[] args) {
		
		Administrador jefe = new Administrador("Juan", 8000, 2005, 12, 15);
		
		jefe.setIncentivo(5000);
		
		
		Empleado [] personal = new Empleado[3];
		
		
		personal[0] = jefe;
		
		personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
		
		personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);
		
		
		
		try {
			
			//ObjectOutputStream escribiendo_fechero = new ObjectOutputStream(new FileOutputStream("/home/abelardo/Escritorio/empleado.dat"));
			
			
			//escribiendo_fechero.writeObject(personal);
			
			//escribiendo_fechero.close();
			
			ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("/home/abelardo/Escritorio/empleado.dat"));
			
			Empleado[] personal_ruperando=(Empleado[])recuperando_fichero.readObject();
			
			recuperando_fichero.close();
			
			
			for(Empleado e : personal_ruperando) {
				
				System.out.println(e);
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

	
	
}


//-----------------------------------------------------------------------------------
class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Empleado (String n, double s, int agno, int mes, int dia) {
		
		nombre =n;
		sueldo = s;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia );
		
		fechaContrato = calendario.getTime();
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		
		return sueldo;
	}
	
	public Date getFechaContrato() {
		
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje/100;
		
		sueldo*=aumento;
		
	}
	
	
	public String toString() {
		/*
		 * metodo tuString pertenece a la clase object  toda las classes que
		 * podemos crear para espesificar una descripcion de nuestra clase
		 * */
		return "El Nombre es = "+nombre+", y su Sueldo es = "+sueldo+", fecha de contrato"+fechaContrato;
		
	}
	
	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
}


class Administrador extends Empleado{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Administrador(String n, double s, int agno, int mes, int dia) {
		
		super(n, s, agno, mes, dia);
		
		incentivo = 0;
		
	}
	
	
	public double getSuedo() {
		
		double sueldoBase = super.getSueldo();
		
		return sueldoBase;
		
	}
	
	public void setIncentivo(double b) {
		
		incentivo = b;
	}
	
	
	public String toString() {
		
		return super.toString()+", Incentibvo="+ incentivo;
	}
	
	private double incentivo;
}



































































