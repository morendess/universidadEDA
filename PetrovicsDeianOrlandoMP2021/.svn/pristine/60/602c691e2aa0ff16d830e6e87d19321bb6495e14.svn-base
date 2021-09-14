package org.mp.sesion02;

public class Persona {

	protected String nombre;
	protected String direccion;
	protected String correoElectronico;
	protected String telefono;

	/**
	 * Contructor por defecto
	 */

	public Persona() {
		this.nombre = "";
		this.direccion = "";
		this.correoElectronico = "";
		this.telefono = "";
	}

	/**
	 *  Contructor 
	 *  @param nombre
	 *  @param direccion 
	 *  @param telefono
	 *  @param correoElectronico
	 */

	public Persona(String nombre, String direccion, String telefono, String correoElectronico) {
		this.nombre = nombre;

		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
	}

	/**
	 * Contructor copia
	 * @param other
	 */

	public Persona(Persona other) {
		this.nombre = other.nombre;
		this.direccion = other.direccion;
		this.correoElectronico = other.correoElectronico;
		this.telefono = other.telefono;
	}

	/**
	 *  Mostrar en texto
	 */

	public String toString() {
		return "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " + telefono + ", email = "
				+ correoElectronico;
	}

}