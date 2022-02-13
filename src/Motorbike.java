
public class Motorbike extends Vehicle {
	public String engine;
	
	 @Override
	 public void fix() {
		 this.bill += 5;
		 showBill();
	 }

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
}
