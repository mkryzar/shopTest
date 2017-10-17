package pl.b2b.shopTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PowtorkaZRefactorem {

	private List<Integer> lista = new ArrayList();

	@Before
	public void inicjalizacjaListy() {
		lista = new ArrayList<Integer>();
		lista.add(23);
		lista.add(30);
		lista.add(66);
		lista.add(56);

	}

	@Test
	public void iloscElementowParzystychWZadanejLiscie() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczIloscElementowParzystych();

		assertEquals(3, licznik);
	}

	@Test
	public void iloscElementowWZadanejLiscieKtorychSumaCyfrJestWiekszaOd4() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczIloscElementowWiekszychOd4();

		assertEquals(3, licznik);

	}

}