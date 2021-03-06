package org.mp.sesion03;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> extends AbstractList<E> {

	private static final int CAPACIDAD_INICIAL = 16;
	private E[] data = (E[]) new Object[CAPACIDAD_INICIAL];

	/** Crea una lista por defecto */

	public ArrayList() {
	}

	/**
	 * Crea una lista a partir de un array de objetos
	 * 
	 * @param objects Objetos
	 */
	public ArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]); // Advertencia: no usar super(objects)
	}

	@Override
	/** Anade un nuevo elemento en la posicion index */

	public void add(int index, E e) {
		ensureCapacity();

		if (index < 0) {
			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);
		}

// Mueve los elementos a la derecha desde la posicion especificada por index

		for (int i = size - 1; i >= index; i--)
			data[i + 1] = data[i];

// Inserta un nuevo elemento en data[index] 

		data[index] = e;

// Incrementa el tamaño en 1

		size++;
	}

	/** Crea un nuevo array con el doble tamano mas 1 */

	private void ensureCapacity() {
		if (size == data.length) {
			E[] nuevo = (E[]) new Object[size * 2 + 1];
			System.arraycopy(data, 0, nuevo, 0, size);
			data = nuevo;
		}

	}

	@Override
	/** Elimina todos los elementos de la lista */

	public void clear() {
		data = (E[]) new Object[CAPACIDAD_INICIAL];

		size = 0;

	}

	@Override
	/**
	 * Devuelve true si la lista contiene el elemento
	 * 
	 * @param e Elemento externo
	 */

	public boolean contains(E e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	/**
	 * Devuelve el elemento en la posicion index especificada
	 * 
	 * @param index
	 * @return index Devuelve el elemento en la posicion index especificada
	 */

	public E get(int index) {
		checkIndex(index);
		return data[index];
	}

	/**
	 * Comprueba posicion
	 * 
	 * @param index Posicion
	 */

	private void checkIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);
	}

	@Override /**
				 * Devuelve el índice de la primera ocurrencia del elemento en la lista Devuelve
				 * -1 si no esta
				 * 
				 * @param e Elemento externo
				 * @return Devuelve el índice de la primera ocurrencia del elemento en la lista
				 */

	public int indexOf(E e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override /**
				 * Devuelve el índice de la ultima ocurrencia del elemento e en la lista.
				 * Devuelve -1 si no esta
				 * 
				 * @param e Elemento externo e
				 * @return Devuelve el indice de la ultima ocurrencia del elemento e en la lista
				 */

	public int lastIndexOf(E e) {
		for (int i = size - 1; i >= 0; i++) {
			if (e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override /**
				 * Elimina el elemento en la posicion especificada ◦ en la lista. Desplaza la
				 * sub secuencia de elementos a la izquierda. Devuelve el elemento eliminado.
				 * 
				 * @param index Posicion
				 * @return element Devuelve el elemento eliminado
				 */

	public E remove(int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);

		}
		if (data[index] == null) {

			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);

		}

		E element = data[index];

		for (int i = index; i < data.length - 1; i++) {
			data[i] = data[i + 1];
		}
		size--;
		return element;

	}

	@Override /**
				 * Sustituye el elemento de la posicion especificada en la lista por el elemento
				 * especificado
				 * 
				 * @param index Posicion
				 * @param e     Element externo
				 * @return antiguo devuelve el elemento anterior
				 */

	public E set(int index, E e) {
		checkIndex(index);
		E antiguo = data[index];
		data[index] = e;
		return antiguo;

	}

	@Override

	/**
	 * Muestra de forma de cadena de texto
	 * 
	 * @return resultado.toString() Devuelve la cadena de texto
	 */

	public String toString() {
		StringBuilder resultado = new StringBuilder("[");

		for (int i = 0; i < size; i++) {
			resultado.append(data[i]);
			if (i < size - 1)
				resultado.append(", ");
		}

		return resultado.toString() + "]";
	}

	/** Ajusta la capacidad del array al tamano de la lista */

	public void trimToSize() {

		if (size != data.length) {
			E[] nuevo = (E[]) new Object[size];

			System.arraycopy(data, 0, nuevo, 0, size);

			data = nuevo;
		} else {

			throw new RuntimeException("Guapit@ no necesitas hacer un trim, el tamaño coincide con la capacidad");

		}

	}

	@Override

	/**
	 * Sobreescribe el metodo iterator() definido en Iterable ◦ @return
	 * data[current++] Devuelve los elementos siguientes y si no hay, sale un
	 * mensaje de error
	 */

	public Iterator<E> iterator() {
		return new ArrayListIterator();
// Devuelve una instancia de ArrayListIterator

	}

	private class ArrayListIterator implements Iterator<E> {

		private int current = 0;

		@Override
		public boolean hasNext() {
			return current < size;
		}

		@Override
		public E next() {
			if (current == size) {
				throw new NoSuchElementException("No hay más elementos en la lista");
			}
			return data[current++];
		}

		@Override
		public void remove() {
			ArrayList.this.remove(current);
		}

	}
}
