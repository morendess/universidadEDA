package org.mp.sesion04;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Evaluador {

	private GenericStack<Integer> pila;

	public Evaluador() {
		pila = new GenericStack<Integer>();
	}

	/**
	 * Metodo que elimina los espacios de una cadena
	 */
	public String[] eliminarBlancos(String expresion) {

		/* Se define una estructura que almacene un numero indeterminado de elementos */

		ArrayList<String> lista = new ArrayList<String>();
		// para separar la expresion en trozos, puede que esos trozos esten separados
		//por espacios, por +, por -, por *, por /
		//para ello utilizo un StringTokenizer, que permite dividir una cadena en
		//trozos o tokens, separados por uno o varios caracteres que tambien se
		//pueden utilizar como tokens
		StringTokenizer st = new StringTokenizer(expresion, " +-*/", true);
		while (st.hasMoreTokens()) {
			String trozo = st.nextToken();
			if (!trozo.equals(" "))
				lista.add(trozo);
		}

		//al final, cojo los trozos de esa lista y los guardo en un array
		//para devolverlos
		String[] array = new String[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i);
		}
		return array;

	}

	/**
	 * • Metodo que realiza una operación segun el parametro op • @param op • @param
	 * operandosPila
	 */
	public void procesarUnOperador(char op, GenericStack<Integer> operandosPila) {
		Integer num2 = operandosPila.pop();
		Integer num1 = operandosPila.pop();
		Integer num3 = 0;
		switch (op) {
		case '+':
			num3 = num1 + num2;
			break;
		case '-':
			num3 = num1 - num2;
			break;
		case '*':
			num3 = num1 * num2;
			break;
		case '/':
			if (num2 == 0)
				throw new RuntimeException("No es posible una división por cero");

			num3 = num1 / num2;
			break;
		}

		operandosPila.push(num3);

	}

	/**
	 * • Opera con la expresion polaca • @param expresion • @return resultado
	 */
	public int evaluarExpresion(String expresion) {
		String[] miExpresion = eliminarBlancos(expresion);
		for (int i = 0; i < miExpresion.length; i++) {
			if (soloDigitos(miExpresion[i])) {
				int n = Integer.parseInt(miExpresion[i]);
				pila.push(n);
			} else {
				if (esOperador(miExpresion[i])) {
					char op = miExpresion[i].charAt(0);
					procesarUnOperador(op, pila);
				}
			}
		}
		//lo que queda en la pila es el resultado
		//pero cuidado
		//si quedan 3 elementos, los concateno, y devuelvo el entero correspondiente 
		String resultado = "";
		while (!pila.isEmpty()) {
			int n = pila.pop();
			resultado = n + resultado;
		}
		return Integer.parseInt(resultado);

	}

	/**
	 * Metodo que comprueba si la expresion solo tiene numeros
	 *  Devuelve true si la expresion solo tiene numeros
	 *  @param expresion 
	 *  @return true
	 */
	private boolean soloDigitos(String expresion) {
		for (int i = 0; i < expresion.length(); i++) {
			char c = expresion.charAt(i);
			if (c < '0' || c > '9')
				return false;
		}
		return true;
	}

	/**
	 * Metodo que comprueba si la expresion tiene operadores
	 * Devuelve true si la expresion tiene operadores 
	 * @param token 
	 * @return true
	 */
	private boolean esOperador(String token) {
		if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
			return true;
		else
			return false;
	}
}
