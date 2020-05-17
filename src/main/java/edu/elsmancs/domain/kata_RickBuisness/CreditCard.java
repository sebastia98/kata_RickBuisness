package edu.elsmancs.domain.kata_RickBuisness;

/**
 * Esta clase representa la tarjeta de crédito de los invitados
 * @author sebas
 *
 */
public class CreditCard {
	
	private String nombreInvitado = null;
	private String numeroTarjeta = null;
	private double credito = 3000d;
	final private String symbol = "EZIS";
	
	/**
	 * Este es el constructor de la tarjeta de crédito
	 * @param nombreInvitado
	 * @param numeroTarjeta
	 */
	public CreditCard(String nombreInvitado, String numeroTarjeta) {
		this.nombreInvitado = nombreInvitado;
		this.numeroTarjeta = numeroTarjeta;
	}
	public String toString() {
		return "Owner: " + getNombre() +
				"\nNumber: " + number() +
				"\nCredit: " + credit() + " " + this.symbol;
	}
	/**
	 * Método que devuelve el nombre del invitado
	 * @return String nombreInvitado
	 */
	public String getNombre() {
		return this.nombreInvitado;
	}
	
	/**
	 * Método que devuelve el número de la tarjeta de crédito público
	 * @return String numeroTarjeta
	 */
	public String number() {
		return this.numeroTarjeta;
	}
	/**
	 * Método que devuelve el valor del crédito de la tarjeta de crédito. Si es menor o igual que cero, devuelve cero
	 * @return double credito
	 */
	public double credit() {
		if (this.credito <= 0) {
			return 0d;
		}
		else {
			return this.credito;
		}
		
	}
	
	/**
	 * Método que realiza pagos. El parámetro coste es restado al valor total de crédito.
	 * @param coste double
	 */
	public void pay(double coste) {
		this.credito = this.credito - coste;
	}

}
