package temp.task0302_old2_Generics.entity;

import temp.task0302_old2_Generics.database.Database;

public class Flight<T> {
    private T typePlane;
    private T boardNumber;
    private T flightNumber;
    private T destination;
    private T time;
    private T dayOfFlight;

    public T getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(T typePlane) {
        this.typePlane = typePlane;
    }

    public T getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(T boardNumber) {
        this.boardNumber = boardNumber;
    }

    public T getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(T flightNumber) {
        this.flightNumber = flightNumber;
    }

    public T getDestination() {
        return destination;
    }

    public void setDestination(T destination) {
        this.destination = destination;
    }

    public T getTime() {
        return time;
    }

    public void setTime(T time) {
        this.time = time;
    }

    public T getDayOfFlight() {
        return dayOfFlight;
    }

    public void setDayOfFlight(T dayOfFlight) {
        this.dayOfFlight = dayOfFlight;
    }


    @Override
    public String toString() {
        return String.format("%20s%20s%20s%20s%20s%20s",typePlane,boardNumber,flightNumber,destination,time,dayOfFlight);
    }

    // Init planes (randomly)
    public Flight initFlightRandomly() {

        int randSel = (int) (Math.random() * Database.typeOfPlanes.length);
        this.typePlane = (T) Database.typeOfPlanes[randSel];

        randSel = (int) (Math.random() * Database.boardNumbers.length);
        this.boardNumber = (T) Database.boardNumbers[randSel];

        randSel = (int) (Math.random() * Database.flightNumbers.length);
        this.flightNumber = (T) Database.flightNumbers[randSel];

        randSel = (int) (Math.random() * Database.destinations.length);
        this.destination = (T) Database.destinations[randSel];

        randSel = (int) (Math.random() * Database.dayOfWeek.length);
        this.dayOfFlight = (T) Database.dayOfWeek[randSel];

        randSel = (int) (Math.random() * Database.timeOfFlight.length);
        this.time = (T) Database.timeOfFlight[randSel];

        return this;
    }

}
