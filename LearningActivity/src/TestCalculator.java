import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAdd(){
		Calculator c = new Calculator();
		assertEquals(c.Add(2, 3), 5);
		
		assertNotEquals(c.Add(2, 3), 5);
	}
}
