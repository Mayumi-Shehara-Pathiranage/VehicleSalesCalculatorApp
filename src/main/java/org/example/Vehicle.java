package org.example;

// Vehicle.java
public class Vehicle {
    protected String vehicleType;
    protected String manufacturer;
    protected double basePrice;

    // Constructor
    public Vehicle(String vehicleType, String manufacturer, double basePrice) {
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
    }

    // Method to calculate tax (10% of base price)
    public double calculateTax() {
        return 0.10 * basePrice;
    }

    // Method to calculate total price (base price + tax)
    public double calculateTotalPrice() {
        return basePrice + calculateTax();
    }

    // Overloaded method to calculate discounted total price
    public double calculateTotalPrice(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            double discountAmount = (discountPercentage / 100) * calculateTotalPrice();
            return calculateTotalPrice() - discountAmount;
        } else {
            System.out.println("Invalid discount percentage. No discount applied.");
            return calculateTotalPrice();
        }
    }
}
