package thing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalc {

    @Test
    void add() {

        Calc c = new Calc();
        assertEquals(5, c.add(2, 3));
    }

    //@Test
    //void subtract() {
    //    Calc c = new Calc();
    //    assertEquals(2, c.subtract(5, 3));
    //}
}