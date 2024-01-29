import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
class CarTest1 {

    @Test
    public void testCarAttributes() {
        Car car = new Car("BMW", "M4", 2023);
        assertEquals("BMW", car.getMake());
        assertEquals("M4", car.getModel());
        assertEquals(2023, car.getYear());
        
        assertTrue(car.getYear() > 2000);

        assertNotNull(car.getMake());
    }

    @Test
    public void testCarSetters() {
        Car car = new Car("Audi", "S4", 2014);
        car.setMake("Porsche");
        car.setModel("911 GT3");
        car.setYear(2023);

        assertEquals("Porsche", car.getMake());
        assertEquals("911 GT3", car.getModel());
        assertEquals(2023, car.getYear());

        assertNotNull(car.getMake());
    }
    
    @Test
    public void testYear() {
        Car car = new Car("Mazda", "MazdaSpeed3", 2009);

        // Assertion: assertTrue
        assertTrue(car.getYear() > 2000);
    }
    
    @Test
    public void testModel() {
        Car car = new Car("Lexus", "IS F", 2011);

        assertTrue(car.getModel() == "IS F");
    }

}
