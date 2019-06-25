package swu.oopj.example4;

import swu.oopj.Student;

public class Student4 extends Student {		
	public Student4(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student4)) return false;
		Student4 other = (Student4)obj;
		return this.studentID.equals(other.studentID);
	}
	
	@Override
	public int hashCode(){
		return this.studentID.hashCode();
	}
}