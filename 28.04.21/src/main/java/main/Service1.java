package main;

public class Service1 {

    private String name;

    public Service1(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
