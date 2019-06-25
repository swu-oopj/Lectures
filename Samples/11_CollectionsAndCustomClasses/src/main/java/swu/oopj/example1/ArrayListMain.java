package swu.oopj.example1;

import java.util.ArrayList;
import java.util.List;

import swu.oopj.Common;

public class ArrayListMain {
	
	public static void main(String[] args) {
		List<Student1> students = new ArrayList<>();
		Common.fillStudentsCollection(students, (last, first, id) -> new Student1(last, first, id));			
		System.out.println("I have following students:");
		Common.printCollection(students);
		
		Student1 s = new Student1("Poe", "Edgar Allan", "2345678901");		
		System.out.println("Poe present: " + students.contains(s));
	}
	
	
}
