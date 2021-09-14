package org.mp.sesion05;

/**
 * The Class Accion.
 *
 * The Class Accion.
 */
public class Accion implements Comparable<Accion> {
	
	/** The nombre. */
	private String nombre;
	
	/** The volumen. */
	private long volumen;
	
	/**
	 * Instantiates a new accion.
	 *
	 * @param nombre the nombre
	 * @param volumen the volumen
	 */
	public Accion(String nombre, long volumen) {
		this.nombre = nombre;
		this.volumen = volumen;
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the volumen.
	 *
	 * @return the volumen
	 */
	public long getVolumen() {
		return volumen;
	}
	
	/**
	 * Sets the volumen.
	 *
	 * @param volumen the new volumen
	 */
	public void setVolumen(long volumen) {
		this.volumen = volumen;
	}
	
	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(this == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Accion other = (Accion) obj;
		if(nombre == null) {
			return false;
		}else if(nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Accion [nombre="+nombre+", volumen="+volumen+"]";
	}
	
	/**
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	public int compareTo(Accion o) {
		return this.nombre.compareTo(o.nombre);
	}

}
