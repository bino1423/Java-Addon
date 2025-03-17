package basic.oops;


public class Human {

	public void head() {
		System.out.println("Head");
		
	}
	public void hand() {
		System.out.println("Hand");
	}
	public void leg() {
		System.out.println("Leg");
	}
	public void body() {
		System.out.println("body");
	}
	
	public static void main(String[] args) {
		Human a = new Human();
		a.head();
		a.leg();
		a.hand();
		a.body();
	}

}
