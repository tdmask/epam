package task04.task0401;

import java.io.IOException;

public class StartAirport {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final int NUMBER_OF_FLIGHTS = 20;
        System.out.println("-- Starting your own Airport --");
        AirportController airport1 = new AirportController(NUMBER_OF_FLIGHTS);
        airport1.start();

    }
}
