package org.mp.sesion02;

//Importamos Calendario Gregoriano

import java.util.GregorianCalendar;

public class Empleado extends Persona {

	protected String despacho;
	protected int salario;
	protected GregorianCalendar fecha;

	/**
	 * • Constructor • @param nombre • @param direccion • @param telefono • @param
	 * correoElectronico • @param despacho • @param salario • @param fecha
	 */
	public Empleado(String nombre, String direccion, String telefono, String correoElectronico, String despacho,
			int salario, GregorianCalendar fecha) {
		super(nombre, direccion, telefono, correoElectronico);
		this.despacho = despacho;
		this.salario = salario;
		this.fecha = fecha;
	}

	/**
	 * • Mostrar en texto
	 * 
	 */

	public String toString() {
		String cadena = "";
		cadena = cadena + "\nDespacho = " + despacho + ", salario = " + salario + ", Fecha de contratación = "
				+ fecha.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (fecha.get(GregorianCalendar.MONTH) +1) + "/"
				+ fecha.get(GregorianCalendar.YEAR) + "\n";
		return super.toString() + cadena;
	}




}