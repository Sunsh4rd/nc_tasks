package learners;

import java.util.ArrayList;

public class LearnerSortRunner {

    public static void run() {

        ArrayList<Humanable> learners = new ArrayList<>();

        Student student1 = new Student(new int[] {1, 4, 5, 3});
        Student student2 = new Student(new int[] {5, 3});
        Student student3 = new Student(new int[] {2, 2, 2, 2, 2});
        Student student4 = new Student(new int[] {1, 4, 5, 2});

        learners.add(student1);
        learners.add(student2);
        learners.add(student3);
        learners.add(student4);

        learners.sort((Comparable::compareTo));

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
