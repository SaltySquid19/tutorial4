package thing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {

        Calc c = new Calc();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void subtract() {
        Calc c = new Calc();
        assertEquals(8, c.subtract(5, 3));
    }
}