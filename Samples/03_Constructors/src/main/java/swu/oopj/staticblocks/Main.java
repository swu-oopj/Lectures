package swu.oopj.staticblocks;
public class Main {
	
	public static void main(String[] args) {		
		Vector v = new Vector(new Point(3,4));
		v.print();
		Vector.alpha1 = new Vector(1,1);
		Vector.alpha2 = new Vector(-1,2);
		v.print();
	}
}
