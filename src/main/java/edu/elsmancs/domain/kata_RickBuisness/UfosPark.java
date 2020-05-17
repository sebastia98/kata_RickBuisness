package edu.elsmancs.domain.kata_RickBuisness;

import java.util.HashMap;
import java.util.Map;
/**
 * Clase UfosPark que implementa la interfice GuestDispatcher.
 * Propociona naves espaciales a los invitados de Rick.
 * @author sebas
 *
 */
public class UfosPark implements GuestDispatcher {
	
	private final double fee = 500d;
	private Map<String, String> flota = new HashMap <String, String>(); 

	public String toString(){
		return flota.keySet().toString();
	}
	
	/**
	 * Método que añade a la flota, que es una estructura de datos Map, el id del Ovni y su disponibilidad
	 * @param String ovniID
	 */
	public void add(String ovniID) {
		this.flota.put(ovniID, null);
	}
	
	/**
	 * Devuelve la flota de ovnis.
	 * @return Map flota
	 */
	public Map<String, String> getFlota(){
		return this.flota;
	}
	
	public void dispatch(CreditCard abradolph) {
		if (this.getFlota().containsKey(abradolph.number())) {
			
		}
		else if (abradolph.credit() >= this.fee) {
			for (String ovniID: this.getFlota().keySet()) {
				if (this.getFlota().get(ovniID) == null) {
					abradolph.pay(fee);
					this.getFlota().put(ovniID, abradolph.number());
					break;
				}
			}
		}
		
	}
	/**
	 * Método que devuelve el id del ovni que usa el personaje definido en el parámetro
	 * @param nombrePersonaje
	 * @return ovni
	 */
	public String getUfoOf(String nombrePersonaje) {
		String ovni = null;
		for (String ovniID: this.getFlota().keySet()) {
			if (this.getFlota().get(ovniID) == nombrePersonaje) {
				ovni = ovniID;
			}
		}
		return ovni;
	}

}
