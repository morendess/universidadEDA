package org.mp.sesion02;

//Importamos "java.util.GregorianCalendar" para poder usar GregorianCalendar 

import java.util.GregorianCalendar;

public class Profesor extends Empleado {

	protected int categoria;
	protected String horario;

	

	/**
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 * @param correoElectronico
	 * @param despacho
	 * @param salario
	 * @param fecha
	 * @param horario
	 * @param categoria
	 */
	public Profesor(String nombre, String direccion, String telefono, String correoElectronico, String despacho,
			int salario, GregorianCalendar fecha, String horario, int categoria) {
		super(nombre, direccion, telefono, correoElectronico, despacho, salario, fecha);

		this.categoria = categoria;
		this.horario = horario;
	}

	/**
	 * Mostrar en texto
	 */

	public String toString() {
		String cadena = "Profesor ";

		switch (categoria) {
		case 1:
			cadena = cadena + "Ayudante\n";
			break;
		case 2:
			cadena = cadena + "Titular de Universidad\n";
			break;
		case 3:
			cadena = cadena + "Catedrático de Universidad\n";
			break;
		}
		return cadena + super.toString() + "Horario = " + horario;
	}

}