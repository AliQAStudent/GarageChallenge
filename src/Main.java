
public class Main {
	public static void main (String[] args) { 
		Garage garage = new Garage();
		Motorbike bike1 = new Motorbike();
		bike1.engine = "Honda";
		Motorbike bike2 = new Motorbike();
		bike2.engine = "Yamaha";
		Motorbike bike3 = new Motorbike();
		bike3.engine = "Vespa";
		Car car1 = new Car();
		car1.color = "blue";
		Car car2 = new Car();
		car2.color = "gray";
		Car car3 = new Car();
		car3.color="red";
		Truck truck1 = new Truck();
		truck1.load = "100KG";
		Truck truck2 = new Truck();
		truck2.load = "150KG";
		Truck truck3 = new Truck();
		truck3.load = "200KG";
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(car3);
		garage.addVehicle(bike1);
		garage.addVehicle(bike2);
		garage.addVehicle(bike3);
		garage.addVehicle(truck1);
		garage.addVehicle(truck2);
		garage.addVehicle(truck3);
		car1.fix();
		car2.fix();
		car3.fix();
		bike1.fix();
		bike2.fix();
		bike3.fix();
		truck1.fix();
		truck2.fix();
		truck3.fix();
		garage.emptyGarage();
	}
}
