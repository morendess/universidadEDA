package org.mp.sesion05;

import java.util.Arrays;

/**
 * The Class Carta.
 *
 */
public class Carta implements Comparable<Object> {

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (valor != other.valor)
			return false;
		return true;
	}

	/** The palo. */
	private String palo;

	/** The numero. */
	private int numero;

	/** The valor. */
	private int valor;

	/**
	 * Constructor Carta.
	 *
	 * @param palo   the palo
	 * @param numero the numero
	 */
	public Carta(String palo, int numero) {

		this.palo = palo;
		this.numero = numero;
		if (palo == "O")
			this.valor = numero;
		if (palo == "C")
			this.valor = numero + 12;
		if (palo == "E")
			this.valor = numero + 24;
		if (palo == "B")
			this.valor = numero + 36;

	}

	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Gets the palo.
	 *
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * Gets the valor.
	 *
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	@Override
	public int compareTo(Object o) { // Compara si las cartas son iguales (Tienen el mismo valor)

		Carta otro = (Carta) o;
		if (valor == otro.valor)
			return 0;
		else if (valor < otro.valor)
			return -1;
		else
			return 1;
	}

}
