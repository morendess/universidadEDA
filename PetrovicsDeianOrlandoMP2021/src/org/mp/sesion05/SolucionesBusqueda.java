package org.mp.sesion05;

/**
 * The Class SolucionesBusqueda.
 */
public class SolucionesBusqueda {
	
	/**
	 * Busqueda lineal.
	 *
	 * @param busqueda the busqueda
	 * @return the int
	 * @throws ElementoNoEncontradoException the elemento no encontrado exception
	 */
	public static int busquedaLineal(Busqueda busqueda) throws ElementoNoEncontradoException{
		
		int numElementos = busqueda.getNumElementos();
		int[] datos = busqueda.getDatos();
		int numBuscado = busqueda.getNumBuscado();
		
		for(int i=0; i<numElementos; i++) {
			if(numBuscado == datos[i]) {
				return i;
			}
		}
		
		throw new ElementoNoEncontradoException("No encontrado");
	}
	
	/**
	 * Busqueda binaria iterativa
	 *
	 * @param busqueda the busqueda
	 * @return the int
	 * @throws ElementoNoEncontradoException the elemento no encontrado exception
	 */
	public static int busquedaBinariaIter(Busqueda busqueda) throws ElementoNoEncontradoException {
		
		int numElementos = busqueda.getNumElementos();
		int[] datos = busqueda.getDatos();
		int numBuscado = busqueda.getNumBuscado();
		
		int inicio = 0;
		int fin = numElementos - 1;
		int mitad;
		while(inicio <= fin) {
			mitad = (inicio+fin)/2;
			if(numBuscado == datos[mitad]) {
				return mitad;
			}
			if(numBuscado < datos[mitad]) {
				fin = mitad-1;
			}else {
				inicio = mitad+1;
			}
		}
		
		throw new ElementoNoEncontradoException("No encontrado");
	}
	
	/**
	 * Busqueda binaria recursiva
	 *
	 * @param busqueda the busqueda
	 * @return the int
	 * @throws ElementoNoEncontradoException the elemento no encontrado exception
	 */
	public static int busquedaBinariaRec(Busqueda busqueda) throws ElementoNoEncontradoException {
		
		return busquedaBinariaRec(busqueda.getDatos(), busqueda.getNumBuscado(), 0, busqueda.getNumElementos()-1);
	}
	
	/**
	 * Busqueda binaria recursiva
	 *
	 * @param datos the datos
	 * @param numBuscado the num buscado
	 * @param inicio the inicio
	 * @param fin the fin
	 * @return the int
	 * @throws ElementoNoEncontradoException the elemento no encontrado exception
	 */
	private static int busquedaBinariaRec(int[] datos, int numBuscado, int inicio, int fin) throws ElementoNoEncontradoException {
		
		if(inicio > fin) {
			 throw new ElementoNoEncontradoException ("No encontrado");
		}
		int mitad = (inicio+fin)/2;
		if(datos[mitad] == numBuscado) {
			return mitad;
		}
		if(numBuscado < datos[mitad]) {
			return busquedaBinariaRec(datos, numBuscado, inicio, mitad-1);
		}else {
			return busquedaBinariaRec(datos, numBuscado, mitad+1, fin);
		}
		
	}
	

}
