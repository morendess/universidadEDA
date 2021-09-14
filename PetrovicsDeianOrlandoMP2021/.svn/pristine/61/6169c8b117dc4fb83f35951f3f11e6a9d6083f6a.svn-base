package org.mp.sesion02;

public abstract class MatrizGenerica<E extends Number> {

	protected abstract E sumar(E o1, E o2);

	protected abstract E multiplicar(E o1, E o2);

	protected abstract E cero();

	/**
	 *  Suma matrices 
	 *  @param matriz1 
	 *  @param matriz2 
	 *  @return matriz
	 */

	public E[][] sumarMatrices(E[][] matriz1, E[][] matriz2) {
		if (matriz1[0].length != matriz2[0].length || matriz1.length != matriz2.length) {
			throw new RuntimeException("Las matrices no tienen el mismo tamaño");

		}

		E[][] matriz = (E[][]) new Number[matriz1.length][matriz1[0].length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = sumar(matriz1[i][j], matriz2[i][j]);
			}
		}
		return matriz;

	}

	/**
	 *  Multiplica matrices 
	 *  @param matriz1
	 *  @param matriz2 
	 *  @return matriz
	 */

	public E[][] multiplicarMatrices(E[][] matriz1, E[][] matriz2) {
		if (matriz1[0].length != matriz2.length) {
			throw new RuntimeException("No coinciden las columnas de la primera matriz con las filas de la segunda");
		} else {
			E[][] multiplicacion = (E[][]) new java.lang.Number[matriz1.length][matriz1[0].length];
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[0].length; j++) {
					multiplicacion[i][j] = cero();
					for (int s = 0; s < multiplicacion.length; s++) {
						multiplicacion[i][j] = sumar(multiplicacion[i][j], multiplicar(matriz1[i][s], matriz2[s][j]));
					}
				}
			}

			return multiplicacion;
		}

	}

}