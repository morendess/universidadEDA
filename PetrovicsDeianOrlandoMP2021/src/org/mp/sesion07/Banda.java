package org.mp.sesion07;

/**
 * The Class Banda.
 *
 * @param <T> the generic type
 */
public class Banda<T extends Number> {
	
	/** The nombre banda. */
	private String  nombreBanda;
	
	/** The datos. */
	private T[][] datos;
	
	/**
	 * Banda.
	 *
	 * @param nombre the nombre
	 * @param x the x
	 * @param y the y
	 */
	public Banda(String nombre, int x, int y) {
		this.nombreBanda = nombre;
		this.datos = (T[][]) new Number[y][x];
	}
	
	/**
	 * Banda.
	 *
	 * @param nombre the nombre
	 * @param datos the datos
	 */
	public Banda(String nombre, T[][] datos) {
		this.nombreBanda = nombre;
		this.datos = (T[][]) new Number[datos.length][datos[0].length];
		for (int i=0; i<datos.length; i++) {
			for(int j=0; j<datos[0].length; j++) {
				this.datos[i][j] = datos[i][j];
			}
		}
	}
	
	/**
	 * Gets the nombre banda.
	 *
	 * @return the nombre banda
	 */
	public String getNombreBanda() {
		return nombreBanda;
	}
	
	/**
	 * Sets the nombre banda.
	 *
	 * @param nombreBanda the new nombre banda
	 */
	public void setNombreBanda(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}
	
	/**
	 * Gets the datos.
	 *
	 * @return the datos
	 */
	public T[][] getDatos(){
		return datos;
	}
	
	/**
	 * Sets the datos.
	 *
	 * @param datos the new datos
	 */
	public void setDatos(T[][] datos) {
		this.datos = datos;
	}
	
	/**
	 * Gets the dato XY.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the dato XY
	 * @throws XYFueraImagenException the XY fuera imagen exception
	 */
	public T getDatoXY(int x, int y) {
		return datos[y][x];
	}
	
	/**
	 * Sets the datos XY.
	 *
	 * @param dato the dato
	 * @param x the x
	 * @param y the y
	 * @throws XYFueraImagenException the XY fuera imagen exception
	 */
	public void setDatoXY(T dato, int x, int y) {
		datos[y][x] = dato;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String s = nombreBanda + ": \n";
		for(int i=0; i<datos.length; i++) {
			for(int j=0; j<datos[0].length; j++) {
				s += datos[i][j] + " ";
			}
			
			s += "\n";
		}
		
		return s;
	}

}
