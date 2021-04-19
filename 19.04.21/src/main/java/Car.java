import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", body='" + body + '\'' +
                ", trunk=" + trunk +
                '}';
    }
}
