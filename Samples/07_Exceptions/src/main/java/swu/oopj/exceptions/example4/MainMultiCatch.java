package swu.oopj.exceptions.example4;

public class MainMultiCatch {

	public static void main(String[] args) {
		String[] arr = new String[]{ "12", "abc", "15"};			
		for(int i=0; i<=arr.length; i++){
			try{
				int num = Integer.parseInt(arr[i]);
				System.out.println(num);
			}
			catch(NumberFormatException | ArrayIndexOutOfBoundsException exc) {
				System.out.format("Caught exception at step %d: %s%n",i, exc.getMessage());						
			}			
		}
		System.out.println("Done");
	}
}
