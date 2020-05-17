package edu.elsmancs.domain.kata_RickBuisness;

/**
 * Clase CrystalExpender que implementa la interface GuestDispatcher.
 * Proporciona cristales espaciales a los invitados.
 * @author sebas
 *
 */
public class CrystalExpender implements GuestDispatcher{
	private int unidades = 0;
	private double costeUnidad = 0d;
	
	/**
	 * Contructor del CrystalExpender.
	 * @param int unidades
	 * @param int costeUnidad
	 */
	public CrystalExpender(int unidades, int costeUnidad) {
		this.unidades = unidades;
		this.costeUnidad = costeUnidad;
	}
	
	public String toString() {
		return "Stock: " + stock() +
				"\nCoste Unidad: " + costeUnidad();
	}
	
	/**
	 * Método que devuelve el número de unidades disponibles en el CrystalExpender.
	 * @return int unidades
	 */
	public int stock() {
		return this.unidades;
	}
	
	/**
	 * Método que devuelve el precio que tiene el producto.
	 * @return double costeUnidad
	 */
	public double costeUnidad() {
		return costeUnidad;
	}
	
	public void dispatch(CreditCard personaje) {
		if (personaje.credit() >= this.costeUnidad && stock() > 0) {
			personaje.pay(costeUnidad);
			this.unidades = this.unidades - 1;
		}
		
	}
}
