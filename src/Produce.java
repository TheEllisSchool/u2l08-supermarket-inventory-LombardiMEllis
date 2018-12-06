
public class Produce extends Item {
	//attributes
	private String expiration;
	private double weight;
	
	//Constructor
	public Produce(double up, int q, String n, String exp, double w) {
		//calls superclass constructor
		super(up, q, n);
		
		//do all the things this constructor needs to
		setExpiration(exp);
		setWeight(w);
		setUnitPrice();
		
	}
	
	public void setUnitPrice() {
		setUnitPrice(weight * getUnitPrice());
	}
	
	public void setExpiration(String exp) {
		expiration = exp;
	}
	
	public void setWeight(double w) {
		if (w > 0) {
			weight = w;
		} else {
			System.out.println("weight not set");
		}
	}
	
	public String getExpiration() {
		return expiration;
	}
	
	public double getWeight() {
		return weight;
	}
	
}
