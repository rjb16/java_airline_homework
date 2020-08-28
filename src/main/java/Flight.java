import java.util.ArrayList;

public class Flight extends Plane{

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private PlaneType planeType;

    public Flight(ArrayList<Passenger> bookedPassengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime, PlaneType planeType) {
        super(planeType);
        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getNumberOfAvailableSeats(ArrayList<Passenger> passengersArray) {
        int capacity = this.getCapacity();
        int total = 0;
        for (int i = 0; i < passengersArray.size(); i++) {
            total += 1;
        }
        int numberOfSeatsAvailable = capacity - total;
        return numberOfSeatsAvailable;
    }

    public void bookPassenger(ArrayList<Passenger> passengersArray, Passenger passenger) {
        if (getNumberOfAvailableSeats(passengersArray) >= 1) {
            passengersArray.add(passenger);
        }
    }
}