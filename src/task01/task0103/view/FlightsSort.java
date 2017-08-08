package task01.task0103.view;

import task01.task0103.entity.Flight;

import java.util.Arrays;

public class FlightsSort {

    public static void sortFlightsByTime(Flight[] flights) {

        Arrays.sort(flights, new FlightsByTimeComparator());
    }

    public static void sortFlightsByDestination(Flight[] flights){
        Arrays.sort(flights, new FlightsByDestinationComparator());
    }

    public static void sortFlightsByDayOfFlight(Flight[] flights){

        Arrays.sort(flights, new FlightsByDayComparator());
    }
}
