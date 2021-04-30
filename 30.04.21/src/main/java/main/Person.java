package main;

public class Person {

    private String name;
    private String secondName;
    private String patronymic;

    public Person(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void initMethod() {
        this.patronymic = "Ivanich";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
