package prueba.domain;

public class Comercial {
	private double ventas;
	
	public Comercial(String dni, String nombre, String apellidos, double sueldoBase) {
		String Dni = dni;
		String Nombre = nombre;
		String Apellidos = apellidos;
		double SueldoBase = sueldoBase;
	}
	
	public void setVentas(double ventas) {
		System.out.println("Ventas" + ventas);
	}
	
	public double getSueldo() {
		return ventas; 
	}

}
