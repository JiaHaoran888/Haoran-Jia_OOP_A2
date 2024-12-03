public class Ride {
    private String rideID;
    private String rideName;
    private int capacity;
    private Employee operator;

    public Ride() {}

    public Ride(String rideID, String rideName, int capacity, Employee operator) {
        this.rideID = rideID;
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
    }

    public String getRideID() {
        return rideID;
    }

    public void setRideID(String rideID) {
        this.rideID = rideID;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }
}
