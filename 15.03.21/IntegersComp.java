public class IntegersComp {

	public static void main(String[] args) {
		Integer construct = new Integer(5);
		int autounboxed = construct;
		int mixed = construct + autounboxed;
		System.out.println(mixed);

		Integer autoboxed = 10;
		if (autoboxed.equals(mixed)) {
			System.out.println("Yeah...");
		}
	}
}