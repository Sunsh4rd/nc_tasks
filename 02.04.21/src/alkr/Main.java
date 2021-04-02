package alkr;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Humanable> learners = new ArrayList<>();

        Student student1 = new Student(new int[] {1, 4, 5, 3});
        Student student2 = new Student(new int[] {5, 3});
        Student student3 = new Student(new int[] {2, 2, 2, 2, 2});
        Student student4 = new Student(new int[] {1, 4, 5, 2});

        learners.add(student1);
        learners.add(student2);
        learners.add(student3);
        learners.add(student4);

        Pupil pupil1 = new Pupil(new int[] {2, 5, 4});
        Pupil pupil2 = new Pupil(new int[] {3, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5});
        Pupil pupil3 = new Pupil(new int[] {3, 3, 3, 3});
        Pupil pupil4 = new Pupil(new int[] {2, 5, 2, 5, 2, 5});

        learners.add(pupil1);
        learners.add(pupil2);
        learners.add(pupil3);
        learners.add(pupil4);

        System.out.println(learners);
        learners.sort((Comparable::compareTo));
        System.out.println(learners);
    }
}

interface Humanable extends  Comparable <Humanable> {

    int marksSum();
}

class Student implements Humanable {

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
       return this.marksSum() - o.marksSum();
    }

    @Override
    public int marksSum() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != 0) {
                sum += marks[i];
            }
        }
        return sum;
    }
}

class Pupil implements Humanable {

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
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 5) {
                sum += marks[i];
            }
        }
        return sum;
    }

    @Override
    public int compareTo(Humanable o) {
        return this.marksSum() - o.marksSum();
    }
}