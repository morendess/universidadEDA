package org.mp.sesion06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * The Class ConjuntoDatos.
 */
public class ConjuntoDatos {
	
	/** The archivo texto. */
	private File archivoTexto;
	
	/** The separador. */
	private String separador;
	
	/** The locale. */
	private Locale locale;
	
	/** The cabecera. */
	private List<String> cabecera;
	
	/** The numero lineas. */
	private int numeroLineas;
	
	/** The numero columnas. */
	private int numeroColumnas;
	
	/** The datos. */
	private double [][] datos;
	
	/**
	 * Instantiates a new conjunto datos.
	 *
	 * @param archivoTexto the archivo texto
	 * @param separador the separador
	 * @param locale the locale
	 */
	public ConjuntoDatos(File archivoTexto, String separador, Locale locale) {
		this.archivoTexto = archivoTexto;
		this.separador = separador;
		this.locale = locale;
		this.cabecera = cabecera(archivoTexto);
		this.numeroLineas = numLineas(archivoTexto);
		this.numeroColumnas = numColumnas(archivoTexto);
		this.datos = leerDatos(archivoTexto, numeroLineas, numeroColumnas);
		
	}

	/**
	 * Cabecera.
	 *
	 * @param archivoTexto the archivo texto
	 * @return the list
	 */
	private List<String> cabecera(File archivoTexto) {
		
		List<String> lista = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(archivoTexto);
			String s = sc.nextLine();
			String[] tokens = s.split(separador);
			for(int i=0; i<tokens.length;i++) {
				lista.add(tokens[i]);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return lista;
	}

	/**
	 * Num lineas.
	 *
	 * @param archivoTexto the archivo texto
	 * @return the int
	 */
	private int numLineas(File archivoTexto) {
		
		int contador = 0;
		try {
			Scanner sc = new Scanner(archivoTexto);
			sc.nextLine();
			while(sc.hasNext()) {
				contador++;
				sc.nextLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return contador;
	}

	/**
	 * Num columnas.
	 *
	 * @param archivoTexto the archivo texto
	 * @return the int
	 */
	private int numColumnas(File archivoTexto) {
		
		return cabecera(archivoTexto).size();
	}

	/**
	 * Leer datos.
	 *
	 * @param archivoTexto the archivo texto
	 * @param filas the filas
	 * @param columnas the columnas
	 * @return the double[][]
	 */
	private double[][] leerDatos(File archivoTexto, int filas, int columnas) {
		
		double [][] datos = new double[filas][columnas];
		
		try {
			Scanner sc = new Scanner(archivoTexto);
			sc.nextLine();
			for(int i=0; i<filas; i++) {
				String s = sc.nextLine();
				String [] tokens = s.split(separador);
				for(int j=0; j<columnas; j++) {
					datos[i][j] = Double.parseDouble(tokens[j]);
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return datos;
	}
	
	/**
	 * Gets the archivo texto.
	 *
	 * @return the archivo texto
	 */
	public File getArchivoTexto() {
		return this.archivoTexto;
	}
	
	/**
	 * Gets the numero columnas.
	 *
	 * @return the numero columnas
	 */
	public int getNumeroColumnas() {
		return this.numeroColumnas;
	}
	
	/**
	 * Gets the numero lineas.
	 *
	 * @return the numero lineas
	 */
	public int getNumeroLineas() {
		return this.numeroLineas;
	}
	
	/**
	 * Gets the separador.
	 *
	 * @return the separador
	 */
	public String getSeparador() {
		return this.separador;
	}
	
	/**
	 * Gets the locale.
	 *
	 * @return the locale
	 */
	public Locale getLocale() {
		return this.locale;
	}
	
	/**
	 * Gets the cabecera.
	 *
	 * @return the cabecera
	 */
	public List<String> getCabecera(){
		return this.cabecera;
	}
	
	/**
	 * Gets the datos.
	 *
	 * @return the datos
	 */
	public double[][] getDatos(){
		return this.datos;
	}
	
	/**
	 * Gets the columna.
	 *
	 * @param columna the columna
	 * @return the columna
	 */
	public double[] getColumna(int columna) {
		if(columna<0 || columna >= numeroColumnas) {
			throw new RuntimeException("Columna fuera de rango");
		}
		double[] datosColumna = new double[numeroLineas];
		for (int i=0; i<datosColumna.length; i++) {
			datosColumna[i] = this.datos[i][columna];
		}
		return datosColumna;
	}
	
	/**
	 * Gets the columna.
	 *
	 * @param columna the columna
	 * @return the columna
	 */
	public double[] getColumna(String columna) {
		return getColumna(cabecera.indexOf(columna));
	}
	
	/**
	 * Exportar.
	 *
	 * @param cabeceraAB the cabecera AB
	 * @param archivoTexto the archivo texto
	 * @param separador the separador
	 * @throws FileNotFoundException the file not found exception
	 */
	public void exportar(String[] cabeceraAB, String archivoTexto, String separador) throws FileNotFoundException {
	
		PrintWriter pw = new PrintWriter(new File(archivoTexto));
		for(int i=0; i<cabeceraAB.length; i++) {
			pw.print(cabeceraAB[i]);
			if(i<cabeceraAB.length-1) {
				pw.print(separador);
			}
		}
		pw.println();
		for(int i=0; i<datos.length; i++) {
			for(int j=0; j<cabeceraAB.length; j++) {
				int k = this.cabecera.indexOf(cabeceraAB[j]);
				pw.print(datos[i][k]);
				if(j<cabeceraAB.length-1) {
					pw.print(separador);
				}
			}
			pw.println();
		}
		pw.close();
	}
	
	/**
	 * Conjunto datos.
	 *
	 * @param cabeceraC the cabecera C
	 * @param archivoTexto the archivo texto
	 * @param separador the separador
	 * @param locale the locale
	 * @return the conjunto datos
	 * @throws FileNotFoundException the file not found exception
	 */
	public ConjuntoDatos conjuntoDatos(String[] cabeceraC, String archivoTexto, String separador, Locale locale) throws FileNotFoundException {
		exportar(cabeceraC, archivoTexto, separador);
		return new ConjuntoDatos(new File(archivoTexto), separador, locale);
	}
}
