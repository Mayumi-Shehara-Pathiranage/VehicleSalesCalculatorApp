package org.example;

// Motorcycle.java
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String manufacturer, double basePrice, boolean hasSidecar) {
        super("Motorcycle", manufacturer, basePrice);
        this.hasSidecar = hasSidecar;
    }

    // Override method to calculate total price for motorcycles
    @Override
    public double calculateTotalPrice() {
        if (hasSidecar) {
            return basePrice + 1000; // Additional $1000 for sidecar
        } else {
            return basePrice;
        }
    }
}
