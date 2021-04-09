package com.company.pcconveyor;

import java.util.ArrayDeque;
import java.util.Random;

public class PcConveyor {

    private static final String[] parts = { "Tower", "MotherBoard", "HDD", "RAM" };

    public static void run() {

        ArrayDeque<Part> queue = new ArrayDeque<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            queue.addLast(createNewPart(parts[random.nextInt(4)], random.nextInt(1000)));
        }
        System.out.println(queue);
    }

    public static Part createNewPart(String partName, int id) {
        if (partName.equals("Tower")) {
            return new Tower(id);
        } else if (partName.equals("MotherBoard")) {
            return new MotherBoard(id);
        } else if (partName.equals("HDD")) {
            return new Hdd(id);
        } else {
            return new Ram(id);
        }
    }
}

interface Part { }

class Tower implements Part {
    int id;

    public Tower(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "id=" + id +
                '}';
    }
}

class MotherBoard implements Part {
    int id;

    public MotherBoard(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "id=" + id +
                '}';
    }
}

class Hdd implements Part {
    int id;

    public Hdd(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "id=" + id +
                '}';
    }
}

class Ram implements Part {
    int id;

    public Ram(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "id=" + id +
                '}';
    }
}