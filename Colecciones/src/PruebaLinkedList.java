import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> personas = new LinkedList<String>();
		
		
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		personas.add("Abelardo");
		
		
		System.out.println(personas.size());
		
		personas.add("Juan");
		
		ListIterator<String>it = personas.listIterator();
		
		it.next();
		it.add("Maria");
		
		for(String p: personas) {
			
			System.out.println(p);
		}
		
	}

}
