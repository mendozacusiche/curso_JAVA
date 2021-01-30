package arraylist;

import java.util.*;

//import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Empleado listaeEmpleado[] = new Empleado[4];
//		
//		listaeEmpleado[0]= new Empleado("Ana", 45, 2500);
//		listaeEmpleado[1]= new Empleado("Antonio", 55, 2000);
//		listaeEmpleado[2]= new Empleado("Maria", 25, 2600);
//		listaeEmpleado[3]= new Empleado("Maria", 25, 2600);

		
		//ArrayList <Empleado> listaEmpleados =new ArrayList<Empleado>();
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		listaEmpleados.ensureCapacity(15);
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		
		
		//listaEmpleados.trimToSize();
		
		listaEmpleados.set(1, new Empleado("Olga", 20, 40000));
		
		/*System.out.println(listaEmpleados.size());
		
		for (Empleado e: listaEmpleados) {
			
			System.out.println(e.dameDatos());
			
		}*/
		
		Iterator<Empleado> mi_interador = listaEmpleados.iterator();
		
		
		while(mi_interador.hasNext()) {
			System.out.println(mi_interador.next().dameDatos());
		}
		
		//System.out.println(listaEmpleados.get(4).dameDatos());
		
		
		/*for (int i =0; i< listaEmpleados.size(); i++) {
			
			Empleado e= listaEmpleados.get(i);
			
			System.out.println(e.dameDatos());
			
		}*/
		
		/*Empleado arrayE[] = new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayE);
		
		
		for (int i= 0 ; i < arrayE.length; i++) {
			
			System.out.println(arrayE[i].dameDatos());
			
		}*/
		
	}

}

class Empleado{
	
	public Empleado(String nombre, int edad, double salario) {
		
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.salario = salario;
	}
	
	public String dameDatos() {
		
		return "El empleado se llama "+nombre+". Tiene "+edad+" años "+"Y un salario de "+ salario;
		
	}
	
	
	private String nombre;
	private int edad;
	private double salario;
	
	
}









































































































