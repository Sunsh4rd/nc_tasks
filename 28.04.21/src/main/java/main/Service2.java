package main;

public class Service2 {

    private Service1 service1;

    public Service2(Service1 service1) {
        this.service1 = service1;
    }

    public void print() {
        System.out.println(service1.getName());
    }
}
