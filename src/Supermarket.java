import javax.swing.JOptionPane;

public class Supermarket {

	public static void main(String[] args) {
		//create an instance of a class
		Item paperPlates = new Item (2.99, 20, "Paper Plates");
		//System.out.println(paperPlates);
		
		Produce apples = new Produce(0.99, 50, "Apples", "Dec 15", 0.5);
		
		//create a can of soup
		Item soupCan = new Item(3.00, 50, "Tomato Soup");
		
		//make a flower arrangement
		Flowers bouquet = new Flowers(7.99, 7, "Rose Bouquet", "Roses", "white");
		
		//bananas
		Produce bananas = new Produce(.44, 75, "Bananas", "Dec 20", 0.1);
				
		double totalCost = 0;
				
		//ring up the total order for a customer
		String input = JOptionPane.showInputDialog(null, 
				"We have paper plates, apples, soup, bouquet, and bananas." +
				"\nWhich would you like?");
		String input2 = JOptionPane.showInputDialog(null, "How many would you like?");
		int amount = Integer.parseInt(input2);
		
		if (input.equals("paper plates")) {
			int newQuantity = paperPlates.getQuantity() - amount;
			paperPlates.setQuantity(newQuantity);
			
			totalCost = totalCost + amount * paperPlates.getUnitPrice();
		}
		
		System.out.println("Total purchase: $" + totalCost);
		System.out.println("new paper plate values: " + paperPlates);


	}

}
