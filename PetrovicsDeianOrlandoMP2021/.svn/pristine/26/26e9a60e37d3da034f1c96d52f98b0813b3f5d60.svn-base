package org.mp.sesion02;

import java.util.Iterator;
//NoSuchElementException muestra en pantalla un mensaje cuando se quiere indicar que el elemento que se solicita no existe
import java.util.NoSuchElementException;

public class IteradorPrimos implements Iterator<Integer> {

	private int limite;
	private int actual = 2;

	/**
	 * Constructor
	 * 
	 * @param limite
	 */
	public IteradorPrimos(int limite) {
		this.limite = limite;
	}

	/**
	 * Getter
	 * 
	 * @return limite
	 */

	public int getLimite() {
		return limite;
	}

	/**
	 * Getter
	 * 
	 * @return actual
	 * 
	 */

	public int getActual() {
		return actual;
	}

	/**
	 * @return actual menor o igual al limite
	 */

	public boolean hasNext() {
		return actual <= limite;
	}

	/**
	 * @return i
	 */

	public Integer next() {
		if (actual > limite) {

			throw new NoSuchElementException("No se puede acceder a más números primos");
		}

		int temp = actual;
		do {
			actual++;
		} while (!esPrimo(actual));

		return temp;

	}

	/**
	 * El elemento no existe
	 */
	public void remove() {
		throw new UnsupportedOperationException("Método no soportado");
	}

	/**
	 * Comprueba si un numero es primo • @param numero • @return false o true
	 */

	public static boolean esPrimo(int numero) {
		if (numero % 2 == 0 && numero != 2) {
			return false;
		}
		for (int divisor = 3; divisor <= Math.sqrt(numero); divisor += 2) {
			if (numero % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Mostrar primos
	 * 
	 * @return cadena
	 * 
	 */

	public String mostrarPrimos() {
		String cadena = "";
		int contador = 1;
		while (this.hasNext()) {
			if (contador % 10 == 0) {
				cadena += "\t" + this.next() + "\n";
			} else {
				cadena += "\t" + this.next();
			}
			contador++;
		}
		return cadena;
	}

}