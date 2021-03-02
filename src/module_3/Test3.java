package module_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test3 {

    @Test
    void HumanNearThing(){
        Human he = new Human("Andy");
        Thing umbrella = new Thing("umbrella", "red");
        Place beach = new Place("beach");
        Place sea = new Place("sea");
        he.setPlace(beach);
        umbrella.setPlace(beach);
        assertEquals(Checker.checkIfNear(he,umbrella),"Человек и объект находятся рядом");
        he.setPlace(sea);
        assertEquals(Checker.checkIfNear(he,umbrella), "Человек и объект не рядом");
    }

    @Test
    void NullablePlace(){
        Human he = new Human("Andy");
        Thing umbrella = new Thing("umbrella", "red");
        assertEquals(Checker.checkIfNear(he,umbrella),"Не возможно определить");
    }

    @Test
    void pebbleIsExpensive(){
        Pebble y_pebble = new Pebble("yellow");
        Pebble g_pebble = new Pebble("green");
        Pebble b_pebble = new Pebble("black");
        assertTrue(y_pebble.isExpensive);
        assertTrue(g_pebble.isExpensive);
        assertFalse(b_pebble.isExpensive);
    }


}
