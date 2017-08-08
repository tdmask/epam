package temp.task0302_old1.query;

import temp.task0302_old1.Spreadsheet;
import temp.task0302_old1.database.TargetData;
import temp.task0302_old1.entity.Plane;


public class Query {

    public void listFlightByDestination(Plane[] planes, TargetData targetData) {
        boolean isResultEmpty = true;
        System.out.print("The list of flights for destination "
                + targetData.getTargetDestination() + ": ");
        Spreadsheet.printHeader();
        for (Plane plane : planes) {
            if (plane.getDestination().equals(targetData.getTargetDestination())) {
                System.out.println(plane);
                isResultEmpty = false;
            }
        }
        if (isResultEmpty)
            System.out.println("no records!");
        Spreadsheet.printBottomLine();

    }

    public void listFlightByDayOfWeek(Plane[] planes, TargetData targetData) {
        boolean isResultEmpty = true;
        System.out.print("The list of flights for " + targetData.getTargetDayOfWeek() + ": ");
        Spreadsheet.printHeader();
        for (Plane plane : planes) {
            if (plane.getDayOfFlight().equals(targetData.getTargetDayOfWeek())) {
                System.out.println(plane);
                isResultEmpty = false;
            }
        }
        if (isResultEmpty)
            System.out.println("no records!");
        Spreadsheet.printBottomLine();
    }

    public void listFlightByDayOfWeekAndTime(Plane[] planes, TargetData targetData) {
        boolean isResultEmpty = true;
        System.out.print("The list of flights for " + targetData.getTargetDayOfWeek() + " and later than "
                + targetData.getTargetTime() + " : ");
        Spreadsheet.printHeader();
        for (Plane plane : planes) {
            if (plane.getDayOfFlight().equals(targetData.getTargetDayOfWeek())
                    && (plane.getTime().compareTo(targetData.getTargetTime())>0))
            {
                System.out.println(plane);
                isResultEmpty = false;
            }
        }
        if (isResultEmpty)
            System.out.println("no records!");
        Spreadsheet.printBottomLine();
    }

}
