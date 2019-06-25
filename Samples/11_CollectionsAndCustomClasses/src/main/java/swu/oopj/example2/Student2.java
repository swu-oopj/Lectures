package swu.oopj.example2;

import swu.oopj.Student;

public class Student2 extends Student {		
	public Student2(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student2 other = (Student2)obj;
		return this.studentID.equals(other.studentID);
	}
}