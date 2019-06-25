package swu.oopj.example8;

import java.util.Comparator;

import swu.oopj.Student;
import swu.oopj.example5.Student5;

public class Student8 extends Student implements Comparable<Student8> {	
	
	public Student8(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);	
	}		
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student8)) return false;
		Student8 other = (Student8)obj;
		return this.studentID.equals(other.studentID);
	}
	
	@Override
	public int hashCode(){
		return this.studentID.hashCode();
	}

	@Override
	public int compareTo(Student8 o) {
		return this.studentID.compareTo(o.studentID);
	}	
	
	public static final Comparator<Student8> BY_LAST_NAME = (s1,s2) -> s1.lastName.compareTo(s2.lastName);
	//public static final Comparator<Student> BY_FIRST_NAME = (s1,s2) -> s1.firstName.compareTo(s2.firstName);
        public static final Comparator<Student8> BY_FIRST_NAME = Comparator.comparing(Student8::getFirstName);
	public static final Comparator<Student8> BY_STUDENT_ID = (s1,s2) -> s1.studentID.compareTo(s2.studentID);

	    
}