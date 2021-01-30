import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 20000);
		Cliente cl2 = new Cliente("Rafael Nada ", "00002", 25000);
		Cliente cl3 = new Cliente("Antonio Banderas", "00003", 30000);
		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 500000);
		Cliente cl5 = new Cliente("Antonio Banderas", "020001", 200300);
		
		
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		
		
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		
		
		/*for (Cliente c : clientesBanco) {
			
			//System.out.println(c.getNombre()+" "+ c.getN_cuenta()+" "+c.getSaldo());
			
			
			if(c.getNombre().equals("Julio Iglesias")) {
				
				clientesBanco.remove(c);
			}
			
		}
		*/
		
		Iterator <Cliente>it =clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombre_cliente = it.next().getNombre();
			
			if(nombre_cliente.equals("Julio Iglesias")) {
				it.remove();
			}
		}
		
		for(Cliente c: clientesBanco) {
			
			System.out.println(c.getNombre()+" "+ c.getN_cuenta()+" "+c.getSaldo());
		}
		
		
		/*Iterator<Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombre_cliente = it.next().getNombre();
			
			System.out.println(nombre_cliente);
		}*/
		
		
		
	}

}












































































