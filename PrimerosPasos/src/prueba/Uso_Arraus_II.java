package prueba;

import javax.swing.*;
public class Uso_Arraus_II {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		/*String [] paises = new String[10];
		
		/*paises [0] = "España";
		paises [1] = "México";
		paises [2] = "Colombia";
		paises [3] = "Perú";
		paises [4] = "Chile";
		paises [5] = "Argentina";
		paises [6] = "Ecuador";
		paises [7] = "España";
		paises [8] = "Venezuela";
		paises [9] = "Uruguay";*/
		
	/*	for(int i = 0; i< paises.length; i++) {
			
			System.out.println("Paises " +(i+1)+" "+ paises[i]);
			
		}
		
		//String[] paises = {"España", "Peru", "Venezuela", "Ecuador", "uruguay", "Mexico"};
		
		for (int i= 0; i < paises.length; i++) {
			
			paises [i] = JOptionPane.showInputDialog("Introduce pais "+ (i+1));
			
		}
		
		for (String elemento:paises) {
			System.out.println("País "+elemento);
		}*/
		
		int [] matriz_aleatorios = new int[150];
		
		for (int i =0; i <matriz_aleatorios.length ; i++) {
			
			matriz_aleatorios[i]= (int)Math.round(Math.random()*100);
		}
		
		for(int numeros: matriz_aleatorios) {
		
			System.out.print(numeros+ " ");
		
		}
		
		
	}

}
