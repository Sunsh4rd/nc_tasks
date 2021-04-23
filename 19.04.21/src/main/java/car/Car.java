package car;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

@JsonPropertyOrder(value = {"engine", "body", "wheels", "trunk"})
public class Car {

    private String engine;
    private List<Integer> wheels;
    private String body;
    private boolean trunk;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public List<Integer> getWheels() {
        return wheels;
    }

    public void setWheels(List<Integer> wheels) {
        this.wheels = wheels;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
        this.setTrunk(body.startsWith("1"));
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    @Override
    public String toString() {
        return "car.Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", body='" + body + '\'' +
                ", trunk=" + trunk +
                '}';
    }

    public static void printSomeCars() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Car car1 = new Car();
        car1.setEngine("Powerful engine");
        car1.setWheels(Arrays.asList(1,1,1,1));
        car1.setBody("2a1pij");
        System.out.println(objectMapper.writeValueAsString(car1));
        Car car2 = new Car();
        car2.setEngine("Weak engine");
        car2.setWheels(Arrays.asList(1,1,1,1));
        car2.setBody("1ask2r");
        System.out.println(objectMapper.writeValueAsString(car2));
        //{"engine":"Powerful engine","body":"2a1pij","wheels":[1,1,1,1],"trunk":false}
        //{"engine":"Weak engine","body":"1ask2r","wheels":[1,1,1,1],"trunk":true}
    }
}
