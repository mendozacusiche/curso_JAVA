package clases_propias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombres []= {
				"JOse",
				"Maria",
				"Pepe",
				"Abelardo"
		};
		
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		
		GregorianCalendar fechas []= {
				new GregorianCalendar(2010, 7,3),
				new GregorianCalendar(2011, 2,3),
				new GregorianCalendar(2000, 4,3),
				new GregorianCalendar(2009, 7,3),
				new GregorianCalendar(2001, 6,3),
				
		};
		
		System.out.println(MisMatrices.getMenor(fechas));
		
		//String elementos = MisMatrices.getElementos(nombres);
		
		
		//System.out.println(elementos);
		
//		Empleado listaEmpleado[] = {
//				new Empleado("Ana ", 45, 12000),
//				new Empleado("Jose ", 45, 12000),
//				new Empleado("Pedro ", 45, 12000),
//				new Empleado("fiona ", 45, 12000),
//				new Empleado("lucina ", 45, 12000),
//				new Empleado("Helias ", 45, 12000),
//				new Empleado("rober ", 45, 12000),
//				new Empleado("Marta ", 45, 12000),
//				new Empleado("sofi ", 45, 12000),
//				new Empleado("agustina ", 45, 12000),
//		
//				
//		};
//		
//		
//		System.out.println(MisMatrices.getElementos(listaEmpleado));
	}

}





class MisMatrices{
	
	
	
	public static <T extends Comparable> T getMenor(T[] a) {
		

		if(a == null || a.length ==0) {
			
			return null;
			
		}
		
		T elementoMenor = a[0];
		
		
		for(int i =1; i < a.length; i++) {
			
			
			if(elementoMenor.compareTo(a[i])> 0) {
			
				elementoMenor= a[i];
				
			}
			
			
		}
		return elementoMenor;
		
	}
	
}




















































































































































