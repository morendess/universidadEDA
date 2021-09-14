package org.mp.sesion01;

public class Mayor {
	

	/**
	 * 	 
	 * @param a
	 * @return maximo
	 */
	public static int elEnteroMayor(int[] a) {
	
		if (a.length == 0) {

			throw new RuntimeException("Array vacio"); //envia un error

		}
		
		int max = Integer.MIN_VALUE;
		
		for (int indice = 0; indice < a.length ; indice++) {  
			if (a[indice] > max) {
				max = a[indice];
			}
		}
		return max;
	}

}
