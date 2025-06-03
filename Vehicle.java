public abstract class Vehicle {
    
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;
    private double fuel;

    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency, double fuel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
        this.fuel = fuel; 
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getFuelType() { return fuelType; }
    public double getFuelEfficiency() { return fuelEfficiency; }
    public double getFuel() { return fuel; }

    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println(model + " refueled: " + amount + " L. Current fuel: " + fuel + " L.");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    public void drive(double distance) {
        double fuelNeeded = distance / fuelEfficiency;
        if (fuel >= fuelNeeded) {
            fuel -= fuelNeeded;
            System.out.println(model + " drove " + distance + " km. Fuel left: " + fuel + " L.");
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }

    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();
}
