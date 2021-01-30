package Leyendo_escribiendo_bytes;

import java.io.*;

public class Lectura_Escrituta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador =0;
		int datos_entrada[] = new int[15950];
		
		
		try {
			
			FileInputStream archivo_lectura = new FileInputStream("/home/abelardo/Descargas/luciana.jpeg");
			
			boolean final_ar = false;
			
			
			while (!final_ar) {
				
				int byte_entrada = archivo_lectura.read();
				
				if(byte_entrada != -1) {
					
					datos_entrada[contador]= byte_entrada;
				}else{
					
					final_ar = true;
				}
				
				System.out.println(datos_entrada[contador]);
				contador++;
				
			//System.out.println(byte_entrada);
			
				
			}
					
		System.out.println("cantidad de bytes de la imagen: "+contador);
		archivo_lectura.close();	
			
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Erro al acceder al a imagen");
		}
		
		System.out.println(contador);
		
		crea_fichero(datos_entrada);
	
		
	}
	
	
	static void crea_fichero(int datos_nuevo_fichero[]) {
		
		
		try {
			
			FileOutputStream fichero_nuevo = new FileOutputStream("/home/abelardo/Escritorio/luciana.jpeg"); 
			
			
			for (int i= 0; i < datos_nuevo_fichero.length; i++) {
				
				
				fichero_nuevo.write(datos_nuevo_fichero[i]);
				
			}
			
			fichero_nuevo.close();
			
		}catch (IOException e) {
			// TODO: handle exception
			
			System.out.println("Error al crear el archivo");
		}
		
		
	}
	

}






















