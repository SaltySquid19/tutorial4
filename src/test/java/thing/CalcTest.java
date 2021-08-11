package thing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void testAdd() {
		 Calc c = new Calc();
		    assertEquals(5, c.add(2, 3), "Failure!");
	}
	@Test
	void testSubtract() {
		Calc c = new Calc();
		assertEquals(2, c.subtract(5, 3), "Failure!");
	}
	

}
