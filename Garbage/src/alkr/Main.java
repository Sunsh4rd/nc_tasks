package alkr;

public class Main {

    public static void main(String[] args) {
	    String garbage = "garbage";
	    for (int i = 0; i < 1000; i++) {
	        Garbage g = new Garbage(garbage);
	        garbage += "garbage";
            System.out.println(garbage);
        }
    }
}

class Garbage {
    private String name;

    public Garbage(String name) {
        this.name = name;
    }
}
