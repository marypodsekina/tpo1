package module_3;

public class Place implements Comparable<Place> {
    String name;
    Place(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Place p) {
        return this.name.compareTo(p.name);
    }
}
