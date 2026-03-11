package prueba.domain;

import java.util.List;

public class Plantilla extends Empleado {
	private List<Empleado> empleados;
	
	public Plantilla() {
		return;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		System.out.println("Empleado" + empleado);
	}
	
	public List<Empleado> getEmpleadosPorNombre(String filtroNombre){
		int List;
		int Empleado;
		return List<Empleado> empleados;
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
