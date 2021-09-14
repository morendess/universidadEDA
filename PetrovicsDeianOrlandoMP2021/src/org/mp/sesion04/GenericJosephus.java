package org.mp.sesion04;

public class GenericJosephus<E> {

	private int k;
	private int n;
	private GenericQueue<E> cola;

	/**
	 * Metodo que inicializa las propiedades a los argumentos 
	 * @param k
	 *  @param n 
	 *  @param objects
	 */
	public GenericJosephus(int k, int n, E[] objects) {
		this.k = k;
		this.n = n;
		cola = new GenericQueue<E>();
		if (objects != null) {
			for (int i = 0; i < objects.length; i++) {
				if (!objects[i].equals(""))
					cola.enqueue(objects[i]);
			}
		}
	}

	/**
	 * metodo que devuelve el valor de la propiedad cola
	 *  @return cola
	 */
	
	public GenericQueue<E> getCola() {
		return cola;
	}

	//"Problema de Josephus: k=0, n=0" + "\n" + "Cola: []";
	//"Problema de Josephus: k=3, n=9" + "\n" + "Cola: [1, 2, 3, 4, 5, 6, 7, 8, 9]"

	public String toString() {
		return "Problema de Josephus: k=" + k + ", n=" + n + "\n" + cola.toString();
	}

	//"No hay ninguna persona"
	//"Solo hay una persona"
	//"Orden de eliminación: " + "\n" + "Debe morir 3" + "\n" + "Debe morir 6" + "\n"....
	public String ordenEliminar(GenericQueue<E> cola) {
		if (cola.getSize() == 0)
			
			/* @return "No hay ninguna persona";*/
			
			throw new RuntimeException("No hay ninguna persona");
		if (cola.getSize() == 1)
			return "Solo hay una persona";
		String cadena = "Orden de eliminación: \n";
		while (cola.getSize() > 0) {
			for (int i = 1; i < k; i++) {

				E elemento = cola.dequeue();
				cola.enqueue(elemento);
			}
			cadena = cadena + "Debe morir " + cola.dequeue() + "\n";
		}
		return cadena;
	}
}