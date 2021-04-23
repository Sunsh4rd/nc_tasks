import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
//        try(InputStream inputStream = new FileInputStream("test.json")) {
//            Student student = objectMapper.readValue(inputStream, Student.class);
//            System.out.println(student);
//        }

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

    private static void serialization() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student();
        student.setName("Vasya");
        student.setLastName("Pupkin");
        student.setMarks(Arrays.asList(5,5,5,4));
        try(OutputStream outputStream = new FileOutputStream("test.json")) {
            objectMapper.writeValue(outputStream, student);
        }

        //test
    }
}
