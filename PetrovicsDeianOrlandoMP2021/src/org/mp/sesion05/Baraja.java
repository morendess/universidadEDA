package org.mp.sesion05;

import java.util.Random;

/**
 * The Class Baraja.
 *
 */
public class Baraja {

	/** Nombre baraja. */
	private String nombreBaraja;
	
	/**  Array cartas. */
	private Carta[] cartas;

	/**
	 * Instancia una nueva baraja.
	 *
	 * @param nombreBaraja the nombre baraja
	 * @param cartas the cartas
	 */
	public Baraja(String nombreBaraja, Carta[] cartas) {
		
		this.nombreBaraja = nombreBaraja;
		this.cartas = cartas;
	}
	
	/**
	 * Gets the cartas.
	 *
	 * @return cartas
	 */
	public Carta[] getCartas() {
		return cartas;
	}
	
	/**
	 * Insercion.
	 *
	 * @param a the a
	 */
	public void insercion (Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			Comparable aux = a[i];
			int j;
			
			for (j = i-1; j>=0 && aux.compareTo(a[j]) < 1; j--) {
				
				a[j+1] = a[j];
			}
			
			a[j+1] = aux;
		}
	}
}
