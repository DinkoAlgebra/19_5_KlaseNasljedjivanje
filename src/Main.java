import model.*;

import java.util.Collections;

//Zad 1: Na osnovu opisa projektnog zadatka, pripremite i implementirajte potrebne klase za trokut, krug i pravokutnik.
//zad 2: Primijetite neke elemente u klasama koje se ponavljaju.
//Implementirajte baznu klasu GeometrijskiLik, te refaktorirajte klase Pravokutnik, Trokut i Krug na način da odgovaraju specifikaciji zadatka.
public class Main {
    public static void main(String[] args) {
        Ucilica ucilica = new Ucilica();

        Pravokutnik prav1 = new Pravokutnik("Plavi", 9,14);
        Trokut trok1 = new Trokut ("Zeleni", 9,14,8);
        Krug krug1 = new Krug("Veeliki", 5);

//        System.out.println(prav1);
//        System.out.println(trok1);
//        System.out.println(krug1);

        ucilica.getLikovi().add(prav1);
        ucilica.getLikovi().add(trok1);
        ucilica.getLikovi().add(krug1);

        for (GeometrijskiLik gl : ucilica.getLikovi()) {
            System.out.println(gl);
        }
        System.out.println("Sortiranje i ispis");

        Collections.sort(ucilica.getLikovi());
        for (GeometrijskiLik gl : ucilica.getLikovi()) {
            System.out.println(gl);
        }


    }
}