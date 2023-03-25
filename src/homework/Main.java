package src.homework;

import src.homework.util.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        User user2 = new User("John");
        user.report();
        user2.report();
        UserSaver.save(user);
        UserSaver.save(user2);
    }
}