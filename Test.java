package Gruppe_Burian_Moser_Wintersperger;

/**
 * Klasse in der die Methoden der Klassen Flaeche, Zahlen und RaumInhalt getestet werden
 *
 * @author Moser Patrizia, Burian Paul
 * @version 2016-11-10
 *
 */
public class Test {

    public static void main(String [] args){

        // Test der Klasse Flaeche

        Flaeche f1 = new Flaeche(13.25);
        System.out.println(f1.getFlaeche());

        Flaeche f2 = new Flaeche(52.13, 43.22);
        System.out.println(f2.getFlaeche());

        Flaeche f3 = new Flaeche(5.213, 4.892, 6.871);
        System.out.println(f3.getFlaeche());

        // Test der Klasse RaumInhalt

        RaumInhalt r1 = new RaumInhalt(5.213, 4.892, 6.871, 15);
        System.out.println(r1.getRaumInhalt());

        RaumInhalt r2 = new RaumInhalt(52.13, 43.22);
        System.out.println(r2.getRaumInhalt());

        RaumInhalt r3 = new RaumInhalt(5.213, 4.892, 6.871);
        System.out.println(r3.getRaumInhalt());

        // Test der Klasse Zahlen

        Zahlen z1 = new Zahlen();
        z1.add(4.5);
        z1.add(3.5);
        z1.add(8.5);
        z1.add(Math.PI);
        System.out.println(z1.getMaximum());
        System.out.println(z1.getMinimum());
        System.out.println(z1.getSumme());

        Zahlen z2 = new Zahlen();
        z1.add(2.8);
        z1.add(3.7);
        z1.add(8.538321);
        z1.add(Math.PI);
        z1.getMaximum();
        z1.getMinimum();
        z1.getSumme();
    }
}
