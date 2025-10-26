package pattern.strategy;

public class MainClass {
    public static void main(){
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        Vehicle normalVehicle = new NormalVehicle();
        normalVehicle.drive();
    }
}
