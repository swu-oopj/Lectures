package swu.oopj;

public interface StudentFactory <S extends Student> {
	S create(String lastName, String firstName, String studentID);
}