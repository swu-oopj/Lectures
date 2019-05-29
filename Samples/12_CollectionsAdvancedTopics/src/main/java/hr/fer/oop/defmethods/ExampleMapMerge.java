package hr.fer.oop.defmethods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ExampleMapMerge {

    public static Map<String, Integer> createMap() {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("Wang Shu", 3);
        grades.put("Feng Mian", 5);
        grades.put("Yu Yan", 4);

        return grades;
    }

    public static void main(String[] args) {
        Map<String, Integer> grades = createMap();

        // Similar to compute - the second parameter is used for new values if the old one does not exists
        grades.merge("Wang Shu", 1, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer oldValue, Integer value) {
                return oldValue + value;
            }
        });

        grades.merge("Wang Shu", 1, (oldValue, value) -> oldValue + value);

        System.out.println(grades);
    }

}
