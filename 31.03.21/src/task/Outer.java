package task;

public class Outer {

    private Inner innerInsctance;

    public Outer(String name) {
        this.innerInsctance = new Inner(name);
        this.innerInsctance.getInstanceName();
        Nested.print();
    }

    public class Inner {

        private String instanceName;

        public Inner(String name) {
            this.instanceName = name;
        }

        public String getInstanceName() {
            return instanceName;
        }
    }

    public static class Nested {

        public Nested() {
            System.out.println("Nested class");
        }

        public static void print() {
            System.out.println("Object is created");
        }
    }
}
