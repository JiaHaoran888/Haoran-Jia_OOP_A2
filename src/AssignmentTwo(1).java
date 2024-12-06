public class AssignmentTwo {
    public static void main(String[] args) {
        new AssignmentTwo().partThree();

        new AssignmentTwo().partFourA();

        new AssignmentTwo().partFourB();

        new AssignmentTwo().partFive();

        new AssignmentTwo().partSix();

        new AssignmentTwo().partSeven();
    }

    public void partThree()
    {
        Employee operator = new Employee("Li", 35, "Male", "EMP001", 60000, 10);
        Ride ride = new Ride("R001", "Roller Coaster", 20, operator);

        Visitor visitor1 = new Visitor("Zhang", 24, "Female", "VIS001", 3, "2024-12-02");
        Visitor visitor2 = new Visitor("Zhao", 30, "Male", "VIS002", 5, "2024-12-01");
        Visitor visitor3 = new Visitor("Sun", 22, "Male", "VIS003", 2, "2024-12-03");
        Visitor visitor4 = new Visitor("Qian", 28, "Female", "VIS004", 6, "2024-12-02");
        Visitor visitor5 = new Visitor("Zhou", 21, "Female", "VIS005", 1, "2024-12-04");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.removeVisitorFromQueue();
        ride.printQueue();

    }

    public void partFourA() {

        Employee operator = new Employee("Li", 35, "Male", "EMP001", 60000, 10);
        Ride ride = new Ride("R001", "Roller Coaster", 20, operator);

        Visitor visitor1 = new Visitor("Zhang", 24, "Female", "VIS001", 3, "2024-12-02");
        Visitor visitor2 = new Visitor("Zhao", 30, "Male", "VIS002", 5, "2024-12-01");
        Visitor visitor3 = new Visitor("Sun", 22, "Male", "VIS003", 2, "2024-12-03");
        Visitor visitor4 = new Visitor("Qian", 28, "Female", "VIS004", 6, "2024-12-02");
        Visitor visitor5 = new Visitor("Zhou", 21, "Female", "VIS005", 1, "2024-12-04");


        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);


        System.out.println("Is Zhao in history? " + ride.checkVisitorFromHistory(visitor2));
        System.out.println("Number of visitors in history: " + ride.numberOfVisitors());
        ride.printRideHistory();

    }

    public void partFourB() {

        Employee operator = new Employee("Li", 35, "Male", "EMP001", 60000, 10);
        Ride ride = new Ride("R001", "Roller Coaster", 20, operator);

        Visitor visitor1 = new Visitor("Zhang", 24, "Female", "VIS001", 3, "2024-12-02");
        Visitor visitor2 = new Visitor("Zhao", 30, "Male", "VIS002", 5, "2024-12-01");
        Visitor visitor3 = new Visitor("Sun", 22, "Male", "VIS003", 2, "2024-12-03");
        Visitor visitor4 = new Visitor("Qian", 28, "Female", "VIS004", 6, "2024-12-02");
        Visitor visitor5 = new Visitor("Zhou", 21, "Female", "VIS005", 1, "2024-12-04");


        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);


        System.out.println("Original Ride History:");
        ride.printRideHistory();
        ride.sortRideHistory();
        System.out.println("Sorted Ride History:");
        ride.printRideHistory();

    }

    public void partFive() {
        Employee operator = new Employee("Li", 35, "Male", "EMP001", 60000, 10);
        Ride ride = new Ride("R001", "Roller Coaster", 6, operator,6);

        // Step 2: Add a minimum of 10 Visitors to the Queue
        Visitor visitor1 = new Visitor("Zhang", 24, "Female", "VIS001", 3, "2024-12-02");
        Visitor visitor2 = new Visitor("Zhao", 30, "Male", "VIS002", 5, "2024-12-01");
        Visitor visitor3 = new Visitor("Sun", 22, "Male", "VIS003", 2, "2024-12-03");
        Visitor visitor4 = new Visitor("Qian", 28, "Female", "VIS004", 6, "2024-12-02");
        Visitor visitor5 = new Visitor("Zhou", 21, "Female", "VIS005", 1, "2024-12-04");
        Visitor visitor6 = new Visitor("Wang", 25, "Male", "VIS006", 4, "2024-12-02");
        Visitor visitor7 = new Visitor("Li", 27, "Female", "VIS007", 3, "2024-12-01");
        Visitor visitor8 = new Visitor("Ma", 29, "Male", "VIS008", 7, "2024-12-03");
        Visitor visitor9 = new Visitor("Tian", 23, "Female", "VIS009", 2, "2024-12-04");
        Visitor visitor10 = new Visitor("Chen", 31, "Male", "VIS010", 4, "2024-12-05");


        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        System.out.println("Visitors in the queue before running the cycle:");
        ride.printQueue();

        ride.runOneCycle();

        System.out.println("Visitors in the queue after one cycle:");
        ride.printQueue();

        System.out.println("All visitors in the ride history:");
        ride.printRideHistory();

    }

    public void partSix() {

        Employee operator = new Employee("Li", 35, "Male", "EMP001", 60000, 10);
        Ride ride = new Ride("R001", "Roller Coaster", 20, operator);

        Visitor visitor1 = new Visitor("Zhang", 24, "Female", "VIS001", 3, "2024-12-02");
        Visitor visitor2 = new Visitor("Zhao", 30, "Male", "VIS002", 5, "2024-12-01");
        Visitor visitor3 = new Visitor("Sun", 22, "Male", "VIS003", 2, "2024-12-03");
        Visitor visitor4 = new Visitor("Qian", 28, "Female", "VIS004", 6, "2024-12-02");
        Visitor visitor5 = new Visitor("Zhou", 21, "Female", "VIS005", 1, "2024-12-04");


        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        ride.exportRideHistory("rideHistory.csv");

    }

    public void partSeven() {

        Employee operator = new Employee("Li", 35, "Male", "EMP001", 60000, 10);
        Ride ride = new Ride("R001", "Roller Coaster", 20, operator);

        ride.importRideHistory("rideHistory.csv");
        System.out.println("Number of visitors in the ride history: " + ride.numberOfVisitors());
        ride.printRideHistory();

    }
}
