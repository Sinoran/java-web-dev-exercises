package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    //has-a's
    private String name;
    private double credits;
    private ArrayList<Student> roster;

    public Course(String name, double credits) {
        this.name = name;
        this.credits = credits;
        this.roster = new ArrayList<>();

    }

    public void someMethod(Student student) {
        this.roster.add(student);//put the student into the arraList
    }
}
