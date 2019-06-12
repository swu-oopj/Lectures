package swu.oopj.boxing_unboxing;

public class BoxingUnboxing {

	public static void main(String[] args) {
		Integer x = Integer.valueOf(10);
		int y = 20;
		Integer z = x  + y;
		// => (auto)unboxing x: x.intValue() + y  => produces int 		
		// => (auto)boxing to z Integer.valueof(x.intValue() + y);
		
		System.out.println("" + x + " + " + y + " = " + z);
		// => uses StringBuilder to append strings and primitive values
	
	}		
}
