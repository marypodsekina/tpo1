package module_3;

public class Thing {

    String name;
    Place place;
    String color;

    Thing(String n, String c){
        name = n;
        place = null;
        color = c;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
