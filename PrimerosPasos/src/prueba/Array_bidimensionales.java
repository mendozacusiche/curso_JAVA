package prueba;

public class Array_bidimensionales {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int [][] matrix = {
				{10, 15, 18, 19,21},
				{5, 25, 37,41, 15 },
				{7, 19, 32, 14, 90},
				{85, 2, 7, 40, 17}
		};
		

		//System.out.println("valor almacenado en la posion 2, 3 "+matrix[2][3]);

		
		/*for (int i =0; i < 4; i ++) {
			
			for(int j=0; j <5; j++) {
				
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}*/
		
		for (int[]fila:matrix) {
			
			System.out.println();
			
			for(int z: fila) {
				System.out.print(z+ " ");
			}
		}
		
		

	}

}
