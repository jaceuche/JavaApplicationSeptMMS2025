// File: CarbonFootprintTest.java
import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> categories = new ArrayList<>();

        categories.add(new Building(1250.0));
        categories.add(new Car(450.0));
        categories.add(new Bicycle(320.0));

        System.out.println("Processing Carbon Footprint Objects Polymorphically:%n");

        for (CarbonFootprint item : categories) {
            System.out.printf("%s%nAnnual Carbon Footprint: %.2f lbs of CO2%n%n", 
                item.toString(), item.getCarbonFootprint());
        }
    }
}