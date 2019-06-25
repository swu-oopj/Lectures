package swu.oopj.example7;


import java.util.TreeSet;

import swu.oopj.Common;
import swu.oopj.example4.Student4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		StudentComparator comparator = new StudentComparator();		
		//Comparator<Student4> reverse = new ReverseComparator<>(comparator);
				
		//Comparator<Student4> reverse = comparator.reversed(); //using Java8 default method in Comparator interface:
		
		Comparator<Student4> reverse = Collections.reverseOrder(comparator); //using static method from Collections class
		
		Set<Student4> students = new TreeSet<>(reverse);
		
		Common.fillStudentsCollection(students, Student4::new);			
		System.out.println("I have following students:");
		Common.printCollection(students);		
	}
	
	
}
