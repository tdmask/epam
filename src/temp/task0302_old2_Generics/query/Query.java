package temp.task0302_old2_Generics.query;

import temp.task0302_old2_Generics.Spreadsheet;
import temp.task0302_old2_Generics.database.TargetData;
import temp.task0302_old2_Generics.entity.Flight;


public class Query {

    public void listFlightByDestination(Flight[] flights, TargetData targetData) {
        boolean isResultEmpty = true;
        System.out.print("The list of flights for destination "
                + targetData.getTargetDestination() + ": ");
        Spreadsheet.printHeader();
        for (Flight flight : flights) {
            if (flight.getDestination().equals(targetData.getTargetDestination())) {
                System.out.println(flight);
                isResultEmpty = false;
            }
        }
        if (isResultEmpty)
            System.out.println("no records!");
        Spreadsheet.printBottomLine();
    }

    public void listFlightByDayOfWeek(Flight[] flights, TargetData targetData) {
        boolean isResultEmpty = true;
        System.out.print("The list of flights for " + targetData.getTargetDayOfWeek() + ": ");
        Spreadsheet.printHeader();
        for (Flight flight : flights) {
            if (flight.getDayOfFlight().equals(targetData.getTargetDayOfWeek())) {
                System.out.println(flight);
                isResultEmpty = false;
            }
        }
        if (isResultEmpty)
            System.out.println("no records!");
        Spreadsheet.printBottomLine();
    }

    public void listFlightByDayOfWeekAndTime(Flight[] flights, TargetData targetData) {
        boolean isResultEmpty = true;
        System.out.print("The list of flights for " + targetData.getTargetDayOfWeek() + " and later then "
                + targetData.getTargetTime() + " : ");
        Spreadsheet.printHeader();
        for (Flight flight : flights) {
            if (flight.getDayOfFlight().equals(targetData.getTargetDayOfWeek())
                    /*&& (flight.getTime().compareTo(targetData.getTargetTime())>0)*/)
            {
                System.out.println(flight);
                isResultEmpty = false;
            }
        }
        if (isResultEmpty)
            System.out.println("no records!");
        Spreadsheet.printBottomLine();
    }

}
