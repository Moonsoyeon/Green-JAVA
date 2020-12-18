class MethodTest {
	int someMethod() {
		return 0;
	}
	int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		MethodTest m = new MethodTest();
		System.out.println(m.someMethod());
		System.out.println(m.add(3, 5));
	}
}