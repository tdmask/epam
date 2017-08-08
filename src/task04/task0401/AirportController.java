package task04.task0401;

import task04.task0401.database.Database;
import task04.task0401.database.TargetData;
import task04.task0401.entity.Flight;
import task04.task0401.query.Query;
import task04.task0401.view.FlightsSort;

import java.io.IOException;

public class AirportController {

    final String[] menuListForAirport = {"MainWriteSerial menu:" +
            "\n[1 ]-Print all flights                 ",
            "[2 ]-Print target/spec. data for search",
            "\n[4 ]-Select by spec.'Destination'      ",
            "[5 ]-Select by spec.'Day'              ",
            "[6 ]-Select by 'Day' && later than 'TIME'",
            "\n[7 ]-Sort Flights by Time              ",
            "[8 ]-Sort Flights by Destination       ",
            "[9 ]-Sort Flights by Day               ",
            "\n[11]-Save Objects to File              ",
            "[12]-Read Objects from File            ",
            "[13]-Print Objects (saved in the File) ",
            "\n[0]-Exit"
    };

    final Flight[] flights;
    Flight[] prevFlights;
    final Menu menuAirport;

    AirportController(int flightNumbers) {
        flights = new Flight[flightNumbers];
        prevFlights = new Flight[flightNumbers];
        menuAirport = new Menu(menuListForAirport);
    }

    public void start() throws IOException, ClassNotFoundException {

        // init data for Target from DB (random)
        TargetData targetData = new TargetData();
        targetData.initData();
        Query query = new Query();

        // init flights (random)
        initFlights();
        System.out.println("--info: [randomly generated data from "+ Database.class.getName()
                +"]: Successfully created " + flights.length + " plane(s).");

        while (true) {
            int choice = menuAirport.userChoice();
            switch (choice) {
                case 1:
                    printFlights(flights);
                    break;
                case 2:
                    targetData.printData();
                    break;
                case 4:
                    query.listFlightByDestination(flights, targetData);
                    break;
                case 5:
                    query.listFlightByDayOfWeek(flights, targetData);
                    break;
                case 6:
                    query.listFlightByDayOfWeekAndTime(flights, targetData);
                    break;
                case 7:
                    FlightsSort.sortFlightsByTime(flights);
                    break;
                case 8:
                    FlightsSort.sortFlightsByDestination(flights);

                    break;
                case 9:
                    FlightsSort.sortFlightsByDayOfFlight(flights);
                    break;
                case 11:
                    System.out.println("--info: Save Objects to file ...");
                    SerializeFlights.writeObjects("airport20170808.dat",flights);
                    break;
                case 12:
                    System.out.println("--info: Read Objects from file ...");
                    prevFlights = SerializeFlights.readObjects("airport20170808.dat",flights.length);
                    break;
                case 13:
                    System.out.println("--info: Print Objects (saved in the file ...");
                    printFlights(prevFlights);
                    break;
                case 0:
                    System.out.println("-- Exit from Airport business --");
                    System.exit(0);
            }
        }
    }

    private void printFlights(Flight[] flights) {
        Spreadsheet.printHeader();
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        Spreadsheet.printBottomLine();
    }

    private void initFlights() {
        for (int i = 0; i < flights.length; i++) {
            flights[i] = new Flight().initFlightRandomly();
        }
    }
}
