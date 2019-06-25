package swu.oopj.example4;


import java.util.HashSet;
import java.util.Set;

import swu.oopj.Common;

public class HashSetMain {
	
	public static void main(String[] args) {
		Set<Student4> students = new HashSet<>();
		Student4 s1 = new Student4("Black", "Joe", "1234567890");
		Student4 s2 = new Student4("Poe", "Edgar Allan", "2345678901");
		Student4 s3 = new Student4("Kant", "Immanuel", "3456789012");
		students.add(s1);
		students.add(s2);
		students.add(s3);

		System.out.println("I have following students:");
		Common.printCollection(students);		
		
		Student4 ss = new Student4("Poe", "Edgar Allan", "2345678901");
		System.out.println("Poe present: " + students.contains(s2));
		System.out.println("Poe present: " + students.contains(ss));
	}
}
