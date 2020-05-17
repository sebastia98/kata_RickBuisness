package edu.elsmancs.domain.kata_RickBuisness;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Clase Test de CrystalExpender.
 * @author sebas
 *
 */
public class CrystalExpenderTest {
	
	CrystalExpender packExpender = null;
	
	/**
	 * Previamente crea un objeto de tipo CrystalExpender que nos ayuda a realizar los tests.
	 */
	@Before
	public void before() {
		packExpender = new CrystalExpender(3, 50);
	}
	
	/**
	 * Comprueba que se crea correctamente el objeto.
	 */
	@Test
	public void crearDispenserTest() {
		assertEquals(packExpender.stock(), 3, 0);
		assertEquals(packExpender.costeUnidad(), 50, 0);
	}
	
	/**
	 * Comprueba que el objeto depacha adecuadamente
	 */
	@Test
	public void dispatchTest() {
		CreditCard squanchy = new CreditCard("Squanchy", "4444444444444444");
		packExpender.dispatch(squanchy);
		assertEquals(packExpender.stock(), 2, 0);
	}
	
	/**
	 * Comprueba el proceso de dispatch en caso de que el personaje no tenga dinero.
	 */
	@Test
	public void dispatchNoCreditTest() {
		CreditCard squanchy = new CreditCard("Squanchy", "4444444444444444");
		squanchy.pay(3000);
		packExpender.dispatch(squanchy);
		assertEquals(packExpender.stock(), 3, 0);
	}
	
	/**
	 * Comprueba el proceso de dispatch en caso de que no haya productos en stock.
	 */
	@Test
	public void dispatchNoStockTest() {
		CreditCard squanchy = new CreditCard("Squanchy", "4444444444444444");
		packExpender.dispatch(squanchy);
		packExpender.dispatch(squanchy);
		packExpender.dispatch(squanchy);
		packExpender.dispatch(squanchy);
		assertEquals(packExpender.stock(), 0, 0);
		assertEquals(squanchy.credit(), 2850d, 0);		
	}

}
