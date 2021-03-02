package module_3;

public class Human {
    String name;
    Place place;
    Human(String name){
        this.name = name;
        place = null;
    }
    public void setPlace(Place place) {
        this.place = place;
    }
}
