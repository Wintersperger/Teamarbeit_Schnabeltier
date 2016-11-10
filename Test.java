package Gruppe_Burian_Moser_Wintersperger;

/**
 * Klasse in der die Methoden der Klassen Flaeche, Zahlen und RaumInhalt getestet werden
 * 
 * @author Moser Patrizia
 * @version 2016-11-10
 *
 */
public class Test {

	public static void main(String [] args){
		
		// Test der Klasse Flaeche
		
		Flaeche f1 = new Flaeche(13.25);
		f1.getFlaeche();
		
		Flaeche f2 = new Flaeche(52.13, 43.22);
		f2.getFlaeche();
		
		Flaeche f3 = new Flaeche(5.213, 4.892, 6.871);
		f3.getFlaeche();
	}
}
