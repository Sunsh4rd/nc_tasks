package com.company.pcconveyor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PcConveyor {

    private static final String[] parts = { "Tower", "MotherBoard", "HDD", "RAM" };

    public static void run() {

        Random random = new Random();

        ArrayList<Pc> initialPcList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            initialPcList.add(new Pc(random.nextInt(10)));
        }
        System.out.println(initialPcList);

        ArrayDeque<Part> queue = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            queue.addLast(createNewPart(parts[random.nextInt(4)], random.nextInt(10)));
        }
        System.out.println(queue);

        for (Pc pc: initialPcList) {
            for (Part part : queue) {
                if (pc.getId() == part.getId()) {
                    pc.setLastAddedPart(part);
                    queue.poll();
                }
            }
        }

        System.out.println(initialPcList);
        System.out.println(queue);
    }

    public static Part createNewPart(String partName, int id) {
        switch (partName) {
            case "Tower":
                return new Tower(id);
            case "MotherBoard":
                return new MotherBoard(id);
            case "HDD":
                return new Hdd(id);
            default:
                return new Ram(id);
        }
    }
}

interface Part {

    public int getId();
}

class Tower implements Part {

    private int id;

    public Tower(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class MotherBoard implements Part {

    private int id;

    public MotherBoard(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "id=" + id +
                '}';
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Hdd implements Part {

    private int id;

    public Hdd(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "id=" + id +
                '}';
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Ram implements Part {

    private int id;

    public Ram(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "id=" + id +
                '}';
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Pc {

    private int id;
    private Part lastAddedPart;

    public Pc(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Part getLastAddedPart() {
        return lastAddedPart;
    }

    public void setLastAddedPart(Part lastAddedPart) {
        this.lastAddedPart = lastAddedPart;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "id=" + id +
                ", lastAddedPart=" + lastAddedPart +
                '}';
    }
}