package task01.task0103.view;

import task01.task0103.entity.Flight;

import java.util.Comparator;

public class FlightsByDestinationComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String destination1 = ((Flight)o1).getDestination();
        String destination2 = ((Flight)o2).getDestination();
        return destination1.compareTo(destination2);

    }
}
