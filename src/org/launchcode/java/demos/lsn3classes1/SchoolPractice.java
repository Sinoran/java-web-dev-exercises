package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
            Student Scott = new Student("Scott Sullentrop", 11664488, 1, 2.8);
            Student Athena = new Student("Athena", 123123);

            System.out.println("Scott's gpa: " + Scott.getGpa());
            System.out.println("Athena's gpa: " + Athena.getGpa());
        }
    }

