public class TrafficLightTest {

    public static void main(
        String[] args
    ) {

        for (
            TrafficLight light :
            TrafficLight.values()
        ) {

            System.out.printf(
                "%s: %d seconds%n",
                light,
                light.getDuration()
            );
        }
    }
}