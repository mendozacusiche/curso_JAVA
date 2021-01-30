package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaPreparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
		try {
			
			//1. CREAR CONEXION
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "**********");
	
			PreparedStatement miSentencia=miConexion.prepareStatement("");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
