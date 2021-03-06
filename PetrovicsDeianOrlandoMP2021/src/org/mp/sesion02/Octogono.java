package org.mp.sesion02;

public class Octogono extends ObjetoGeometrico implements Comparable, Cloneable, DeColor {

	protected double lado;

	/**
	 * @param color
	 * @param relleno
	 * @param lado
	 */

	public Octogono(String color, boolean relleno, double lado) {
		super(color, relleno);
		this.lado = lado;
	}

	public Octogono() {
		super();
		this.lado = 0;
	}

	public Octogono clone() {
		return new Octogono(color, relleno, lado);
	}

	public double getPerimetro() {
		return 8 * lado;
	}

	public double getArea() {
		return ((2 + (4 / Math.sqrt(2))) * lado * lado);
	}

	public double getLado() {
		return lado;

	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String comoColorear() {
		return "Colorear los 8 lados de " + color;
	}

	public int compareTo(Object o) {
		Octogono other = (Octogono) o;

		if (lado > other.lado) {
			return 1;
		}
		if (lado < other.lado) {
			return -1;
		} else {
			return 0;
		}
	}

}