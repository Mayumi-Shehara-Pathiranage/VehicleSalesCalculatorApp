package org.example;

public class VehicleSales {
    public static void main(String[] args) {
        // Creating instances of different vehicles
        Vehicle vehicle1 = new Vehicle("SUV", "Toyota", 40000000);
        Car car1 = new Car("Honda", 36000000, 4);
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", 2000000, true);

        // Displaying total price for each vehicle
        System.out.println("Total Price - Vehicle 1: Rs." + vehicle1.calculateTotalPrice());
        System.out.println("Total Price - Car 1: Rs." + car1.calculateTotalPrice());
        System.out.println("Total Price - Motorcycle 1: Rs." + motorcycle1.calculateTotalPrice());

        // Displaying discounted prices for each vehicle with different discount percentages
        System.out.println("\nDiscounted Prices:");
        System.out.println("Discounted Price - Vehicle 1 (10% discount): Rs." +
                vehicle1.calculateTotalPrice(10));
        System.out.println("Discounted Price - Car 1 (5% discount): Rs." +
                car1.calculateTotalPrice(5));
        System.out.println("Discounted Price - Motorcycle 1 (20% discount): Rs." +
                motorcycle1.calculateTotalPrice(20));
    }
}
