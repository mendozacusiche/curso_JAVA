import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {

		

		/*TreeSet<String> OrdPersonas = new TreeSet<String>();
		
		
		OrdPersonas.add("Sandra");
		OrdPersonas.add("Diana");
		OrdPersonas.add("Jose");
		OrdPersonas.add("Agustina");
		OrdPersonas.add("Peron");
		OrdPersonas.add("Abelardo");
		
		
		for(String s: OrdPersonas) {
			
			System.out.println(s);
			
		}*/
		
		
		Articulo primero = new Articulo(1, "Primer Articulo");
		Articulo segundo = new Articulo(20, "segundo Articulo");
		Articulo tercero = new Articulo(3, "Es tercero Articulo");
		
		
		
		TreeSet<Articulo>ordeArticulos = new TreeSet<Articulo>();
		
		ordeArticulos.add(tercero);
		ordeArticulos.add(primero);
		ordeArticulos.add(segundo);
		
		
		
		for (Articulo art: ordeArticulos) {
			
			System.out.println(art.getDescripcion());
		}

//		
//		Articulo comparadorArticulos =  new Articulo();
//		
//		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);
//		
		//ComparadorArticulos compara_art = new ComparadorArticulos();
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {

			@Override
			public int compare(Articulo o1, Articulo o2) {
				String desc1 = o1.getDescripcion();
				String desc2 = o2.getDescripcion();
				
				return desc1.compareTo(desc2);
			}
			
		});
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		
		for (Articulo art : ordenaArticulos2) {
			
			System.out.println(art.getDescripcion());
		}
		
	}

	
}

class Articulo implements Comparable<Articulo>{//, Comparator<Articulo>
	
	

	
	public Articulo(int num, String des) {
		
		
		numero_articulo = num;
		
		descripcion = des;
		
		
	}
	

	
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo -o.numero_articulo;
	}
	
	
	public String getDescripcion() {
		
		return descripcion;
	}
	
	
	private int numero_articulo;
	
	private String descripcion;

//	@Override
//	public int compare(Articulo o1, Articulo o2) {
//		// TODO Auto-generated method stub
//		
//		String descripcionA =o1.getDescripcion();
//		
//		String descripcionB = o2.getDescripcion();
//		
//		return descripcionA.compareTo(descripcionB);
//	}
	
}

class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		
		String desc1 = o1.getDescripcion();
		String desc2 = o2.getDescripcion();
		
		return desc1.compareTo(desc2);
	}
	
	
	
	
}































































