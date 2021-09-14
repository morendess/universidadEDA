package org.mp.sesion02;

import java.util.GregorianCalendar; //Calendario Gregoriano 

public class Administrativo extends Empleado {

	protected String unidadDestino;

	/**
	 * • Constructor • @param nombre • @param direccion • @param telefono • @param
	 * correoElectronico • @param despacho • @param salario • @param fecha • @param
	 * unidadDestino
	 */

	public Administrativo(String nombre, String direccion, String telefono, String correoElectronico, String despacho,
			int salario, GregorianCalendar fecha, String unidadDestino) {

		super(nombre, direccion, telefono, correoElectronico, despacho, salario, fecha);

		this.unidadDestino = unidadDestino;

	}

	/**
	 * • Mostrar en texto
	 */

	public String toString() {

		return "Administrativo\n" + super.toString() + "Destinado en la unidad " + unidadDestino;
	}

}