import org.junit.jupiter.api.Test;

import java.lang.Math;

import static org.junit.jupiter.api.Assertions.*;

class CosinusCalculatorTest {

    private double del = 0.001;

    @Test
    void checkZero() {
        assertEquals(Math.cos(0), CosinusCalculator.calc(0), del);
    }
    @Test
    void checkPI(){
        assertEquals(Math.cos(Math.PI), CosinusCalculator.calc(Math.PI), del);
        assertEquals(Math.cos(-Math.PI), CosinusCalculator.calc(-Math.PI), del);
    }
    @Test
    void checkHalfOfPI(){
        assertEquals(Math.cos(Math.PI/2), CosinusCalculator.calc(Math.PI/2), del);
        assertEquals(Math.cos(-Math.PI/2), CosinusCalculator.calc(-Math.PI/2), del);
    }

}