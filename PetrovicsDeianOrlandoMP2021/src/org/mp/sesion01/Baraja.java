package org.mp.sesion01;

public class Baraja {

	private String nombreBaraja;
	private Carta[] cartas;

	/**
	 *  Constructor 
	 *   @param nombreBaraja 
	 *   @param cartas
	 */
	public Baraja(String nombreBaraja, Carta[] cartas) {
		this.nombreBaraja = nombreBaraja;
		this.cartas = cartas;
	}

	/**
	 *  Setter 
	 *  @param cartas
	 */
	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	/**
	 *   Getter
	 *   @return cartas
	 */
	public Carta[] getCartas() {
		return cartas;
	}

	/**
	 *  Setter
	 *  @param nombreBaraja
	 */
	public void setNombreBaraja(String nombreBaraja) {
		this.nombreBaraja = nombreBaraja;
	}

	/**
	 *  Getter 
	 *  @return nombreBaraja
	 */
	public String getNombreBaraja() {
		return nombreBaraja;
	}
	
	

	/**
	 *  Metodo de ordenar con insercion
	 *  @param cartas
	 */
	public void insercion(Carta[] cartas) {
		for (int i = 1; i < cartas.length; i++) {
			Carta aux = cartas[i];
			int j;
			for (j = i - 1; j >= 0 && aux.compareTo(cartas[j]) < 0; j--) {
				cartas[j + 1] = cartas[j];
			}
			cartas[j + 1] = aux;
		}
	}
}