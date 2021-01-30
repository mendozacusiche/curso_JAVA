package ficheros_directorios;

import java.io.*;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File ruta = new File("bin");
		
		System.out.println(ruta.getAbsolutePath());
	
		
		String [] nombres_archivo =ruta.list();
		
		for(int i= 0; i < nombres_archivo.length; i++) {
			
			System.out.println(nombres_archivo[i]);
			
			File f = new File(ruta.getAbsoluteFile(), nombres_archivo[i]);
			
			if (f.isDirectory()) {
				
				String[] archivos_subcapeta = f.list();
				
				for(int j = 0; j< archivos_subcapeta.length; j++) {
					
					System.out.println(archivos_subcapeta[i]);
				}
			}
			
		}
	}

}
































































































