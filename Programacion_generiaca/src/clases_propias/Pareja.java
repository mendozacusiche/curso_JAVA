package clases_propias;

public class Pareja<T> {
	
	
	
	public Pareja() {
		
		primero = null;
		
	}
	
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) {
		
		Empleado primero = p.getPrimero();
		
		System.out.println(primero);
		
	}
	
	public void setPrimero(T nuevo_valor) {
		
		
		primero = nuevo_valor;
	}
	
	
	
	public T getPrimero() {
		
		return primero;
		
	}
	
	
	
	
	private T primero;
	
}