
public class Student {
    private String name;
    private Double roomLocation;
    private Boolean onPremises;

    public Student() {
    }

    public Student(String name, Double roomLocation, Boolean onPremises) {
        this.name = name;
        this.roomLocation = roomLocation;
        this.onPremises = onPremises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(Double roomLocation) {
        this.roomLocation = roomLocation;
    }

    public Boolean getOnPremises() {
        return onPremises;
    }

    public void setOnPremises(Boolean onPremises) {
        this.onPremises = onPremises;
    }
    
    public void exitHall(){
        this.onPremises= false;
    }
    
    public void enterHall(){
        this.onPremises=true;
    }

    @Override
    public String toString() {
        return "Name\t\t"+this.name+"\nRoom location:\t\t"+this.roomLocation+"\non Premises:\t\t"+this.onPremises;
    }
    
}
