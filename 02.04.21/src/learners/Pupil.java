package learners;

import java.util.Arrays;

public class Pupil implements Humanable {

    private int[] marks = new int[100];

    public Pupil(int[] marks) {
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
        return "Pupil{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public int marksSum() {
        int sum = 0;
        for (int mark : marks) {
            if (mark == 5) {
                sum += mark;
            }
        }
        return sum;
    }

    @Override
    public int compareTo(Humanable o) {
        return o.getClass().getSimpleName().equals("Student") ? Integer.MIN_VALUE : this.marksSum() - o.marksSum();
    }
}
