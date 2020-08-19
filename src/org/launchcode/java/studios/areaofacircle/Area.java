package org.launchcode.java.studios.areaofacircle;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        try {
            radius = input.nextDouble();
        } catch(InputMismatchException error) {
            System.out.println("Please enter a number.");
            return;
        }
        while(radius < 0) {
            System.out.println("What is the radius of your circle?");
            radius = input.nextDouble();
        }

        double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of the circle is " + areaOfCircle);
        input.close();
    }
}
