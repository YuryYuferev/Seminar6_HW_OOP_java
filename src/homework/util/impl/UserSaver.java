package src.homework.util.impl;

import src.homework.User;

public class UserSaver {
    public static void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}