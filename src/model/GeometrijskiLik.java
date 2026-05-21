package model;
//Omogućite sortiranje geometrijskih likova prema specifikaciji (po površini uzlazno).

public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    private String naziv;
    public abstract double opseg();
    public abstract double povrsina() ;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "GeometrijskiLik - Naziv: " + naziv + ", površine: " +  povrsina() + ", opsega: " + opseg();
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.valueOf(povrsina()).compareTo(Double.valueOf(o.povrsina()));

    }
}
