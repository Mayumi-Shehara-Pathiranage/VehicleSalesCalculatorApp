package org.example;

// Car.java
public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String manufacturer, double basePrice, int numberOfDoors) {
        super("Car", manufacturer, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    // Override method to calculate tax for cars (12% of base price)
    @Override
    public double calculateTax() {
        return 0.12 * basePrice;
    }

    // Override method to calculate total price for cars (base price + tax)
    @Override
    public double calculateTotalPrice() {
        return basePrice + calculateTax();
    }
}
