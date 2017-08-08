package task01.task0103.view;

import task01.task0103.entity.Flight;

import java.util.Comparator;

public class FlightsByTimeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String time1 = ((Flight)o1).getTime();
        String time2 = ((Flight)o2).getTime();
        return time1.compareTo(time2);
    }
}
