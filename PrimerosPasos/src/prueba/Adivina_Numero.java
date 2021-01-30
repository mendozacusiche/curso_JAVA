package prueba;

import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random()*100);

		System.out.println(aleatorio);
	
		int numero = 0;
		
		int intentos =  0;
		
		do{
			
			intentos ++;
			
			System.out.println("Intoduce un  numero por favor");
			
			numero = entrada.nextInt();
			
			
			if (aleatorio < numero) {
				
				System.out.println("Mas bajo");
			}else if(aleatorio > numero) {
				
				System.out.println("Mas alto");
				
			}
		}while(numero  != aleatorio);
		
		System.out.println("****Correcto**** Lo as conseguido en " + intentos);
		
		
	}

}
