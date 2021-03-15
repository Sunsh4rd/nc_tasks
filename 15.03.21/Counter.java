public class Counter {
	static int countExecutions;
	public void someMethod() {
		System.out.println("Method executed.");
		countExecutions++;
		System.out.println(countExecutions);
	}
	public static void main(String[] args) {
		Counter c = new Counter();
		c.someMethod();
		c.someMethod();
	}
}