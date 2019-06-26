package swu.oopj.example4;

import java.util.HashSet;
import java.util.Set;

import swu.oopj.Common;

public class HashSetMain {
	
	public static void main(String[] args) {
		Set<Student4> students = new HashSet<>();
		Common.fillStudentsCollection(students, Student4::new);			
		System.out.println("I have following students:");
		Common.printCollection(students);
		
		Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");		
		System.out.println("Poe present: " + students.contains(s));
	}
}
