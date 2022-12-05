import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        if (numberOfDays > 7) {
            for (int i = 0; i < birdsPerDay.length; i++) {
                sum = sum + birdsPerDay[i];
            }
        }
        else {
            for (int i = 0; i < numberOfDays; i++) {
                sum = sum + birdsPerDay[i];
            }
        }

        return sum;
    }

    public int getBusyDays() {
        int count = 0;

        for (int birds:birdsPerDay) {
            if (birds >=5) {
                count++;
            }
        }

        return count;
    }
}
