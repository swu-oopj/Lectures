package swu.oopj.inheritance_polymorphism;

import java.time.LocalDate;

public class Polymorphism {

	public static void main(String[] args) {
		Item[] items = new Item[3];
		items[0] =  new Beverage("23", "Juice", 10, 2);	
		items[1] = new Food("777", "Home cookies", 2.5, LocalDate.of(2020,5, 11));	
		items[2] = new Item("1256", "T-shirt", 50);
		calculatePrice(items);			
	}

	private static void calculatePrice(Item[] items) {
		double price = 0;
		for(Item item:items){
			System.out.format("%s, price: %.2f, type: %s%n", item, item.getPrice(1), item.getItemType());
			price += item.getPrice(1);
		}
		System.out.println("Total price = " + price);	
	}

}
