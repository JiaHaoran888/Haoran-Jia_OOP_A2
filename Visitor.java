public class Visitor extends Person {
    private String visitorID;
    private int visitCount;
    private String lastVisitDate;

    public Visitor() {}

    public Visitor(String name, int age, String gender,
                   String visitorID, int visitCount, String lastVisitDate) {
        super(name, age, gender);
        this.visitorID = visitorID;
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
    }

    public String getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public String getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(String lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }
}
