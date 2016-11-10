package Gruppe_Burian_Moser_Wintersperger;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Erstellt ein TreeSet und arbeitet mit vom Benutzer hinzugefügte Werte
 *
 * Created by Burian Paul on 10.11.2016.
 */
public class Zahlen implements IZahlen{
    private TreeSet<Double> set = new TreeSet<>();

    /**
     * Berechnet die Summe ders gesamteb TreeSet
     *
     * @return die Summe des gesamten TreeSet
     */
    @Override
    public double getSumme() {
        double erg =0;
        Iterator it = set.iterator();
        while(it.hasNext()){
            erg += (double)(it.next());
        }
        return erg;
    }

    /**
     *  Ermittelt den kleinesten Wert in der TreeSet
     *
     * @return den kleinsten Wert in des TreeSet
     */
    @Override
    public double getMinimum() {
        Iterator it = set.iterator();
        return (double)(it.next());
    }

    /**
     * Ermittelt den größten Wert in der TreeSet
     *
     * @return den größten Wert in des TreeSet
     */
    @Override
    public double getMaximum() {
        double max;
        Iterator it = set.iterator();
        while(it.hasNext()){
            it.next();
        }
        max = (double)(it.next());
        return max;
    }

    /**
     *  Fügt einen Wert hinzu
     *
     * @param value ist der hinzuzufügende Wert
     */
    @Override
    public void add(double value) {
        set.add(value);
    }
}

