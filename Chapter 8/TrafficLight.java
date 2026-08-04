public enum TrafficLight {

    RED(60),
    GREEN(60),
    YELLOW(5);

    private final int duration;

    TrafficLight(
        int duration
    ) {

        this.duration =
            duration;
    }

    public int getDuration() {

        return duration;
    }
}