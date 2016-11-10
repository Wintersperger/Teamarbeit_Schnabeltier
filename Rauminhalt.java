package wintersperger;

import loesung.IRaumInhalt;

public class Rauminhalt implements IRaumInhalt{
	private double ergebnis;
	/**
	 * Rauminhalt eines quaders
	 * @param a die Länge des Quaders
	 * @param b die Breite des Quaders
	 * @param h die Höhe des Quaders
	 */
	public Rauminhalt(double a, double b, double h) {
		this.ergebnis = a*b*h;
	}
	/**
	 * Rauminhalt Zylinder
	 * @param r der Radius der Grundfäche des Zylinders
	 * @param h die Höhe des Zylinders
	 * @return der Rauminhalt des Zylinders
	 */
	public Rauminhalt(double r, double h){
		this.ergebnis= Math.PI*r*r*h;
	}
	/**
	 * Rauminhalt Prisma
	 * @param r der Radius der Grundfäche des Zylinders
	 * @param h die Höhe des Zylinders
	 * @return der Rauminhalt des Zylinders
	 */
	public Rauminhalt(double a, double b, double c, double h){
		double s = (a+b+c)/2;
		double temp=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		this.ergebnis= temp*h;
	}
	@Override
	public double getRaumInhalt() {
		// TODO Auto-generated method stub
		return ergebnis;
	}
}
