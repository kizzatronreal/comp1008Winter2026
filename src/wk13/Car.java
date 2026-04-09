package wk13;

public class Car extends Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name, String motorType, int numWheels){
        super(motorType, numWheels);
        setName(name);
        setLicenseType("G");
    }
    public boolean canDriveVehicle(){
        return getLicenseType().toLowerCase().contains("g");
    }

    public void moving(String direction){
        System.out.println(getName() + " is moving in " + direction + " direction");
    }
}
