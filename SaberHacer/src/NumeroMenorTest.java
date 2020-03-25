import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumeroMenorTest {
	
	NumeroMenor valor;

	@Before
	public void before() {
		System.out.println("before()");
		valor = new NumeroMenor();
	}

	@After
	public void after() {
		System.out.println("after()");
		valor.cls();
	}
		
	@Test
	public void numeroMenor() {
		System.out.println("Numero menor");
		NumeroMenor valor = new NumeroMenor();
		int numeros = valor.numerosMenores(4, 2, 3);
		int numesp = 2;
		assertEquals(numesp, numeros);		
	}

}
