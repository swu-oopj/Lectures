package swu.oopj.generics.example2;

public class RawPointMain {

	public static void main(String[] args) {
		Pair iPair = new Pair(5,5);
		Pair sPair = new Pair("X", "Y");
		System.out.println("Before: " + iPair + ", " + sPair);
		iPair = updateRandomlyInt(iPair);
		sPair = updateRandomlyString(sPair);
		// Will compiler catch the error if we uncomment
		// next line?
		updateRandomlyString(iPair);
		System.out.println("After: " + iPair + ", " + sPair);
		
		updateRandomlyString2(iPair);
		System.out.println("After: " + iPair + ", " + sPair);
	}

	private static Pair updateRandomlyInt(Pair pair) {
		int addX = (int) Math.round(Math.random());
    	int addY = (int) Math.round(Math.random());
		Integer x = (Integer)pair.getFirst();
		Integer y = (Integer)pair.getSecond();
		return new Pair(Integer.valueOf(x.intValue()+addX),
				Integer.valueOf(y.intValue()+addY));
	}
	
	 private static Pair updateRandomlyString(Pair pair) {  
    	if (Math.random() > 0.5)
    		return new Pair(pair.getFirst()+ "A", pair.getSecond()+ "B");
    	else 
    		return pair;
	 }
	 
	 private static Pair updateRandomlyString2(Pair pair) {  
    	if (Math.random() > 0.5)
    		return new Pair((String) pair.getFirst()+ "A", (String) pair.getSecond()+ "B");
    	else 
    		return pair;
	 }
	   
}
