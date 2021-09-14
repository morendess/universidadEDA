package org.mp.sesion06;

import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * The Class Estadistica.
 *
 */
public class Estadistica {
	
	/** The cd. */
	private ConjuntoDatos cd;
	
	/** The ds. */
	private DescriptiveStatistics ds;
	
	/**
	 * Instantiates a new estadistica.
	 *
	 * @param cd the cd
	 */
	public Estadistica(ConjuntoDatos cd) {
		super();
		this.cd = cd;
	}
	
	/**
	 * Media.
	 *
	 * @param columna the columna
	 * @return the double
	 * @throws Exception the exception
	 */
	public double media (String columna) throws Exception{
		double[] array = cd.getColumna(columna);
		DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(array);
		ds = descriptiveStatistics;
		return ds.getMean();
		
		/*double suma = 0;
		for(int i=0; i<array.length; i++) {
			suma += array[i];
		}
		
		double media = suma/array.length;
		return media;*/
		
	}
	
	/**
	 * Maximo
	 *
	 * @param columna the columna
	 * @return the double
	 * @throws Exception the exception
	 */
	public double max(String columna) throws Exception{
		/*double[] array = cd.getColumna(columna);
		 * Arrays.sort(array)
		 * return array[0]
		 */
		double[] array = cd.getColumna(columna);
		ds = new DescriptiveStatistics(array);
		double max = ds.getMax();
		return max;
	}
	
	/**
	 * Minimo
	 *
	 * @param columna the columna
	 * @return the double
	 * @throws Exception the exception
	 */
	public double min(String columna) throws Exception{
		/* double[] columna = cd.getColumna(columna);
		 * Arrays.sort(columna);
		 * return columna[columna.length-1];
		 */
		
		double[] array = cd.getColumna(columna);
		ds = new DescriptiveStatistics(array);
		double min = ds.getMin();
		return min;
	}
	
	/**
	 * Suma.
	 *
	 * @param columna the columna
	 * @return the double
	 * @throws Exception the exception
	 */
	public double suma(String columna) throws Exception{
		/*double[] columna = cd.getColumna(columna);
		 * double suma = 0;
		 * for(int i=0; i<columna.length; i++){
		 * suma += columna[i];
		 * return suma;
		 */
		
		double[] array = cd.getColumna(columna);
		ds = new DescriptiveStatistics(array);
		double suma = ds.getSum();
		return suma;
	}
	
	

}
