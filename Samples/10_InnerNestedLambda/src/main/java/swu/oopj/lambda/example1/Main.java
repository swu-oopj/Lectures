package swu.oopj.lambda.example1;

import java.util.List;

import swu.oopj.lambda.Car;
import swu.oopj.lambda.CarCatalog;
import swu.oopj.lambda.CarType;

public class Main {

	public static void main(String[] args) {
		List<Car> cars = CarCatalog.loadCars();
		printDieselCars(cars);		
	}
	
	private static void printDieselCars(Iterable<Car> cars) {
		for(Car car : cars){
			if (car.getType() == CarType.DIESEL){
				System.out.println(car);
			}
		}		
	}
}
