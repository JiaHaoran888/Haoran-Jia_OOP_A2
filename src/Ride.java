import java.io.*;
import java.util.*;

public class Ride implements RideInterface {
    private String rideID;
    private String rideName;
    private int capacity;
    private Employee operator;
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;  // 改为 LinkedList

    private int maxRider;
    private int numOfCycles;

    public Ride() {
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();  // 改为 LinkedList
        this.numOfCycles = 0;
    }

    public Ride(String rideID, String rideName, int capacity, Employee operator) {
        this(rideID, rideName, capacity, operator, 1);
    }

    public Ride(String rideID, String rideName, int capacity, Employee operator, int maxRider) {
        this.rideID = rideID;
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();  // 改为 LinkedList
        this.maxRider = maxRider;
        this.numOfCycles = 0;
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

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.offer(visitor);
        System.out.println("Added to queue: " + visitor.getName());
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removed = queue.poll();
        if (removed != null) {
            System.out.println("Removed from queue: " + removed.getName());
        } else {
            System.out.println("Queue is empty. No visitors to remove.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in queue:");
        for (Visitor visitor : queue) {
            System.out.println("Name: " + visitor.getName());
            System.out.println("Age: " + visitor.getAge());
            System.out.println("Gender: " + visitor.getGender());
            System.out.println("Visitor ID: " + visitor.getVisitorID());
            System.out.println("Visit Count: " + visitor.getVisitCount());
            System.out.println("Last Visit Date: " + visitor.getLastVisitDate());
            System.out.println("-----");
        }
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No ride operator assigned. Cannot run the ride.");
            return;
        }
        if (queue.isEmpty()) {
            System.out.println("No visitors in queue. Cannot run the ride.");
            return;
        }

        int riders = 0;
        while (!queue.isEmpty() && riders < maxRider) {
            Visitor visitor = queue.poll();
            addVisitorToHistory(visitor);
            riders++;
            System.out.println("Visitor " + visitor.getName() + " took the ride.");
        }

        numOfCycles++;
        System.out.println("Ride cycle complete. Total cycles run: " + numOfCycles);
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("Added to ride history: " + visitor.getName());
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        Iterator<Visitor> iterator = rideHistory.iterator();
        System.out.println("Ride History:");
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println("Name: " + visitor.getName());
            System.out.println("Age: " + visitor.getAge());
            System.out.println("Gender: " + visitor.getGender());
            System.out.println("Visitor ID: " + visitor.getVisitorID());
            System.out.println("Visit Count: " + visitor.getVisitCount());
            System.out.println("Last Visit Date: " + visitor.getLastVisitDate());
            System.out.println("-----");
        }
    }

    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted.");
    }

    public void exportRideHistory(String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)))
        {
            for (Visitor visitor : rideHistory)
            {
                writer.write(visitor.getName() + "," + visitor.getAge() + ","
                        + visitor.getGender() + "," + visitor.getVisitorID() + ","
                        + visitor.getVisitCount() + "," + visitor.getLastVisitDate());
                writer.newLine();
            }
            System.out.println("Ride history has been successfully exported to " + fileName);
        }
        catch (IOException e)
        {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void importRideHistory(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] visitorData = line.split(",");
                if (visitorData.length == 6)
                {
                    String name = visitorData[0];
                    int age = Integer.parseInt(visitorData[1]);
                    String gender = visitorData[2];
                    String visitorID = visitorData[3];
                    int visitCount = Integer.parseInt(visitorData[4]);
                    String lastVisitDate = visitorData[5];

                    Visitor visitor = new Visitor(name, age, gender, visitorID, visitCount, lastVisitDate);
                    rideHistory.add(visitor);
                }
            }
            System.out.println("Ride history has been successfully imported from " + fileName);
        }
        catch (IOException e)
        {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
