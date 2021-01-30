package ficheros_directorios;

import java.io.*;

public class Eliminar {
	
	public static void main(String[] args) {
		
		File ruta = new File("/home/abelardo/Escritorio/prueba_texto.txt");
		
		ruta.delete();
		
		
	}

}
