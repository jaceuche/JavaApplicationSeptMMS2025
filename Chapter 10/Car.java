// File: Car.java
public class c implements CarbonFootprint {
    private double gallons; // gallons of fuel used per year

    public Car(double gallons) {
        this.gallons = gallons;
    }

    public double getGallons() { return gallons; }

    @Override
    public double getCarbonFootprint() {
        // Standard factor: ~19.6 lbs CO2 per gallon of gasoline
        return gallons * 19.6;
    }

    @Override
    public String toString() {
        return String.format("Car consuming %.2f gallons of fuel per year", getGallons());
    }
}