public class Libro {

	public Libro(String titulo, String autor, int ISBN) {
		
		
		
		this.titulo = titulo;
		
		this.autor = autor;
		
		this.ISBN = ISBN;
		
		
		
		
		
		
	}
	
	
	/*public boolean equals(Object obj) {
		
		
		if(obj instanceof Libro) {
			
			Libro otro = (Libro)obj;
			
			if(this.ISBN == otro.ISBN) {
				
				return true;
			}else {
				
				return false;
			}
			
		}else {
			
			return false;
		}
		
	}*/
	
	
	
	
	
	
	public String getDatos() {
		
		return "El titulo es: " +titulo+"  El autor es "+ autor+" Y el ISBN es "+ISBN;
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}


	private String titulo;
	private String autor;
	private int ISBN;
}
