package org.mp.sesion05;

import java.util.Comparator;

/**
 * The Class NumeroPaloComparator.
 */
public class NumeroPaloComparator implements Comparator<Object> {
	
	/**
	 * Compara las cartas
	 *
	 * @param o1 the o 1
	 * @param o2 the o 2
	 * @return the int
	 */
	public int compare(Object o1, Object o2) {
	
		Carta carta1 = (Carta) o1;
		Carta carta2 = (Carta) o2;
		int num1 = carta1.getNumero();
		int num2 = carta2.getNumero();
		String palo1 = carta1.getPalo();
		String palo2 = carta2.getPalo();
		char[] palos = {'O', 'C', 'E', 'B'};
		
		if(num1 < num2)
			return -1;
		else if(num1 > num2)
			return 1;
		else {
			int valor1 = 0;
			int valor2 = 0;
			for(int i=0; i<palos.length; i++) {
				if(palos[i] == palo1.charAt(0))
					valor1 = i;
				if(palos[i] == palo2.charAt(0))
					valor2 = i;
			}
			if(valor1 == valor2)
				return 0;
			else if (valor1 > valor2)
				return 1;
				else
					return -1;
		}
	}
}
