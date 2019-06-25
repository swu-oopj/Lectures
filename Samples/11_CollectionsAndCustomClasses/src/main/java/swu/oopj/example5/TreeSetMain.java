package swu.oopj.example5;


import java.util.TreeSet;

import swu.oopj.Common;

import java.util.Set;

public class TreeSetMain {
	
	public static void main(String[] args) {
		Set<Student5> students = new TreeSet<>();
		Common.fillStudentsCollection(students, Student5::new);			
		System.out.println("I have following students:");
		Common.printCollection(students);
		
		Student5 s = new Student5("Poe", "Edgar Allan", "2345678901");
		System.out.println("Poe present: " + students.contains(s));	
	}
}
