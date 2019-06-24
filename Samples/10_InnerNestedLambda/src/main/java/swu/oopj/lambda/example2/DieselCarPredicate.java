package swu.oopj.lambda.example2;

import java.util.function.Predicate;

import swu.oopj.lambda.Car;
import swu.oopj.lambda.CarType;

public class DieselCarPredicate implements Predicate<Car> {
	@Override
	public boolean test(Car car) {
		return car.getType() == CarType.DIESEL;
	}

}
