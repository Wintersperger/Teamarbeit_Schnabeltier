package Gruppe_Burian_Moser_Wintersperger;

import loesung.IRaumInhalt;
/**
 * Rauminhalt. Berechnet den Rauminhalt von Quader, Zylinder, Prisma mit Dreiseitiger Grundfläche
 * @author mwintersperger
 * @version 2016-11-10
 */
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
	 */
	public Rauminhalt(double r, double h){
		this.ergebnis= Math.PI*r*r*h;
	}
	/**
	 * Rauminhalt Prisma
	 * @param a Seitenlänge a der Grundfläche
	 * @param b Seitenlänge b der Grundfläche
	 * @param c Seitenlänge c der Grundfläche
	 * @param h die Höhe des Prismas
	 */
	public Rauminhalt(double a, double b, double c, double h){
		double s = (a+b+c)/2;
		double temp=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		this.ergebnis= temp*h;
	}
	@Override
	public double getRaumInhalt() {
		return ergebnis;
	}
}
