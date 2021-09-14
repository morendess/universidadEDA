package org.mp.sesion04;

import java.util.Iterator;
import org.mp.sesion02.ExcepcionArrayVacio;
import org.mp.sesion03.LinkedList;
import java.util.NoSuchElementException;

public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E> {

	/** Metodo constructor por defecto */
	public SortedLinkedList() {
		super();
	}

	/**
	 * Metodo que inicializa las propiedades a los argumentos
	 * @param object
	 */
	public SortedLinkedList(E[] object) {
		super();
		for (int i = 0; i < object.length; i++) {
			addSorted(object[i]);
		}
	}

	public void addSorted(E e) {
		if (isEmpty() || e.compareTo(getFirst()) < 0) {
			super.addFirst(e);

		} else if (e.compareTo(getLast()) > 0) {
			super.addLast(e);

		} else {
			Iterator<E> it = iterator();
			int index = 0;

			while (e.compareTo(it.next()) > 0) {
				index++;
			}
			add(index, e);
		}
	}

	
	public void add(E e) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public void addLast(E e) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public E set(int index, E e) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public void addFirst(E e) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public String toString() {
		return "Lista ordenada: " + super.toString();
	}

}