package thing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {
	int a; int b;
    public int add(int a, int b){
       return a + b;
    }
    
	@Test
	void testAdd() {
		a = 10; b = 4;
		assertEquals(14,add(a,b));
	}

}
