import loesung.IRaumInhalt;

public class Rauminhalt implements IRaumInhalt{

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
			double temp = a*b*b;
		return temp;
	}

}
