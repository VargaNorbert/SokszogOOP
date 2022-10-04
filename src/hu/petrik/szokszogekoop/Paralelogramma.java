package hu.petrik.szokszogekoop;

public class Paralelogramma extends Sokszog{
    private double alfa;
    private double b;

    public Paralelogramma(){
        super(getVeletlenOldal());
        this.b= getVeletlenOldal();

    }

    private static double getVeletlenOldal() {
        return Math.random()*5 + 5;
    }

    public Paralelogramma(double a, double alfa,double b) {
        super(a);
        this.alfa = alfa;
        this.b=b;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    @Override
    public double getKerulet(){
        return 2*this.getA()+2*this.b;
    }

    @Override
    public double getTerulet(){
        return 0;
    }
}
