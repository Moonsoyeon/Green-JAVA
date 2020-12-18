public class SimpleCasting {
	public static void main(String[] args) {
		double d = 3.14;
		int i = (int) d;
		d = (double) i;
		
		System.out.println(i);
		System.out.println(d);
	}
}