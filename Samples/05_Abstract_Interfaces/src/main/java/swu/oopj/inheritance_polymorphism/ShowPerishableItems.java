package swu.oopj.inheritance_polymorphism;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ShowPerishableItems {

	public static void main(String[] args) {		
		Item[] items = new Item[4];
		items[0] =  new Beverage("23", "Juice", 10, 2);	
		items[1] = new Food("777", "Home cookies", 2.5, LocalDate.of(2020,5, 11));			
		items[2] = new Cloth("1256", "T-shirt", 50);
		items[3] = new Milk("888", "Fresh cow milk ", 6.5, 1, MilkType.COW , LocalDate.of(2019, 07, 25));
		printPerishableItems(items);
	}

	private static void printPerishableItems(Item[] items) {				
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");				
		for(Item item:items){
			if (item instanceof Perishable){
				Perishable perishable = (Perishable) item;
				System.out.format("%s, type: %s, use before: %s %n", item, item.getItemType(),
						perishable.getBestBefore().format(formatter));
			}			
		}		
	}

}
