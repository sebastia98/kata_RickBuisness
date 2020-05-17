package edu.elsmancs.domain.kata_RickBuisness;

import java.util.ArrayList;

/**
 * La clase Receptivo automatiza la atención los invitados ofreciéndoles los dos servicios disponibles 
 * a través de la interface GuestDispatcher.
 * @author sebas
 *
 */
public class Receptivo {
	
	ArrayList<GuestDispatcher> guest = new ArrayList<GuestDispatcher>();
	/**
	 * Contructor de la clase Receptivo.
	 */
	public Receptivo() {}
	/*Registra los objetos que implementan la interfaz en una estructura de datos ya que así almacenamos todos los datos que usa guestDispatcher*/
	public void registra(GuestDispatcher gestDispatcher) {
		this.guest.add(gestDispatcher);
	}
	/**
	 * Método que devuelve la ArrayList de los servicios disponibles.
	 * @return ArrayList guest
	 */
	public ArrayList<GuestDispatcher> getGuest(){
		return this.guest;
	}
	/**
	 * Método que recorre todos los servicios de la estructura de datos guest y despacha al personaje con todos los servicios
	 * @param CreditCard personaje
	 */
	public void dispatch(CreditCard personaje) {
		for (GuestDispatcher objeto: guest) {
			objeto.dispatch(personaje);
		}
		
	}
	
	
}
