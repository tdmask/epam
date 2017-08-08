package temp.task0302_old1;

import temp.task0302_old1.database.Database;
import temp.task0302_old1.database.TargetData;
import temp.task0302_old1.entity.Plane;
import temp.task0302_old1.query.Query;
import temp.task0302_old1.view.FlightsSort;

public class AirportController {

    private String[] menuListForAirport = {"MainWriteSerial menu:" +
            "\n[1]-Print all flights                 ",
            "[2]-Print target/spec. data for search",
            "\n[4]-Select by spec.'Destination'      ",
            "[5]-Select by spec.'Day'              ",
            "[6]-Select by 'Day' && later than 'TIME'",
            "\n[7]-Sort Flights by Time              ",
            "[8]-Sort Flights by Destination       ",
            "[9]-Sort Flights by Day                ",
            "\n[0]-Exit"
    };

    private Plane[] planes;
    private Menu menuAirport;

    AirportController(int planeNumbers) {
        planes = new Plane[planeNumbers];
        menuAirport = new Menu(menuListForAirport);
    }


    public void start() {

        // init data for Target from DB (random)
        TargetData targetData = new TargetData();
        targetData.initData();
        Query query = new Query();

        // init planes (random)
        initPlanes();
        System.out.println("--info: [randomly generated data from "+ Database.class.getName()
                +"]: Successfully created " + planes.length + " plane(s).");

        while (true) {
            int choice = menuAirport.userChoice();
            switch (choice) {
                case 1:
                    printPlanes(planes);
                    break;
                case 2:
                    targetData.printData();
                    break;
                case 4:
                    query.listFlightByDestination(planes, targetData);
                    break;
                case 5:
                    query.listFlightByDayOfWeek(planes, targetData);
                    break;
                case 6:
                    query.listFlightByDayOfWeekAndTime(planes, targetData);
                    break;
                case 7:
                    FlightsSort.sortFlightsByTime(planes);
                    break;
                case 8:
                    FlightsSort.sortFlightsByDestination(planes);
                    break;
                case 9:
                    FlightsSort.sortFlightsByDayOfFlight(planes);
                    break;
                case 0:
                    System.out.println("-- Exit from Airport business --");
                    System.exit(0);
            }
        }
    }

    private void printPlanes(Plane[] planes) {
        Spreadsheet.printHeader();
        for (Plane plane : planes) {
            System.out.println(plane);
        }
        Spreadsheet.printBottomLine();
    }

    private void initPlanes() {
        for (int i = 0; i < planes.length; i++) {
            planes[i] = new Plane().initPlaneRandomly();
        }
    }
}
