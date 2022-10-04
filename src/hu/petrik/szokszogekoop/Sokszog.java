package hu.petrik.szokszogekoop;

public abstract class Sokszog {
    private double a;

    public Sokszog(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public abstract double getKerulet();

    public abstract double getTerulet();

    @Override
    public String toString() {
        return String.format("k = %-8.3f - T = %-8.3f",this.getKerulet(),this.getTerulet());
    }
}
