package swu.oopj.defmethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import swu.oopj.lambda.Car;
import swu.oopj.lambda.CarCatalog;
import swu.oopj.lambda.CarType;

public class ExampleMapCompute {


    public static void main(String[] args) {
        Map<CarType, Integer> carTypesCount = new HashMap<>();
        List<Car> cars = CarCatalog.loadCars();
        cars.forEach(new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				Integer newVal = carTypesCount.compute(t.getType(), new BiFunction<CarType, Integer, Integer>() {
		            @Override
		            public Integer apply(CarType key, Integer value) {
		                return value == null ? 1 : value + 1;
		            }
		        });			
		        System.out.printf("%s raises number of %s cars to %d %n", t.getName(), t.getType(), newVal);				
			}
		});
        
        System.out.println();
        
        carTypesCount.forEach(new BiConsumer<CarType, Integer>() {
			@Override
			public void accept(CarType t, Integer u) {
				System.out.println(t + " occured " + u + " times");					
			}
		});
    }
}
