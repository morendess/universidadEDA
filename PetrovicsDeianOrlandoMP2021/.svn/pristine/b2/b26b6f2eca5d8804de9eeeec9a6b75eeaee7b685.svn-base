package org.mp.sesion02;

public class Busqueda{

	/**
	 * • Busqueda binaria • @param <E> • @param list • @param obj • @return
	 * • @throws ExcepcionArrayVacio
	 */

	public static <E> int busquedaBinaria(E[] list, E obj) throws ExcepcionArrayVacio {
		if (list.length == 0) {
			throw new ExcepcionArrayVacio("Array vacío");
		}

		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}

}
