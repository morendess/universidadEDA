package org.mp.sesion02;

import java.util.GregorianCalendar;

public abstract class ObjetoGeometrico {

	protected String color;
	protected boolean relleno;
	protected GregorianCalendar fechaCreado;

	/**
	 * Constructor por defecto
	 */

	public ObjetoGeometrico() {
		this.color = "blanco";
		this.relleno = false;
		this.fechaCreado = new GregorianCalendar();
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param relleno
	 */

	public ObjetoGeometrico(String color, boolean relleno) {
		this.color = color;
		this.relleno = relleno;
		this.fechaCreado = new GregorianCalendar();
	}

	/**
	 * Getter
	 * 
	 * @return color
	 */

	public String getColor() {
		return color;
	}

	/**
	 * Setter
	 * 
	 * @param color
	 */

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Comprueba si el objeto tiene relleno
	 * 
	 * @return relleno (true o false)
	 */

	public boolean esRelleno() {
		return relleno;
	}

	/**
	 * Setter
	 * 
	 * @param relleno
	 * 
	 */

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	/**
	 * Getter
	 * 
	 * @return fecha de creacion
	 */

	public GregorianCalendar getFechaCreado() {
		return fechaCreado;
	}

	/**
	 * Mostrar en texto
	 */

	public String toString() {
		return "Creado el " + fechaCreado + "\ncolor: " + color + " y relleno: " + relleno;
	}

	/**
	 * Obtiene el perimetro
	 * 
	 * @return perimetro
	 */
	abstract double getPerimetro();

	/**
	 * Obtiene el area
	 * 
	 * @return area
	 */

	abstract double getArea();

}