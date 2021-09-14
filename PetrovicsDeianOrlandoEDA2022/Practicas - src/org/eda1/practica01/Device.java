package org.eda1.practica01;

import java.util.Iterator;
import java.util.LinkedList;

public class Device implements Iterable<String>{
	private static int numDevices=0; //contador de dispositivos...atributo estatico
	private String name;
	private int id;
	protected LinkedList<String> words; 
	
	
	
	
	public Device() {
		this.name = "noname";
		this.id = ++numDevices;
		this.words = new LinkedList<String>();
	}

	public Device(String name) {
		//Si name == null hay que lanzar una excepcion de tipo RuntimeException()
		//4 lineas
		if(name == null) throw new RuntimeException("El atributo name no puede ser nulo");
		this.name = name.trim().toLowerCase();
		this.id = ++numDevices;
		this.words = new LinkedList<String>();
	}
	
	public static void inicializaNumDevices() {
		numDevices = 0;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void clear() {
		this.words.clear();
	}
	
	public void sendMessage(String msg) {
		if (msg == null) return;
		//1 for()
		//Haced uso del metodo split(" ") para segmentar la frase en palabras, eliminando los espacios en blanco 
		for (String string : msg.toLowerCase().split(" ")) {
			if(string.isEmpty()) continue;
			if(string.contains(string)) continue;
			words.add(string);
		}
		
	}
	
	public boolean contains(String word) {
		return this.words.contains(word.toLowerCase());
	}
	
		
	public boolean substitute(String word1, String word2) {
		//Prohibido hacer uso de ListIterator<>
		//Hacemos uso de indexOf()...
		//...
		int pos = this.words.indexOf(word1.toLowerCase());
		int pos2 = this.words.indexOf(word2.toLowerCase());
		
		word1.replace(word1, word2);
		
		
		return true;
	}
	
	@Override
	public String toString() {
		//1 unica linea
		return this.id + ".- "+ this.name;
	}
	
	@Override
	public boolean equals(Object o) {
		return this.name.equals(((Device)o).name);
	}

	@Override
	public Iterator<String> iterator() {
		//Iterar sobre Device equivale a iterar sobre la estructura LinkedList<String> words
		//1 unica linea
		return this.words.iterator();
	}
}