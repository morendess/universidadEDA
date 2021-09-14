package org.mp.sesion05;

import java.util.Arrays;

/**
 * The Class Ordenacion.
 *
 */

public class Ordenacion {
	
	/**
	 * Ordenacion por insercion.
	 *
	 * @param a the a
	 */
	public static void ordenacionPorInsercion(Comparable[] a) {
		for(int i=1; i<a.length; i++) {
			Comparable aux = a[i];
			int j;
			for(j=i-1; j>=0 && aux.compareTo(a[j])<0; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = aux;
		}
	}
	
	/**
	 * Ordenacion por insercion.
	 *
	 * @param a the a
	 * @param izq the izq
	 * @param der the der
	 */
	private static void ordenacionPorInsercion(Comparable[] a, int izq, int der) {
		int j;
		Comparable temp;
		for(int p = izq+1; p<= der; p++) {
			temp = a[p];
			for(j=p; j>izq && (temp.compareTo(a[j-1])<0); j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}
	
	/**
	 * Merge sort.
	 *
	 * @param a the a
	 */
	public static void mergeSort(Comparable[] a) {
		
		Comparable[] vectorTemp = new Comparable[a.length];
		mergeSort(a, vectorTemp, 0, a.length-1);
	}
	
	/**
	 * Merge sort.
	 *
	 * @param a the a
	 * @param vectorTemp the vector temp
	 * @param izq the izq
	 * @param der the der
	 */
	private static void mergeSort(Comparable[] a, Comparable[] vectorTemp, int izq, int der) {
		if(izq < der) {
			int centro = (izq+der)/2;
			
			mergeSort(a, vectorTemp, izq, centro);
			mergeSort(a, vectorTemp, centro+1, der);
			mezclar(a, vectorTemp, izq, centro+1, der);
		}
	}
	
	/**
	 * Mezclar.
	 *
	 * @param a the a
	 * @param vectorAux the vector aux
	 * @param posIzq the pos izq
	 * @param posDer the pos der
	 * @param posFin the pos fin
	 */
	private static void mezclar(Comparable[] a, Comparable[] vectorAux, int posIzq, int posDer, int posFin) {
		int finIzq = posDer -1;
		int posAux = posIzq;
		int numElementos = posFin - posIzq + 1;
		
		while((posIzq <= finIzq) && (posDer <= posFin)) {
			if(a[posIzq].compareTo(a[posDer])<=0)
				vectorAux[posAux++] = a[posIzq++];
			else
				vectorAux[posAux++] = a[posDer++];
		}
		while (posIzq <= finIzq)
			vectorAux[posAux++] = a[posIzq++];
		while(posDer <= posFin)
			vectorAux[posAux++] = a[posDer++];
		for(int i=0; i<numElementos; i++, posFin--)
			a[posFin] = vectorAux[posFin];
	}
	
	/**
	 * Sort.
	 *
	 * @param a the a
	 */
	public static void sort(Comparable[] a) {
		Arrays.sort(a);
	}
	

}
