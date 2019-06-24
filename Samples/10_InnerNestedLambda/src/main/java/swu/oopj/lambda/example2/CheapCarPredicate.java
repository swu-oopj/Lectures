package swu.oopj.lambda.example2;
import java.util.function.Predicate;

import swu.oopj.lambda.Car;

public class CheapCarPredicate implements Predicate<Car> {
	@Override
	public boolean test(Car car) {
		return car.getPrice() < 100000;
	}	
}
