package swu.oopj.lambda.example2;

import java.util.List;
import java.util.function.Predicate;

import swu.oopj.lambda.Car;
import swu.oopj.lambda.CarCatalog;

public class Main {

	public static void main(String[] args) {
		List<Car> cars = CarCatalog.loadCars();
		System.out.println("Cheap cars:");
		printCars(cars, new CheapCarPredicate());	
		System.out.println("Diesel cars:");
		printCars(cars, new DieselCarPredicate());
	}
	
	private static void printCars(Iterable<Car> cars, Predicate<Car> predicate) {
		for(Car car : cars){
			if (predicate.test(car)){
				System.out.println(car);
			}
		}		
	}
}
