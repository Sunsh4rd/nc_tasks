package learners;

import java.util.Arrays;

public class Student implements Humanable {

    private int[] marks = new int[100];

    public Student(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public int compareTo(Humanable o) {
       return o.getClass().getSimpleName().equals("Pupil") ? Integer.MAX_VALUE : this.marksSum() - o.marksSum();
    }

    @Override
    public int marksSum() {
        int sum = 0;
        for (int mark : marks) {
            if (mark != 0) {
                sum += mark;
            }
        }
        return sum;
    }
}
