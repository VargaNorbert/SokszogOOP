package hu.petrik.szokszogekoop;

public class Paralelogramma extends Sokszog{
    private double alfa;
    private double b;

    public Paralelogramma(){
        super(getVeletlenOldal());
        this.b= getVeletlenOldal();
        this.alfa= getVeletlenSzog();

    }

    private static double getVeletlenOldal() {
        return Math.random()*5 + 5;
    }
    private static double getVeletlenSzog() {
        return Math.random()*179;
    }

    public Paralelogramma(double a, double alfa,double b) {
        super(a);
        this.alfa = alfa;
        this.b=b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
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

        double radian= (alfa*180)/Math.PI;

        return super.getA()*this.b*Math.sin(radian);
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %f - b = %f - alfa = %f - %s",this.getA(),this.getB(),this.alfa,super.toString());
    }
}
