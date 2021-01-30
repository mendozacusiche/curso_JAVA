
import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, Empleado> personal = new HashMap<String , Empleado>();
		
		
		personal.put("1", new Empleado("abelardo"));
		personal.put("2", new Empleado("abel"));
		personal.put("3", new Empleado("ana"));
		personal.put("4", new Empleado("sofi"));
		personal.put("5", new Empleado("angel"));
		personal.put("6", new Empleado("eduardo"));
		
		System.out.println(personal.entrySet());
		

		personal.remove(5);
		
		System.out.println(personal);
		
		personal.put("6",new Empleado( "Nathalia"));
		//System.out.println(personal.entrySet());
		
		//System.out.println(personal);
		
		for(Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("clave=  "+ clave+"  Valor= "+valor);
			
		}
		
	}

}


class Empleado{
	
	
	public Empleado(String nombre) {
		
		
		this.nombre = nombre;
		
		sueldo =2000;
	}

	
	public String toString() {
		
		return "[Nombre= "+nombre+", sueldo= "+ sueldo+"]";
	}
	
	
	
	private String nombre;
	
	private double sueldo ;
}













































