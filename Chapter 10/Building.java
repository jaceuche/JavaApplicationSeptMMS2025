// File: Building.java
public class Building implements CarbonFootprint {
    private double monthlyKwh; // kilowatt hours used per month

    public Building(double monthlyKwh) {
        this.monthlyKwh = monthlyKwh;
    }

    public double getMonthlyKwh() { return monthlyKwh; }

    @Override
    public double getCarbonFootprint() {
        // Average factor: ~0.85 lbs CO2 per kWh annually
        return monthlyKwh * 12 * 0.85;
    }

    @Override
    public String toString() {
        return String.format("Building with monthly electricity consumption of %.2f kWh", getMonthlyKwh());
    }
}