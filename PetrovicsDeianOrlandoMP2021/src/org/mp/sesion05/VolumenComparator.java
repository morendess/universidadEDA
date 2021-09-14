package org.mp.sesion05;

import java.util.Comparator;

/**
 * The Class VolumenComparator.
 *
 */
public class VolumenComparator implements Comparator<Object> {

/**
 * Compare.
 *
 * @param o1 the o 1
 * @param o2 the o 2
 * @return the int
 */

	public int compare(Object o1, Object o2) {
		Accion a1 = (Accion) o1;
		Accion a2 = (Accion) o2;

		long vol1 = a1.getVolumen();
		long vol2 = a2.getVolumen();
		if (vol1 > vol2)
			return 1;
		else if (vol1 < vol2)
			return -1;
		else
			return 0;
	}
}