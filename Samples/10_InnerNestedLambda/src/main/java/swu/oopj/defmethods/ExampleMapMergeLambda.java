package swu.oopj.defmethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import swu.oopj.lambda.Car;
import swu.oopj.lambda.CarCatalog;
import swu.oopj.lambda.CarType;

public class ExampleMapMergeLambda {

    
	public static void main(String[] args) {
		Map<CarType, Integer> carTypesCount = new HashMap<>();
		List<Car> cars = CarCatalog.loadCars();

		cars.forEach(car -> carTypesCount.merge(car.getType(), 1, (oldValue, value) -> oldValue + value));
		System.out.println(carTypesCount);
	}

}
