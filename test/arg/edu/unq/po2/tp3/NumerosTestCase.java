package arg.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;



import org.junit.jupiter.api.Test;

class NumerosTestCase {
	private Numeros numero;
	
	@BeforeEach
	public void setUp() throws Exception { 
		numero = new Numeros();
		
	}
	@Test
	void test() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(668);
		numeros.add(1);
		numeros.add(23);
		numeros.add(44);
		int numeroPares = numero.numConMasDigitosParesDe(numeros);
		assertEquals(numeroPares, 668);
	}
}
