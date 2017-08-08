package task04.task0401;



import task04.task0401.entity.Flight;

import java.io.*;

public class SerializeFlights {

    public static void writeObjects (String fileName, Flight[] flights) throws IOException {

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Flight flight : flights) {
        oos.writeObject(flight);
        }
        oos.flush();
        oos.close();

    }

    public static Flight[] readObjects (String fileName, int flightNumbers) throws IOException, ClassNotFoundException {
        Flight[] flights = new Flight[flightNumbers];
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        for (int i = 0; i<flightNumbers; i++) {
            flights[i] = (Flight) ois.readObject();
        }

        return flights;

    }
}
