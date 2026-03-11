package prueba.domain;

import java.util.List;

public class Plantilla extends Empleado {
	public Plantilla(String dni, String nombre, String apellidos, double sueldoBase) {
		super(dni, nombre, apellidos, sueldoBase);
		// TODO Auto-generated constructor stub
	}

	private List<Empleado> empleados;
	
	public Plantilla plantilla() {
		return null;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		System.out.println("Empleado" + empleado);
	}
	
	public List<Empleado> getEmpleadosPorNombre(String filtroNombre){
		return empleados;
	}

	@Override
	public String getDni() {
		return null;
	}

	@Override
	public String getNombre() {
		return null;
	}

	@Override
	public String getApellidos() {
		return null;
	}

	@Override
	public double getSueldoBase() {
		return 0;
	}

}
