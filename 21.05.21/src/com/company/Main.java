package com.company;

public class Main {

    public static void main(String[] args) {

        VersionUpdateCenter versionUpdateCenter = new VersionUpdateCenter();

        versionUpdateCenter.addPhone(new Phone("v1.0"));
        versionUpdateCenter.addPhone(new Phone("v1.1"));
        versionUpdateCenter.addPhone(new Phone("v1.5"));

        System.out.println(versionUpdateCenter);

        versionUpdateCenter.updatePhones("v2.0");

        System.out.println(versionUpdateCenter);
    }
}
