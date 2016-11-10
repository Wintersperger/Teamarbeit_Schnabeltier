package wintersperger;

import loesung.IRaumInhalt;

public class Rauminhalt implements IRaumInhalt{
	private double pi;
	private double temp;
	/**
	 * Rauminhalt eines quaders
	 * @param a die Länge des Quaders
	 * @param b die Breite des Quaders
	 * @param h die Höhe des Quaders
	 */
	public Rauminhalt(double a, double b, double h) {
		this.pi =3.14159265359;
		double temp = a*b*h;
	}
	/**
	 * Rauminhalt Zylinder
	 * @param r der Radius der Grundfäche des Zylinders
	 * @param h die Höhe des Zylinders
	 * @return der Rauminhalt des Zylinders
	 */
	public Rauminhalt(double r, double h){
		double temp= pi*r*r*h;
	}
	@Override
	public double getRaumInhalt() {
		// TODO Auto-generated method stub
		return temp;
	}
}
