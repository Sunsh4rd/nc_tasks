package com.company.observer;

public class Phone {

    private String version;

    public Phone(String version) {
        this.version = version;
    }

    public void updateVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "version='" + version + '\'' +
                '}';
    }
}
