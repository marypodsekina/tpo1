package module_3;

public class Pebble {
    String color;
    boolean isExpensive;
    Pebble(String color){
        this.color = color;
        switch (color){
            case "green":
            case "yellow": {isExpensive = true; break;}
            default: {isExpensive = false; break;}
        }
    }
}
