package prueba.utils;

import java.util.Scanner;

public class Consola implements EntradaSalida{
	private Scanner sc;
	
	public Consola() {
		return;
	}
	
	public void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public void imprimirLinea(String texto) {
		System.out.println(texto);
	}
	
	public String leerTexto(String mensaje) {
		return null;
	}
	
	public int leerEntero(String mensaje) {
		return 0;
	}
	
	public double leerImporte(String mensaje) {
		return 0;
	}
	
	public void mostrarMenu() {
	}

	@Override
	public void limpiarPantalla() {
	}

	@Override
	public void pausa() {
	}
	
	
	

}
