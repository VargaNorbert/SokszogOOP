package hu.petrik.szokszogekoop;

public class Haromszog extends Sokszog {
    private double b;
    private double c;
    
    public Haromszog(){
        super(getVeletlenOldal());
        this.b= getVeletlenOldal();
        this.c=getVeletlenOldal();

        while(!isSzerkeszheto()){
            super.setA(getVeletlenOldal());
            this.b=getVeletlenOldal();
            this.c=getVeletlenOldal();
        }
    }

    private static double getVeletlenOldal() {
        return Math.random()*5 + 5;
    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        
        if (!this.isSzerkeszheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;

        if (!this.isSzerkeszheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkeszheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkeszheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    private boolean isSzerkeszheto() {
        boolean szerkesztheto = true;
        if ((this.getA() + this.b) <= this.getC() ||
                (this.getA() + this.getC()) <= this.getB() ||
                (this.getB() + this.getC()) <= this.getA()) {

            szerkesztheto = false;

        }
        return szerkesztheto;
    }
    @Override
    public double getKerulet() {
        return this.getA() + this.b + this.c;
    }
    private double getS() {
        return getKerulet() / 2;
    }
    @Override
    public double getTerulet() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.getB()) * (this.getS() - this.getC()));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f - b = %f - c = %f - %s",
                this.getA(),this.getB(),this.getC(),super.toString());
    }

   
}
