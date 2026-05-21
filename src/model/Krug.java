package model;

public class Krug extends GeometrijskiLik {
//    private String naziv;
    private int radijus;

//    public Krug(String naziv, int r) {
//        this.naziv = naziv;
//        this.radijus = r;
//    }


    public Krug(String naziv, int radijus) {
        super(naziv);
        this.radijus = radijus;
    }

    @Override
    public double opseg() {
        return 2 * radijus * Math.PI;
         //O = 2 π r
    }

    @Override
    public double povrsina() {
        return Math.pow(radijus, 2) * Math.PI;
        //P = π r²
    }
}
