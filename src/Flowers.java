
public class Flowers extends Item {
	private String variety;
	private String color;
	
	//constructor
	public Flowers(double up, int q, String n, String v, String c) {
		super(up, q, n);
		
		setVariety(v);
		setColor(c);
	}
	
	public void setVariety(String v) {
		variety = v;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getVariety() {
		return variety;
	}
	public String getColor() {
		return color;
	}
	

}
