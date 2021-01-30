package leyendo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Leer_Fichero accediendo = new Leer_Fichero();
		
		accediendo.leer();
		
	}

}


class Leer_Fichero{
	
	
	public void leer() {
		
		try {
			
			FileReader entrada= new FileReader("/home/abelardo/Escritorio/ejemplo.txt");
		
			BufferedReader mibuffer =  new BufferedReader(entrada);
			
			String linea = "";
			//int c = entrada.read();
			
			while (linea != null) {
				
				linea = mibuffer.readLine();
				//c= entrada.read();
				
				//char letra =(char)c;
				if (linea != null)
					System.out.println(linea);
				
				
				
			}
			entrada.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("No se ha encontrado el archivo");
		}
	}
}


















































