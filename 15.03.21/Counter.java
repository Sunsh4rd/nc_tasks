public class Counter {
	static int countExecutions;
	public static void doSomeStuff() {
		System.out.println("Method executed.");
		countExecutions++;
		System.out.println(countExecutions);
	}
	public static void main(String[] args) {
		Counter.doSomeStuff();
		Counter.doSomeStuff();
	}
}