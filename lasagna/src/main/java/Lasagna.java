public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int elapsedTimeInMinutes) {
        return expectedMinutesInOven() - elapsedTimeInMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        int layerPreparationTimeInMinutes = 2;
        return numberOfLayers * layerPreparationTimeInMinutes;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int lasagnaElapsedTimeOnOvenInMinutes) {
        return preparationTimeInMinutes(numberOfLayers) + lasagnaElapsedTimeOnOvenInMinutes;
    }
}
