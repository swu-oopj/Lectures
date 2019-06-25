package swu.oopj.example6;


import java.util.TreeSet;

import swu.oopj.Common;
import swu.oopj.example4.Student4;

import java.util.Set;

public class TreeSetMain {
	
	public static void main(String[] args) {		
		Set<Student4> students = new TreeSet<>(new StudentComparator());
		//or using lambda
//		Set<Student4> students = new TreeSet<>(
//				(s1, s2) -> s1.getStudentID().compareTo(s2.getStudentID())
//		);
		Common.fillStudentsCollection(students, Student4::new);			
		System.out.println("I have following students:");
		Common.printCollection(students);
		
		Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");		
		System.out.println("Poe present: " + students.contains(s));
	}
}
