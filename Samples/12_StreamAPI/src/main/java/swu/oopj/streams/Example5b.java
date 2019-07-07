package swu.oopj.streams;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Example5b {

	public static void main(String[] args) {
		List<Student> students = StudentData.load();
		Comparator<Object> comp = Collator.getInstance(Locale.CHINA);

		String lastNames = students
							.stream()
							.filter(s -> s.getPoints() > 30)
							.map(s -> s.getLastName())		
							.sorted(comp)
							.collect(Collectors.joining(", "));
		
		
		System.out.println(lastNames);	
	}
	
}
