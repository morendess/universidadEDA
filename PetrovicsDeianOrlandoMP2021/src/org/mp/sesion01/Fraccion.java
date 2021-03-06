package org.mp.sesion01;

public class Fraccion implements Comparable<Object> {

	private int numerador; //modificador de acceso privado
	private int denominador; //modificador de acceso privado

	/**
	 * Constructor por defecto
	 */
	
	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}
	
	/**
	 * Constructor
	 * @param numerador
	 * @param denominador
	 */

	public Fraccion(int numerador, int denominador) {

		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;
		this.denominador = Math.abs(denominador);

	}

	/**
	 * Comprueba la igualdad entre dos objetos
	 * @param Object
	 */
	
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) obj;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}

	/**
	 * getter
	 * @return
	 */
	
	public int getNumerador() {
		return numerador;
	}
	
	/**
	 * getter
	 * @return
	 */

	public int getDenominador() {
		return denominador;
	}

	/**
	 * Return de la fraccion en forma de string
	 * @return fraccion en string
	 */
	
	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}
	
	/**
	 * suma dos fracciones
	 * @param b
	 * @return resultado
	 */

	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}
	
	/**
	 * resta dos fracciones
	 * @param b
	 * @return resultado
	 */

	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}
	
	/**
	 * multiplica dos fracciones
	 * @param b
	 * @return resultado
	 */

	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}
	
	/**
	 * divide dos fracciones
	 * @param b
	 * @return resultado
	 */

	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}
	
	/**
	 * Calculo de minimo comun multiplo de dos numeros
	 * @param u
	 * @param v
	 * @return minimo comun multiplo de ambos numeros
	 */

	private static int mcd(int u, int v) {
		u = Math.abs(u);
		v = Math.abs(v);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	/**
	 * Simplificacion de fracciones
	 * @return fraccion simplificada
	 */
	
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	/**
	 * Compara dos fracciones
	 * 
	 * @return 1
	 * 		primera fraccion mayor que la segunda
	 * @return -1
	 * 		primera fraccion menor que la segunda
	 * @return 0
	 * 		fracciones iguales
	 */
	
	public int compareTo(Object o) {

		Fraccion otro = (Fraccion) o;

		double valorFraccion = (double) numerador / denominador;
		double valorOtro = (double) otro.getNumerador() / otro.getDenominador();

		if (valorFraccion > valorOtro)
			return 1;
		else if (valorFraccion < valorOtro)
			return -1;
		else
			return 0;

	}

}
