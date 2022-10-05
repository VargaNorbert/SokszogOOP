package hu.petrik.szokszogekoop;

public class Negyzet extends Sokszog{

    public Negyzet(){
        super(getVeletlenOldal());
    }
    private static double getVeletlenOldal() {
        return Math.random()*5 + 5;
    }

    @Override
    public double getKerulet(){
        return 4*this.getA();
    }

    @Override
    public double getTerulet(){

        return (Math.pow(this.getA(),2));
    }

    @Override
    public String toString() {
        return String.format("Négyzet: a = %f - %s",this.getA(),super.toString());
    }
}
