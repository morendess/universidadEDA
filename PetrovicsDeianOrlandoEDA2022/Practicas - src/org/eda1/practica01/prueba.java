package org.eda1.practica01;

import static org.junit.Assert.assertTrue;

public class prueba {

	public static void main(String[] args) {
		
		User u1 = new User("bob");
		User u2 = new User("alice");
		Device d1 = new Device("iPhone 11");
		Device d2 = new Device("Motorola MG8");
		Device d3 = new Device("iPhone 11");
		
		u1.addDevices(d1, d1, d2, d3, d3); //5 dispositivos
		
		assertTrue(u1.getNumDevices() == 2); //Â¿?
	
		for (int i=0; i<1000; i++) {
			u2.addDevices(new Device());
		}

		String prueba1 = "1.- iphone 11: este es un mensaje de \n" +
				 "2.- motorola mg8: este es un segundo mensaje \n";
		
		u1.sendMessage(d1, "este es un comentario de tranquilidad");
		u1.sendMessage(d2, "este es un segundo comentario");
		u1.sendMessage(new Device(), "este es un segundo comentario");
		
		u1.substitute("comentario", "mensaje");
		u1.substitute("tranquilidad", null);
		
		String prueba2 = "1.- iphone 11: este es un mensaje de \n2.- motorola mg8: este es un segundo mensaje \n";
		
		System.out.println(prueba1);
		System.out.println();
		System.out.println(u1.getWords());
		System.out.println(prueba2);
		
		
	}

}
