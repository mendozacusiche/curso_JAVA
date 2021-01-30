package poo;

public class Coche {

	//propiedades
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;

	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	//Constructor 
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;

	}
	
	public String dime_datos_Generales() { // getter
		
		return "La plataforma del vehículo tiene " + ruedas +" ruedas "+
		". Mide " + largo/1000 + " Metros  con un ancho de "+ ancho+
		". cm y un peso de plataforma de "+ peso_plataforma + " kg";
	}
	
	public void establece_color(String color_coche) { //setter
	
		color = color_coche;
	}
	
	public String dime_Color() {
		return "El color del coche es "+ color;
	}
	
	public void configura_Asientos(String asientos_cuero) {
		
		if (asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero= true;
		}else {
			this.asientos_cuero = false;
		}
		
	}
	
	public String dime_asientos() {
		if(asientos_cuero == true) {
			
			return "El coche tiene asientos de cuero ";
		}else {
			
			return "EL coche tiene asientos de serie";
		}
	}
	
	
	public void configura_Climatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador= true;
		}else {
			this.climatizador= false;
		}
	}
	
	public String dime_climatizador() {
		
		if(climatizador == true) {
			return "El coche incorpora climatizador";
		}else {
			return"El coche tiene aire a condicionado";
		}
		
		
	}
	
	
	public String dime_peso_coche() { //Setter y Getters
		int peso_carroseria = 500;
		
		peso_total = peso_plataforma + peso_carroseria;
		
		if (asientos_cuero == true) {
			peso_total = peso_total +50;
		}
		if(climatizador == true) {
			peso_total = peso_total + 20;
		}
		
		
		return "Peso del coche es "+peso_total;
			
	}
	
	
	public int presio_coche() {
		int precio_final =10000;
		
		if(asientos_cuero == true) {
			precio_final +=2000;
		}
		
		if(climatizador == true) {
			precio_final += 1500;
		}
		
		return precio_final;
	}
	

}
