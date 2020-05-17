package edu.elsmancs.domain.kata_RickBuisness;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Clase Test de CreditCard
 * @author sebas
 *
 */
public class CreditCardTest {
	
	/**
	 * Comprueba que se crea la tarjeta de crédito correctamente
	 */
	@Test
	public void crearCreditCardTest() {
		 CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
		 assertEquals(abradolph.getNombre(), "Abradolph Lincler" );
		 assertEquals(abradolph.number(), "4916119711304546");
		 assertEquals(abradolph.credit(), 3000d, 0);		 
	}
	
	/**
	 * Comprueba que el método pay() proceda adecuadamente.
	 */
	@Test
	public void payTest() {
		CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
		abradolph.pay(500d);
		assertEquals(abradolph.credit(), 2500d, 0);
	}

}
