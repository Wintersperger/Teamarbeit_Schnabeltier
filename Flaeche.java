package Gruppe_Burian_Moser_Wintersperger;

/**
 * Eine Klasse in der die Fläche von Kreis, Dreieck und Rechteck 
 * berechnet und zurückgegeben werden kann.
 * 
 * @author Moser Patrizia
 * @version 2016-11-10
 *
 */
public class Flaeche implements IFlaeche{

	private double ergebnis;
	
	/**
	 * Berechnet die Fläche eines Rechtecks mit den im Parameter 
	 * angegebenen Werten und setzt das Ergebnis auf diesen Wert.
	 * 
	 * @param a erste Seite eines Rechtecks
	 * @param b zweite Seite eines Rechtecks
	 */
	public Flaeche(double a, double b){
		this.ergebnis = a*b;
	}
	
	/**
	 * Berechnet die Fläche eines Kreises mit dem im Parameter 
	 * angegebenen Radius und setzt das Ergebnis auf diesen Wert.
	 * 
	 * @param r Radius eines Kreises
	 */
	public Flaeche(double r){
		this.ergebnis = (r*r)*Math.PI;
	}
	
	/**
	 * Berechnet die Fläche eines Dreiecks mit den im Parameter 
	 * angegebenen Werten und setzt das Ergebnis auf diesen Wert.
	 * 
	 * @param a erste Seite eines Dreiecks
	 * @param b zweite Seite eines Dreiecks
	 * @param c dritte Seite eines Dreiecks
	 */
	public Flaeche(double a, double b, double c){
		double s = (a+b+c)/2;
		this.ergebnis = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
	}
	
	/**
	 * Gibt den jeweiligen Flächeninhalt zurück
	 * 
	 * @return ergebnis der jeweilige Flächeninhalt
	 */
	@Override
	public double getFlaeche() {
		return this.ergebnis;
	}

}
