package arraylist;

import java.io.*;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Arraylist archivo = new Arraylist(4);
		
		
		
//		archivo.add("Juan");
//		archivo.add("Maria");
//		archivo.add("Ana");
//		archivo.add("Sandra");
		
		archivo.add(new File("bin"));
		
		
		//String nombrePersona = (String)archivo.get(2);
		
		File nombrePersona= (File)archivo.get(0);
		
		System.out.println(nombrePersona);
		
	}

}








































































