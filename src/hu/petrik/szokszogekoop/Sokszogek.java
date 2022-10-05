package hu.petrik.szokszogekoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sokszogek {

    private List<Sokszog> sokszogek= new ArrayList<>();

    public Sokszogek(int a) {
        Random r = new Random();
        int b;

        for (int i = 0; i < a; i++) {

            b= r.nextInt(4);

            switch (b) {
                case 0:
                    Haromszog h = new Haromszog();
                    sokszogek.add(h);
                    break;
                case 1:
                    Negyzet n = new Negyzet();
                    sokszogek.add(n);
                    break;
                case 2:
                    Teglalap t = new Teglalap();
                    sokszogek.add(t);
                    break;
                case 3:
                    Paralelogramma p = new Paralelogramma();
                    sokszogek.add(p);
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Sokszögek: %s",sokszogek);

    }

    public double getOsszKerulet(){

        double ossz=0;

        for (int i = 0; i < sokszogek.size(); i++) {
            ossz+= sokszogek.get(i).getKerulet();
        }

        return ossz;

    }

    public double getOsszTerulet(){

        double ossz=0;

        for (int i = 0; i < sokszogek.size(); i++) {
            ossz+= sokszogek.get(i).getTerulet();
        }

        return ossz;

    }

    public double getMaxTerulet(){
        double max=0;

        for (int i = 0; i < sokszogek.size(); i++) {
            if (sokszogek.get(i).getTerulet()>max){
                max=sokszogek.get(i).getTerulet();
            }
        }

        return max;
    }


}
