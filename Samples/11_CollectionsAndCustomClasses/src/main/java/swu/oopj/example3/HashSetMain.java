package swu.oopj.example3;


import java.util.HashSet;
import java.util.Set;

import swu.oopj.Common;

public class HashSetMain {
	
	public static void main(String[] args) {
		Set<Student3> students = new HashSet<>();
		Common.fillStudentsCollection(students, Student3::new);			
		System.out.println("I have following students:");
		Common.printCollection(students);
		
		Student3 s = new Student3("Poe", "Edgar Allan", "2345678901");		
		System.out.println("Poe present: " + students.contains(s));
	}
}
