package conectaBD;

import java.sql.*;

public class conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//Connection miConexion = DriverManager.getConnection(url, info);
			//
			// 1. crea conexion
			//http://localhost/phpmyadmin/tbl_sql.php?db=pruebas&table=productos
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "********");
			
			
			//2.crear objeto statement
			
			Statement miStatement = miConexion.createStatement();
			
			//3. Ejecutar SQL
			
			ResultSet 	miResultset = miStatement.executeQuery("SELECT * FROM productos");
			
			//4. RECORRER EL RESULTSET
			
				while(miResultset.next()) {
					
					System.out.println(miResultset.getString("NOMBREARTICULO")+ " "+ miResultset.getString("CODIGOARTICULO")+ " "+ miResultset.getString("PRECIO"));
					
				}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("NO CONECTA !!!");
			
			e.printStackTrace();
		
		}

		
		
	}

}
