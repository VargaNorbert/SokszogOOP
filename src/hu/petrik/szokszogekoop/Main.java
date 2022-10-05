package hu.petrik.szokszogekoop;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }

        for (int i = 0; i < 5 ; i++) {
            double a = Math.random()*10+5;
            double b = Math.random()*10+5;
            System.out.println(new Teglalap(a,b));

        }

        Paralelogramma p = new Paralelogramma();

        System.out.println(p);
        System.out.println(p.getTerulet());

        Sokszogek s = new Sokszogek(10);

        System.out.println(s);

        System.out.println(s.getOsszKerulet());

    }
}
