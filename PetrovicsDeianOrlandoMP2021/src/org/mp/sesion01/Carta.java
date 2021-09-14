package org.mp.sesion01;

public class Carta implements Comparable<Object>{

	private String palo;
	private int numero;
	private int valor;

	/**
	 *  Constructor 
	 *  @param palo
	 *  @param numero
	 */
	public Carta(String palo, int numero) {

		this.palo = palo;
		this.numero = numero;

		if ("O" == palo) {
			valor = numero;
		}
		if ("C" == palo) {
			valor = numero + 12;
		}
		if ("E" == palo) {
			valor = numero + 24;
		}
		if ("B" == palo) {
			valor = numero + 36;
		}

	}

	/**
	 *  Getter 
	 *  @return palo
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 *  Setter 
	 *  @param palo
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}

	/**
	 *  Getter 
	 *  
	 *  @return numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 *  Setter
	 *  @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter
	 * @return valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 *  Setter
	 *  @param valor
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/*
	 * (non-Javadoc) • @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Object o) {
		Carta other = (Carta) o;

		if (valor < other.getValor()) {
			return -1;
		}
		if (valor > other.getValor()) {

			return 1;
		} else {
			return 0;
		}

	}

	@Override
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
	
	
}