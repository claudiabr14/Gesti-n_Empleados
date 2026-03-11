package prueba.domain;

public class Tecnico {
	private int categoria;
	
	public Tecnico(String dni, String nombre, String apellidos, double sueldoBase, int categoria) {
		String Dni = dni;
		String Nombre = nombre;
		String Apellidos = apellidos;
		double SueldoBase = sueldoBase;
		int Categoria = categoria;
			
		}
	
	public double getSueldo() {
		double sueldoBase = 0;
		return (categoria * 100) + sueldoBase;
	}

}
