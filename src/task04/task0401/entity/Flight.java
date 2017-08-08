package task04.task0401.entity;

import task04.task0401.database.Database;

import java.io.Serializable;

public class Flight implements Serializable{
    private String typePlane;
    private String boardNumber;
    private String flightNumber;
    private String destination;
    private String time;
    private String dayOfFlight;

    public String getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(String typePlane) {
        this.typePlane = typePlane;
    }

    public String getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(String boardNumber) {
        this.boardNumber = boardNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDayOfFlight() {
        return dayOfFlight;
    }

    public void setDayOfFlight(String dayOfFlight) {
        this.dayOfFlight = dayOfFlight;
    }


    @Override
    public String toString() {
        return String.format("%20s%20s%20s%20s%20s%20s",typePlane,boardNumber,flightNumber,destination,time,dayOfFlight);
    }

    // Init planes (randomly)
    public Flight initFlightRandomly() {

        int randSel = (int) (Math.random() * Database.typeOfPlanes.length);
        this.typePlane = Database.typeOfPlanes[randSel];

        randSel = (int) (Math.random() * Database.boardNumbers.length);
        this.boardNumber = Database.boardNumbers[randSel];

        randSel = (int) (Math.random() * Database.flightNumbers.length);
        this.flightNumber = Database.flightNumbers[randSel];

        randSel = (int) (Math.random() * Database.destinations.length);
        this.destination = Database.destinations[randSel];

        randSel = (int) (Math.random() * Database.dayOfWeek.length);
        this.dayOfFlight = Database.dayOfWeek[randSel];

        randSel = (int) (Math.random() * Database.timeOfFlight.length);
        this.time = Database.timeOfFlight[randSel];

        return this;
    }

}
