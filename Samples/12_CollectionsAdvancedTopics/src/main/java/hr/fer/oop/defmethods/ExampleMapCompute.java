package hr.fer.oop.defmethods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ExampleMapCompute {

    public static Map<String, Integer> createMap() {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("Wang Shu", 3);
        grades.put("Feng Mian", 5);
        grades.put("Yu Yan", 4);

        return grades;
    }

    public static void main(String[] args) {
        Map<String, Integer> grades = createMap();

        Integer newGrade = grades.compute("Wang Shu", new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String key, Integer value) {
                return value == null ? 1 : value + 1;
            }
        });
        System.out.println("Now Wang Shu has grade: " + newGrade);

        Integer newGrade2 = grades.compute("Wang Shu", (key, value) -> value == null ? 1 : value + 1);
        System.out.println("Now Wang Shu has grade: " + newGrade2);
        
        //Remove Wang Shu
        System.out.println("Map has Wang Shu? " + grades.containsKey("Wang Shu"));
        Integer newGrade3 = grades.compute("Wang Shu", (key, value) -> null);
        System.out.println("Map has Wang Shu? " + grades.containsKey("Wang Shu"));
    }
}
