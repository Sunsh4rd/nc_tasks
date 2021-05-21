package com.company;

import java.util.ArrayList;
import java.util.List;

public class VersionUpdateCenter {

    private List<Phone> phones = new ArrayList<>();

    public void addPhone (Phone phone) {
        this.phones.add(phone);
    }

    public void deletePhone (Phone phone) {
        this.phones.remove(phone);
    }

    public void updatePhones(String version) {
        for (Phone phone: phones) {
            phone.updateVersion(version);
        }
    }

    @Override
    public String toString() {
        return "VersionUpdateCenter{" +
                "phones=" + phones +
                '}';
    }
}
