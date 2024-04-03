package arg.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numeros;
	
	public Counter() {
		setNumeros(new ArrayList<Integer>());
	}
	
	//arreglar esto
	public void addNumber(List<Integer> numeros, int numeroAAgregar) {
		numeros.add(numeroAAgregar);
	}
	
	public void addNumbers (List<Integer> numeros, List<Integer> numerosAAgregar) {
		for (int entero:numerosAAgregar) {
			numeros.add(entero);
		}
	}
	
	
	public int countEvenNumbers (List<Integer> numeros) {
		int evenNumbers = 0;
		for (int entero:numeros) {
			if(esPar(entero)) {
				evenNumbers =+ 1;
			}
		}
		return evenNumbers;
	}
	//preguntar si esta bien, pq es privado??
	private boolean esPar(int entero) {
		return entero % 2 == 0;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
}

