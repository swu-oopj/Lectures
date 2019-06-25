package swu.oopj.example5;

import swu.oopj.Student;

public class Student5 extends Student implements Comparable<Student5> {	
	
	public Student5(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);	
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student5)) return false;
		Student5 other = (Student5)obj;
		return this.studentID.equals(other.studentID);
	}
	
	@Override
	public int hashCode(){
		return this.studentID.hashCode();
	}
	
    @Override
    public int compareTo(Student5 other) {
      return this.studentID.compareTo(other.studentID);
    }

}