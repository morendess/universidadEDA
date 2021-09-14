package org.mp.sesion07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The Class Imagen.
 *
 */
public class Imagen {

	/** The formato imagen. */
	private String formatoImagen;
	
	/** The tipo imagen. */
	private String tipoImagen;
	
	/** The bandas. */
	private ArrayList<Banda<?>> bandas;
	
	/** The lineas. */
	private int lineas;
	
	/** The columnas. */
	private int columnas;
	
	/**
	 * Instantiates a new imagen.
	 *
	 * @param lineas the lineas
	 * @param columnas the columnas
	 * @param formatoImagen the formato imagen
	 * @param tipoImagen the tipo imagen
	 */
	public Imagen(int lineas, int columnas, String formatoImagen, String tipoImagen) {
		this.formatoImagen = formatoImagen;
		this.lineas = lineas;
		this.columnas = columnas;
		this.tipoImagen = tipoImagen;
		bandas = new ArrayList<Banda<?>>();
	}
	
	/**
	 * Gets the datos pixel.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the datos pixel
	 * @throws XYFueraImagenException the XY fuera imagen exception
	 */
	public Number[] getDatosPixel(int x, int y) throws XYFueraImagenException{
		Number[] pixel = new Number[bandas.size()];
		for(int i=0; i<pixel.length; i++) {
			pixel[i] = bandas.get(i).getDatoXY(x, y);
		}
		return pixel;
	}
	
	/**
	 * Extraer imagen.
	 *
	 * @param x1 the x 1
	 * @param y1 the y 1
	 * @param x2 the x 2
	 * @param y2 the y 2
	 * @return the imagen
	 * @throws XYFueraImagenException the XY fuera imagen exception
	 */
	public Imagen extraerImagen(int x1, int y1, int x2, int y2) throws XYFueraImagenException{
		
		if(!XYValida(x1,y1,x2,y2)) {
			throw new XYFueraImagenException("Coordenadas fuera de la imagen");
		}
			
		int lineas = y2-y1+1;
		int columnas = x2-x1+1;
		
		Imagen aux = new Imagen(lineas, columnas, this.formatoImagen, tipoImagen);
		
		for(int k=0; k<bandas.size(); k++) {
			Banda b = bandas.get(k);
			String nombreBanda = b.getNombreBanda();
			Number[][] data = new Number [lineas][columnas];
			
			for(int i=y1, m=0; i<=y2; i++, m++) {
				for(int j=x1, n=0; j<=x2; j++, n++) {
					data[m][n] = b.getDatoXY(j,i);
				}
			}
			
			Banda nueva = new Banda(nombreBanda, data);
			aux.anadirBanda(nueva);
		}
		return aux;
	
	}
	
	
	/**
	 * Anadir banda.
	 *
	 * @param banda the banda
	 */
	public void anadirBanda(Banda<?> banda) {
		this.bandas.add(banda);
	}
	
	/**
	 * Eliminar banda.
	 *
	 * @param i the i
	 */
	public void eliminarBanda(int i) {
		this.bandas.remove(i);
	}
	
	/**
	 * Gets the banda.
	 *
	 * @param i the i
	 * @return the banda
	 */
	public Banda getBanda(int i) {
		return this.bandas.get(i);
	}
	
	/**
	 * Gets the bandas.
	 *
	 * @return the bandas
	 */
	public ArrayList<Banda<?>> getBandas(){
		return this.bandas;
	}
	
	/**
	 * Gets the numero bandas.
	 *
	 * @return the numero bandas
	 */
	public int getNumeroBandas(){
		return this.bandas.size();
	}
	
	/**
	 * Gets the lineas.
	 *
	 * @return the lineas
	 */
	public int getLineas() {
		return this.lineas;
	}
	
	/**
	 * Gets the columnas.
	 *
	 * @return the columnas
	 */
	public int getColumnas() {
		return this.columnas;
	}
	
	/**
	 * Gets the tipo imagen.
	 *
	 * @return the tipo imagen
	 */
	public String getTipoImagen() {
		return this.tipoImagen;
	}
	
	/**
	 * Sets the tipo imagen.
	 *
	 * @param tipoimagen the new tipo imagen
	 */
	public void setTipoImagen(String tipoimagen) {
		this.tipoImagen = tipoImagen;
	}
	
	/**
	 * Gets the formato imagen.
	 *
	 * @return the formato imagen
	 */
	public String getFormatoImagen() {
		return this.formatoImagen;
	}
	
	/**
	 * Sets the formato imagen.
	 *
	 * @param formato the new formato imagen
	 */
	public void setFormatoImagen(String formato) {
		this.formatoImagen = formato;
	}
	
	/**
	 * Sets the bandas.
	 *
	 * @param bandas the new bandas
	 */
	public void setBandas(ArrayList<Banda<?>> bandas) {
		this.bandas = new ArrayList<Banda<?>>(bandas);
	}
	
	/**
	 * XY valida.
	 *
	 * @param x1 the x 1
	 * @param y1 the y 1
	 * @param x2 the x 2
	 * @param y2 the y 2
	 * @return true, if successful
	 */
	private boolean XYValida(int x1, int y1, int x2, int y2) {
		if(x1<0 || x1>=columnas || y1<0 || y1>=lineas || x2<0 || x2>=columnas || y2>=lineas) {
			return false;
		}
		return true;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(formatoImagen+":\n");
		for(int i=0; i<bandas.size(); i++) {
			s.append(bandas.toString());
		}
		
		return s.toString();
	}
}
