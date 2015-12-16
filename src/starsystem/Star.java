package starsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Uzed on 20.07.2015.
 */
public class Star {
    String name;
    List<Planet> star = new ArrayList<Planet>();



    public Star(String name, List<Planet> star) {
        this.name = name;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Planet> getStar() {
        return star;
    }

    public void setStar(List<Planet> star) {
        this.star = star;
    }
}
