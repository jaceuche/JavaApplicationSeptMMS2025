// File: Bicycle.java
public class Bicycle implements CarbonFootprint {
    private double milesRidden;

    public Bicycle(double milesRidden) {
        this.milesRidden = milesRidden;
    }

    public double getMilesRidden() { return milesRidden; }

    @Override
    public double getCarbonFootprint() {
        // Bicycles emit 0 direct greenhouse gases
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Bicycle ridden for %.2f miles per year", getMilesRidden());
    }
}