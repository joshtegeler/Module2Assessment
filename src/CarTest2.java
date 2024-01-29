import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;


/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
class CarTest2 {

	
	@Before
	public void setUp() throws Exception {
	}

    @Test
    public void testDisplayInfo() {
        Car car = new Car("Mercedes", "C63 AMG", 2023);

        // Call displayInfo method and get display message
        String expected = car.getDisplayInfo();

        assertEquals(expected, car.getDisplayInfo());
    }

}
