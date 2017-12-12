
public class Item {
	//attributes
	private double unitPrice;
	private int quantity;
	private String name;
	
	//methods
	//Constructor
	public Item (double up, int q, String n) {
		//change this to setUnitPrice   setUnitPrice(up);
		//unitPrice = up;
		setUnitPrice(up);
		//change to setQuantity
		setQuantity(q);
		
		name = n;
	}
	
	public void setUnitPrice(double up) {
		if (up >= 0) {
			unitPrice = up;
		} else {
			System.out.println("Price cannot be negative, default to $1");
			unitPrice = 1;
		}
	}
	
	public void setQuantity(int q) {
		if (q >= 0) {
			quantity = q;
		} else {
			System.out.println("Quantity cannot be negative, default to 0");
			quantity = 0;
		}
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + "\nUnit Price: $" + unitPrice + "\nQuantity: " + quantity;
	}

}
