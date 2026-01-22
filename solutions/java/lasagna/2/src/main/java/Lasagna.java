public class Lasagna {

    // expected oven time
    public int expectedMinutesInOven() {
        return 40;
    }

    // remaining oven time
    public int remainingMinutesInOven(int minutesInOven) {
        return 40 - minutesInOven;
    }

    // preparation time
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // total time
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}

