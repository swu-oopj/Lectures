package swu.oopj.exceptions.example1;

public class Main {

	public static void main(String[] args) {
		String[] arr = new String[]{ "12", "15", "abc"};			
		for(int i=0; i<3; i++){
			int num = Integer.parseInt(arr[i]);
			System.out.println(num);
		}
		System.out.println("Done");
	}
}
