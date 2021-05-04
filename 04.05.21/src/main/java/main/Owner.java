package main;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component
@Lazy
public class Owner {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }
}
