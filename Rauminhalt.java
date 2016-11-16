package Gruppe_Burian_Moser_Wintersperger;

/**
 * RaumInhalt. Berechnet den RaumInhalt von Quader, Zylinder, Prisma mit Dreiseitiger Grundfläche
 * @author mwintersperger
 * @version 2016-11-10
 */
public class RaumInhalt implements IRaumInhalt{
    private double ergebnis;
    /**
     * RaumInhalt eines quaders
     * @param a die Länge des Quaders
     * @param b die Breite des Quaders
     * @param h die Höhe des Quaders
     */
    public RaumInhalt(double a, double b, double h) {
        this.ergebnis = a*b*h;
    }
    /**
     * RaumInhalt Zylinder
     * @param r der Radius der Grundfäche des Zylinders
     * @param h die Höhe des Zylinders
     */
    public RaumInhalt(double r, double h){
        this.ergebnis= Math.PI*r*r*h;
    }
    /**
     * RaumInhalt Prisma
     * @param a Seitenlänge a der Grundfläche
     * @param b Seitenlänge b der Grundfläche
     * @param c Seitenlänge c der Grundfläche
     * @param h die Höhe des Prismas
     */
    public RaumInhalt(double a, double b, double c, double h){
        double s = (a+b+c)/2;
        double temp=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        this.ergebnis= (temp*h)/3;
    }

    public double getRaumInhalt() {
        return ergebnis;
    }
}
