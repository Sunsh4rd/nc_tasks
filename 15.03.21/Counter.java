public class Counter {
	static int countExecutions;
	static String counterPhrase;

	static {
		countExecutions = 0;
		counterPhrase = "Method Executed";
	}
	public static void doSomeStuff() {
		System.out.println(Counter.counterPhrase);
		countExecutions++;
		System.out.println(Counter.countExecutions);
	}
	public Counter(String phrase) {
		this.counterPhrase = phrase;
	}
	public static void main(String[] args) {
		Counter.doSomeStuff();
		Counter c = new Counter("Now another phrase...");
		c.doSomeStuff();
		Counter.doSomeStuff();
	}
}