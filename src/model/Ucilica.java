package model;
//Implementirajte novu klasu Ucilica, koja će sadržavati kolekciju generiranih geometrijskih likova.

import java.util.ArrayList;

public class Ucilica {
    private ArrayList<GeometrijskiLik> likovi;


    public Ucilica() {
        this.likovi = new ArrayList<>();
    }

    public ArrayList<GeometrijskiLik> getLikovi() {
        return likovi;
    }
}
