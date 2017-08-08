package temp.task0302_old1.view;

import temp.task0302_old1.database.Database;
import temp.task0302_old1.entity.Plane;

import java.util.Arrays;
import java.util.Comparator;

public class FlightsSort {

    public static void sortFlightsByTime(Plane[] planes) {
        Arrays.sort(planes, new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                String time1 = o1.getTime();
                String time2 = o2.getTime();
                return time1.compareTo(time2);
            }
        });
    }

    public static void sortFlightsByDestination(Plane[] planes){
        Arrays.sort(planes, new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                String destination1 = o1.getDestination();
                String destination2 = o2.getDestination();
                return destination1.compareTo(destination2);
            }
        });
    }

    public static void sortFlightsByDayOfFlight(Plane[] planes){

        Arrays.sort(planes, new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                String day1 = o1.getDayOfFlight();
                String day2 = o2.getDayOfFlight();

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
        });
    }
}
