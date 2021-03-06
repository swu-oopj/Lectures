package swu.oopj.generics.example5;

public class Main {
	public static void main(String[] args) {
		Integer[] a = {1, 2, 3, 4, 5, 6};
		System.out.println(countGreaterThan(a, 2));
		String[] b = {"Boris", "Jack", "Marco", "Alice", "Bob", "Peter"};
		System.out.println(countGreaterThan(b, "Boris"));
	}

	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	        if (e.compareTo(elem) > 0)
	            ++count;
	    return count;
	}

}
