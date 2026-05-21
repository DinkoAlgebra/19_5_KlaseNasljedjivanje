package model;

public class Trokut extends GeometrijskiLik {
//    private String naziv;
    private int a;
    private int b;
    private int c;

//    public Trokut(String naziv, int a, int b, int c) {
//        this.naziv = naziv;
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public Trokut(String naziv, int a, int b, int c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double opseg() {

        return a + b + c;
    }

    @Override
    public double povrsina() {
        double srednjica = (a + b + c) / 2.0;
        return Math.sqrt(srednjica * (srednjica -a) * (srednjica - b) * (srednjica -c));
    }
}
