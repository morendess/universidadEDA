package org.mp.sesion02;

public class Fraccion extends Number implements Comparable<Fraccion> {

	private int numerador;
	private int denominador;

	/**
	 * Constructor por defecto
	 *
	 */

	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	/**
	 * Constructor
	 *
	 * @param numerador • @param denominador
	 */

	public Fraccion(int numerador, int denominador) {

		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;
		this.denominador = Math.abs(denominador);

	}

	/**
	 * Comprueba si dos objetos son iguales • @param obj
	 *
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
	 *  Getter • @return numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 *  Getter • @return denominador
	 */

	public int getDenominador() {
		return denominador;
	}

	/**
	 *  Mostrar en texto • @return fraccion en String
	 */

	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}

	/**
	 *  Suma de dos fracciones • @param b • @return Resultado de la suma
	 */

	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	/**
	 *  Resta de dos fracciones • @param b • @return Resultado de la resta
	 */

	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	/**
	 * Multiplica dos fracciones • @param b • @return Resultado de la
	 * multiplicacion
	 */

	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}

	/**
	 * Divide dos fracciones • @param b • @return Resultado de la division
	 */

	public Fraccion dividir(Fraccion b) {

		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}

	/**
	 *  Hace el Minimo Comun Multiplo de dos números • @param i • @param j
	 * @return Minimo Comun Multiplo de dos numeros
	 */

	private static int mcd(int i, int j) {
		i = Math.abs(i);
		j = Math.abs(j);
		if (j == 0) {
			return i;
		}
		int r;
		while (j != 0) {
			r = i % j;
			i = j;
			j = r;
		}
		return i;
	}

	/**
	 *  Simplifica una fraccion • @return Fraccion simplificada
	 */

	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	/**
	 *  @return (int)doublevalue()
	 */

	public int intValue() {
		return (int) numerador / denominador;
	}

	/**
	 * @return (float)doublevalue()
	 */

	public float floatValue() {
		return (float) numerador / denominador;
	}

	/**
	 *  Devuelve el valor • @return (double)numerador/denominador
	 */

	public double doubleValue() {
		return (double) numerador / denominador;

	}

	/**
	 *  @return (long)doublevalue()
	 */

	public long longValue() {
		return (long) numerador / denominador;
	}

	/**
	 *
	 * Compara dos fracciones
	 *
	 *  @param otro
	 *
	 *  @return 1 • La primera fraccion es mayor que la segunda
	 *
	 * @return -1 • La primera fraccion es menor que la segunda
	 *
	 *  @return 0 • Las dos fracciones son iguales
	 */

	public int compareTo(Fraccion otro) {

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