package com.company;

import usersmap.User;
import usersmap.UserRegistry;

public class Main {

    public static void main(String[] args) {
//        String str = "Weed: The User's Guide: A 21st Century Handbook for Enjoying Marijuana is a 2016 book about cannabis by Seattle writer David Schmader. Schmader is also a writer for The Stranger, a Seattle alt weekly newspaper, where he writes a cannabis column as of August 2016. The book is in part a cannabis cookbook, containing an edibles recipe section.";
//        String[] a = str.split(" ");
//        Map<String, Integer>

//        UserInterface ui = new UserInterface();
//        ui.interact(1);
//        ui.interact(1);
//        ui.interact(1);
//        ui.interact(2);
//        ui.interact(1);
//
//        System.out.println(ui);

        User user1 = new User("Ben", "Ye", "Parent", 1993);
        User user2 = new User("Alfred", "Boo", "No", 2003);
        User user3 = new User("Ming", "Che", "Parent", 2000);

        UserRegistry.registry.put(user1.getFirsName()
                                + user1.getSecondName()
                                + user1.getPatronymic(), user1.getBirthYear());
        UserRegistry.registry.put(user2.getFirsName()
                                + user2.getSecondName()
                                + user2.getPatronymic(), user2.getBirthYear());
        UserRegistry.registry.put(user3.getFirsName()
                                + user3.getSecondName()
                                + user3.getPatronymic(), user3.getBirthYear());

        System.out.println(UserRegistry.registry);
    }
}
