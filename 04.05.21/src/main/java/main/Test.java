package main;

import org.springframework.stereotype.Component;

@Component
public class Test {

    private int field;
    private String name;

    public Test(int field, String name) {
        this.field = field;
        this.name = name;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "field=" + field +
                ", name='" + name + '\'' +
                '}';
    }
}
