import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	public int minId = 0;
	public List<Vehicle> vehicles = new ArrayList<Vehicle>();
	public Garage() {
		
	}
	public void addVehicle(Vehicle vehicle) {
		for(Vehicle existingVehicle : vehicles)
			if(vehicle.ID == existingVehicle.ID)
			{
				System.out.println("WARNING: vehicle already exists in garage with ID "+vehicle.ID);
				System.out.println("Setting new id to..."+ ++minId);
				vehicle.ID = minId;
			}
		vehicles.add(vehicle);
	}
	public void removeVehicle(int ID) {
		for(Vehicle vehicle : vehicles) {
			if(ID == vehicle.ID)
				vehicles.remove(vehicle);
		}
	}
	public void removeVehicle(String type) {
		for(Vehicle vehicle : vehicles) {
			if(vehicle.getClass().toString().equals(type))
				vehicles.remove(vehicle);
		}
	}
	public int emptyGarage() {
		int earnings = 0;
		for(Vehicle vehicle : vehicles)
			earnings += vehicle.bill;
		System.out.println("Emptying garage... total earnings: "+earnings);
		int returned = vehicles.size();
		vehicles.clear();
		return returned;
	}
}
