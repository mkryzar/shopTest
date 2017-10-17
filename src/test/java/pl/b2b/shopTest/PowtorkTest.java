package pl.b2b.shopTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PowtorkTest {

	private List<Integer> lista = new ArrayList<Integer>();
	private Utils utils;

	@Before
	public void init() {
		lista = new ArrayList<Integer>();
		lista.add(3);
		lista.add(32);
		lista.add(34);
		lista.add(36);
		utils = new Utils(lista);
	}
	

	@Test
	public void sprawdzCzyIloscElementowParzystychJestWiekszaOd2() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczIloscElementowParzystych();
		boolean actual = licznik > 2;
				
				assertEquals(true, actual);

	}
	
	@Test
	public void sprawdzCzyIloscElementowKtorychSumaJestWiekszaoOd4JestWiekszaOd2() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczIloscElementowWiekszychOd4();
		boolean actual = licznik > 2;
		
		assertEquals(true, actual);
		
		
	}

}
