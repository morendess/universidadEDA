package org.mp.sesion02;

public class Estudiante extends Persona {

	protected int nivel;

	/**
	 *
	 * • @param nombre • @param direccion • @param telefono • @param
	 * correoElectronico • @param nivel
	 */

	public Estudiante(String nombre, String direccion, String telefono, String correoElectronico, int nivel) {
		super(nombre, direccion, telefono, correoElectronico);
		this.nivel = nivel;
	}

	/**
	 * • Constructor por defecto
	 */

	public Estudiante() {
		super();
		this.nivel = 0;
	}

	/**
	 * 
	 * • Mostrar en texto
	 */

	public String toString() {
		String cadena = "";
		cadena = "Estudiante de ";

		switch (nivel) {
		case 1:
			cadena = cadena + "Grado\n";
			break;
		case 2:
			cadena = cadena + "Máster\n";
			break;
		case 3:
			cadena = cadena + "Doctorado\n";
			break;
		}
		return cadena + super.toString();
	}

}