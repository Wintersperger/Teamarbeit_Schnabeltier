package wintersperger;

import loesung.IRaumInhalt;

public class Rauminhalt implements IRaumInhalt{
	private double pi;
	public Rauminhalt(){
		this.pi =3.14159265359;
	}
	@Override
	public double getRaumInhalt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Rauminhalt quader
	 * @param a die Länge des Quaders
	 * @param b die Breite des Quaders
	 * @param h die Höhe des Quaders
	 * @return der Rauminhalt des Quaders
	 */
	public double getRaumInhalt(double a, double b, double h) {
			double temp = a*b*h;
		return temp;
	}

	/**
	 * Rauminhalt Zylinder
	 * @param r der Radius der Grundfäche des Zylinders
	 * @param h die Höhe des Zylinders
	 * @return der Rauminhalt des Zylinders
	 */
	public double getRaumInhalt(double r, double h){
		double temp= pi*r*r*h;
		return temp;
	}
	

}
