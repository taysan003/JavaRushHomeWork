package starsystem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Uzed on 20.07.2015.
 */
public class StarSystem {
    String name;
    List<Star> starSys = new ArrayList<Star>();


    public static void main(String[] args) {

        List<Satelite> satelites = Arrays.asList(new Satelite("S1"), new Satelite("S2"), new Satelite("S3"), new Satelite("S4"));
        Planet planet = new Planet("Zemla", satelites);

        List<Satelite> satelites2 = Arrays.asList(new Satelite("S1"));
        Planet planet2 = new Planet("Zemla", satelites);

        Star star1 = new Star("Solnce", Arrays.asList(planet));
        Star star2 = new Star("Sirius", Arrays.asList(planet2));

        StarSystem starSystem = new StarSystem("Fdf", Arrays.asList(star1,star2));
        //for (Star strs: starSys)
        //{
            System.out.println(starSystem.getName());
            System.out.println(starSystem.starSys);
            System.out.println(starSystem.koll());
       // System.out.println(starSystem.);
        //}

    }

      public int koll() {

        int counte = 0;
        for (Star st : starSys) {
            counte +=st.getStar().size();
        }
          return  counte;
    }


    public StarSystem(String name, List<Star> starSys) {
        this.name = name;
        this.starSys = starSys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Star> getStarSys() {
        return starSys;
    }

    public void setStarSys(List<Star> starSys) {
        this.starSys = starSys;
    }
}
