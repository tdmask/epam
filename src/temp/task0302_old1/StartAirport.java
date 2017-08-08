package temp.task0302_old1;

public class StartAirport {

    public static void main(String[] args) {
        final int NUMBER_OF_PLANES = 10;
        System.out.println("-- Starting your own Airport --");
        AirportController airport1 = new AirportController(NUMBER_OF_PLANES);
        airport1.start();
    }
}
