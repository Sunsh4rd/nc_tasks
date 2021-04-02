package alkr;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pupil> pupils = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student(new int[] {1, 4, 5, 3});
        Student student2 = new Student(new int[] {5, 3});
        Student student3 = new Student(new int[] {2, 2, 2, 2, 2});
        Student student4 = new Student(new int[] {1, 4, 5, 2});

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);
        students.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(students);

        Pupil pupil1 = new Pupil(new int[] {2, 5, 4});
        Pupil pupil2 = new Pupil(new int[] {3, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5});
        Pupil pupil3 = new Pupil(new int[] {3, 3, 3, 3});
        Pupil pupil4 = new Pupil(new int[] {2, 5, 2, 5, 2, 5});

        pupils.add(pupil1);
        pupils.add(pupil2);
        pupils.add(pupil3);
        pupils.add(pupil4);

        System.out.println(pupils);
        pupils.sort(Pupil::compareTo);
        System.out.println(pupils);
    }
}

interface Humanable { }

class Student implements Humanable, Comparable<Student> {

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

    private int marksSum() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != 0) {
                sum += marks[i];
            }
        }
        return sum;
    }

    @Override
    public int compareTo(Student o) {
        return this.marksSum() - o.marksSum();
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }
}

class Pupil implements Humanable, Comparable<Pupil> {

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

    private int marksSum() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 5) {
                sum += marks[i];
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public int compareTo(Pupil o) {
        return this.marksSum() - o.marksSum();
    }
}