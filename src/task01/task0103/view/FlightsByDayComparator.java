package task01.task0103.view;

import task01.task0103.database.Database;
import task01.task0103.entity.Flight;

import java.util.Comparator;

public class FlightsByDayComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String day1 = ((Flight) o1).getDayOfFlight();
        String day2 = ((Flight) o2).getDayOfFlight();

        int indexDay1 = 0;
        int indexDay2 = 0;
        for (int i = 0; i < Database.dayOfWeek.length; i++) {
            if (day1.equals(Database.dayOfWeek[i])) {
                indexDay1 = i;
            }
            if (day2.equals(Database.dayOfWeek[i])) {
                indexDay2 = i;
            }
        }

        if (indexDay1 > indexDay2) return 1;
        if (indexDay1 < indexDay2) return -1;
        return 0;
    }
}
