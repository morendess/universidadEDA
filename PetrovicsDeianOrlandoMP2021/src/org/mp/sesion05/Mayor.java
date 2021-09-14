package org.mp.sesion05;

import java.util.Arrays;

/**
 * The Class Mayor.
 *
 */
public class Mayor {

/**
 * El entero mayor.
 *
 * @param a array en el cual vamos a buscar el elemento mayor
 * @return el elemento mayor del array a
 */
	public static int elEnteroMayor(int[] a) {
		if (a.length == 0) {
			throw new RuntimeException("Array vacio");
		}else{
			Arrays.sort(a);
			return a[a.length - 1];
		}
	}
}