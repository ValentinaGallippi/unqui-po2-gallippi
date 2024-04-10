package arg.edu.unq.po2.tp3;

import java.util.List;

public class Numeros {
	
	public int numConMasDigitosParesDe(List<Integer>  numeros) {
		int numConMaximosDigPares = numeros.get(0);
			for (int entero:numeros) {
				if (cantidadDeDigitosPares(entero) > cantidadDeDigitosPares(numConMaximosDigPares) ) {
					numConMaximosDigPares = entero; 
				}
			}
			return numConMaximosDigPares;
	}
	
	private int cantidadDeDigitosPares(int num) {
		int count = 0; // Inicializamos el contador de dígitos pares a 0
	    while (num != 0) { // Mientras el número no sea 0
	        int digit = num % 10; // Tomamos el último dígito del número usando el operador módulo (%), que obtiene el residuo de la división de num por 10.
	        if (digit % 2 == 0) { // Comprobamos si el dígito es par
	            count++; // Si es par, incrementamos el contador de dígitos pares
	        }
	        num /= 10; // Dividimos el número por 10 para eliminar el último dígito y continuar con el siguiente dígito
	    }
	    return count; // Devolvemos el conteo de dígitos pares en el número
	}
		
}

