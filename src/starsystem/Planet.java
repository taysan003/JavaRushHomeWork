package starsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Uzed on 20.07.2015.
 */

public class Planet {
    String name;

    public Planet(String name, List<Satelite> planets) {
        this.name = name;
        this.planets = planets;
    }

    List<Satelite> planets = new ArrayList<Satelite>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Satelite> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Satelite> planets) {
        this.planets = planets;
    }
}
