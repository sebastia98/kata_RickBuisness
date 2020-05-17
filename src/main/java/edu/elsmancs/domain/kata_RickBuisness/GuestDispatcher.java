package edu.elsmancs.domain.kata_RickBuisness;

/**
 * Interfice para todos los servicios que ofre Rick en su fiesta.
 * @author sebas
 *
 */
public interface GuestDispatcher {
	/*Definimos el método que tienen que tener si o si las clases que implementan*/
	/**
	 * Método que despacha a los personajes tomando su tarjeta de crédito como parámetro 
	 * con los distintos servicios que ofrece Rick.
	 * @param personaje
	 */
	public void dispatch(CreditCard personaje);
}
