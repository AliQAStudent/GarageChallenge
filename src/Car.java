
public class Car extends Vehicle {
	public String color;
	
	@Override
	 public void fix() {
		 this.bill += 10;
		 showBill();
	 }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
