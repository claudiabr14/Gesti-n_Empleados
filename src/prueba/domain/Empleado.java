package prueba.domain;

public abstract class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private double sueldoBase;
	
	public Empleado(String dni, String nombre, String apellidos, double sueldoBase) {
		String Dni = dni;
		String Nombre = nombre;
		String Apellidos = apellidos;
		double SueldoBase = sueldoBase;
	}
	
	public abstract String getDni();
	public abstract String getNombre();
	public abstract String getApellidos();
	public abstract double getSueldoBase();
	
	public void setSueldoBase(double sueldoBase) {
		System.out.println("sueldoBase");
	}
	
}
	
	
