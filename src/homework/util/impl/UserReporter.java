package src.homework.util.impl;

import src.homework.User;
import src.homework.util.Reportable;

public class UserReporter implements Reportable<User> {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}