package org.mp.sesion03;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> extends AbstractList<E> {

//Propiedades

	private Node<E> head;
	private Node<E> tail;

	/** Crea una lista enlazada por defecto */
	public LinkedList() {
	}

	/**
	 * Crea una lista enlazada a partir de un array de objetos
	 * 
	 * @param objects Array de Objetos
	 */
	public LinkedList(E[] objects) {
		super(objects);

	}

	/**
	 * Devuelve el primer elemento de la lista
	 * 
	 * @return head.element O devuelve nulo o el primer elemento de la lista
	 */
	public E getFirst() {
		if (head == null) {
			return null;
		}

		return head.element;

	}

	/**
	 * Devuelve el ultimo elemento de la lista
	 * 
	 * @return tail.element O devuelve nulo o el ultimo elemento de la lista
	 */
	public E getLast() {
		if (tail == null) {
			return null;
		}
		return tail.element;
	}

	/**
	 * Anade un elemento a la cabeza de la lista
	 * 
	 * @param e Elemento externo
	 */
	public void addFirst(E e) {
		Node<E> nuevoNodo = new Node<E>(e); // Crea un nodo
		nuevoNodo.next = head; // enlaza el nuevoNodo con la cabeza
		head = nuevoNodo; // la cabeza apunta a nuevoNodo
		size++; // Incrementa el tamaño de la lista

		if (tail == null) // si la lista esta vacia
			tail = head; // el nuevo nodo es el unico en la lista
	}

	/**
	 * Implementa un elemento al final de la lista
	 * 
	 * @param e Elemento externo
	 */
	public void addLast(E e) {
		Node<E> nuevoNodo = new Node<E>(e); // Crea un nodo para e e

		if (tail == null) {
			head = tail = nuevoNodo; // El nodo nuevo es el unico de la lista
		} else {
			tail.next = nuevoNodo; // enlaza el nuevo nodo con el ultimo nodo
			tail = tail.next; // la cola apunta ahora al ultimo nodo
		}

		size++; // Incrementa el tamano

	}

	/**
	 * Implementa el elemento e en la posicion index La posicion del elemento head
	 * es 0
	 * 
	 * @param index Posicion
	 * @param e     Elemento externo
	 */
	public void add(int index, E e) {
		if (index <= 0) { // Inserta al principio
			addFirst(e);
		} else if (index >= size) { // Inserta al final
			addLast(e);
		} else { // Inserta en medio
			Node<E> current = head;
			for (int i = 1; i < index; i++) {
				current = current.next; // Situo current
			}
			Node<E> temp = current.next; // Situo temp
			current.next = new Node<E>(e); // Inserto el nuevo nodo
			(current.next).next = temp;
			size++; // Incrementa el tamano

		}

	}

	/**
	 * Elimina el primer elemento de la lista y devuelve el elemento eliminado
	 * 
	 * @return temp.element Devuelve el elemento borrado
	 */
	public E removeFirst() {
		if (size == 0) { // Nada que borrar
			return null;
		} else {
			Node<E> temp = head; // Conserva el primer nodo temporalmente
			head = head.next; // Mueve head para apuntar al siguiente nodo
			size--; // Disminuye el tamano
			if (head == null) {
				tail = null; // La lista se pone vacia
			}
			return temp.element; // Devuelve el elemento borrado
		}
	}

	/**
	 * Elimina el ultimo elemento de la lista y devuelve el elemento eliminado.
	 * 
	 * @return temp.element Devuelve el ultimo elemento eliminado
	 */

	public E removeLast() {
		if (size == 0) { // Nada que eliminar
			return null;
		} else if (size == 1) { // Solo un elemento en la lista
			Node<E> temp = head;
			head = tail = null; // La lista la hacemos vacía
			size = 0;
			return temp.element;
		} else {
			Node<E> current = head;

			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}

			Node<E> temp = tail;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;
		}
	}

	/**
	 * Elimina el elemento en la posicion index. Devuelve el elemento que fue
	 * eliminado de la lista
	 * 
	 * @param index Posicion
	 * @return Devuelve el elemento que fue eliminado de la lista
	 */

	public E remove(int index) {
		if (index < 0 || index >= size) { // Fuera de rango

			return null;
		} else if (index == 0) { // Elimina el primero
			return removeFirst();
		} else if (index == size - 1) { // Elimina el ultimo
			return removeLast();
		} else {
			Node<E> previous = head;

			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}

			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}

	}

	/**
	 * Sobreescribe toString()
	 * 
	 * @return cadena Devuelve una cadena de texto
	 */

	public String toString() {
		String cadena = "[";

		for (int i = 0; i < size; i++) {
			if (i < size - 1) {
				cadena = cadena + get(i) + ", ";
			} else {

				cadena = cadena + get(i);

			}

		}
		return cadena + "]";

	}

	/** Elimina todos los elementos de la lista */

	public void clear() {
		int tamanio = size;

		for (int i = 0; i < tamanio; i++) {
			remove(0);
		}
		size = 0;
	}

	/**
	 * Devuelve true si la lista contiene el elemento e
	 * 
	 * @param e Parametro Externo
	 * @return True Devuelve true si la lista contiene el elemento e
	 */

	public boolean contains(E e) {
		int tamanio = size;

		for (int i = 0; i < tamanio; i++) {
			if (e.equals(get(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Devuelve el elemento en la posicion index especificada
	 * 
	 * @param index Posicion
	 * @return current.element Devuelve el elemento en la posicion index
	 *         especificada
	 */

	public E get(int index) {

		Node<E> current = head;

		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.element;
	}

	/**
	 * Devuelve el indice de la primera ocurrencia del elemento en la lista Devuelve
	 * -1 si no esta
	 * 
	 * @param e Parametro externo
	 * @return i Devuelve el indice de la primera ocurrencia
	 */
	public int indexOf(E e) {

		for (int i = 0; i < size; i++) {
			if (e.equals(get(i))) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Devuelve el indice de la ultima ocurrencia del elemento en la lista Devuelve
	 * -1 si no esta.
	 * 
	 * @param e Externo
	 * @return posicion Devuelve el indice de la ultima ocurrencia del elemento
	 */

	public int lastIndexOf(E e) {

		int posicion = -1;
		for (int i = 0; i < size; i++) {
			if (e.equals(get(i))) {
				posicion = i;
			}
		}
		return posicion;
	}

	/**
	 * Sustituye el elemento de la posicion especificada en la lista por el elemento
	 * especificado
	 * 
	 * @param index Posicion
	 * @param e     Elemento externo
	 * @return temp Sustituye el elemento de la posicion especificada en la lista
	 *         por el elemento especificado
	 */

	public E set(int index, E e) {

		if (index < 0 || index > size - 1) {
			return null;
		}
		E temp = get(index);

		Node<E> current = head;

		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		current.element = e;

		return temp;

	}

	@Override

	/** Sobreescribe el metodo iterator() definido en Iterable */

	public Iterator<E> iterator() {
		return new LinkedListIterator();

// Devuelve una instancia de LinkedListIterator

	}

	/**
	 * Esta clase implementa la interface Iterator
	 * 
	 * @return temp implementa la interface Iterator
	 */

	private class LinkedListIterator implements Iterator<E> {
		private Node<E> current = head;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public E next() {
			if (current == null) {

				throw new NoSuchElementException("No hay más elementos en la lista");

			}
			E temp = current.element;

			current = current.next;

			return temp;

		}

		@Override
		public void remove() {
			LinkedList.this.remove(0);
		}

	}

// Esta clase solo se usa en LinkedList, por lo que es private
// Esta clase no necesita acceder a ningun miembro de instancia de LinkedList
// por lo que se define estatica.

	/**
	 * Clase Nodo
	 * 
	 * @param <E> Elemento Nodo externo
	 */
	private static class Node<E> {
		E element;
		Node next;

		public Node(E o) {
			element = o;
		}

	}

}