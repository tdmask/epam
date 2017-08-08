package temp.task0302_old2_Generics;

public class StartAirport {

    public static void main(String[] args) {
        final int NUMBER_OF_FLIGHTS = 50;
        System.out.println("-- Starting your own Airport --");
        AirportController airport1 = new AirportController(NUMBER_OF_FLIGHTS);
        airport1.start();
    }
}
