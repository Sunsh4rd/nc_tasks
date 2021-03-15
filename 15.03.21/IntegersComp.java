public class IntegersComp {

	public static void main(String[] args) {
		Integer construct = new Integer(5);
		Integer construct1 = new Integer(5);

		Integer autoboxed = 10;
		Integer autoboxed1 = 10;
		System.out.println(construct == construct1);
		System.out.println(autoboxed == autoboxed1);
	}
}