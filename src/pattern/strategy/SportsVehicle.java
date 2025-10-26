package pattern.strategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
