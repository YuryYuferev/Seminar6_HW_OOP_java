package src.homework;

import src.homework.util.Reportable;
import src.homework.util.impl.UserReporter;

public class User{
    private final String name;
    private final Reportable<User> reportable;


    public User(String name, Reportable<User> reportable){
            this.name = name;
            this.reportable = reportable;
        }
    public User(String name) {
                this(name, new UserReporter());
            }

                public String getName(){
                    return name;
                }

                public void report(){
                    reportable.report(this);
                }
            }