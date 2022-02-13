
public class Truck extends Vehicle {
	public String load;
	
	@Override
	 public void fix() {
		 this.bill += 15;
		 showBill();
	 }
}
