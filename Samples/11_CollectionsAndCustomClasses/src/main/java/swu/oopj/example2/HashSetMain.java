package swu.oopj.example2;


import java.util.HashSet;
import java.util.Set;

import swu.oopj.Common;

public class HashSetMain {
	
	public static void main(String[] args) {
		Set<Student2> students = new HashSet<>();		
		Common.fillStudentsCollection(students, Student2::new);			
		System.out.println("I have following students:");
		Common.printCollection(students);	
		
		Student2 s = new Student2("Poe", "Edgar Allan", "2345678901");		
		System.out.println("Poe present: " + students.contains(s));
	}
}
