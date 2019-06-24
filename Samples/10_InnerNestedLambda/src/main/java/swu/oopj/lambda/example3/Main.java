package swu.oopj.lambda.example3;

import java.util.List;
import java.util.function.Predicate;

import swu.oopj.lambda.Car;
import swu.oopj.lambda.CarCatalog;
import swu.oopj.lambda.CarType;


public class Main {

	public static void main(String[] args) {
		List<Car> cars = CarCatalog.loadCars();
		printCars(cars, new Predicate<Car>(){
			@Override
			public boolean test(Car car) {
				return car.getPrice() < 100000;
			}
		});
		printCars(cars, new Predicate<Car>(){
			@Override
			public boolean test(Car car) {
				return car.getType() == CarType.DIESEL;
			}
		});
	}
	
	private static void printCars(Iterable<Car> cars, Predicate<Car> predicate) {
		for(Car car : cars){
			if (predicate.test(car)){
				System.out.println(car);
			}
		}		
	}
}