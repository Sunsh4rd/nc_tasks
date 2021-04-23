package student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private String lastName;
    private List<Integer> marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student.Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static Student read() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        try(InputStream inputStream = new FileInputStream("test.json")) {
            Student student = objectMapper.readValue(inputStream, Student.class);
            return student;
        }
    }

    public static void serialization() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student();
        student.setName("Vasya");
        student.setLastName("Pupkin");
        student.setMarks(Arrays.asList(5,5,5,4));
        try(OutputStream outputStream = new FileOutputStream("test.json")) {
            objectMapper.writeValue(outputStream, student);
        }
    }
}
