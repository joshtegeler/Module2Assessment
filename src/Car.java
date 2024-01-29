
/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
public class Car {

    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters and setters
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display method
    public void displayInfo() {
        System.out.println("The " + year + " " + make + " " + model + " is a fantastic car.");
    }

    // Return display
    public String getDisplayInfo() {
        return "The " + year + " " + make + " " + model + " is a fantastic car.";
    }
}
