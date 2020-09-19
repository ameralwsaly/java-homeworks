package gpa_calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Subject #1 Points: ");
        double points1 = input.nextDouble();
        System.out.println("Subject #1 Hours: ");
        double hours1 = input.nextDouble();
        double mark1 = getPointByGrade(points1) * hours1;
        

        System.out.println("Subject #2 Points: ");
        double points2 = input.nextDouble();
        System.out.println("Subject #2 Hours: ");
        double hours2 = input.nextDouble();
        double mark2 = getPointByGrade(points2) * hours2;


        System.out.println("Subject #3 Points: ");
        double points3 = input.nextDouble();
        System.out.println("Subject #3 Hours: ");
        double hours3 = input.nextDouble();
        double mark3 = getPointByGrade(points3) * hours3;


        System.out.println("Subject #4 Points: ");
        double points4 = input.nextDouble();
        System.out.println("Subject #4 Hours: ");
        double hours4 = input.nextDouble();
        double mark4 = getPointByGrade(points4) * hours4;

        System.out.println("Subject #5 Points: ");
        double points5 = input.nextDouble();
        System.out.println("Subject #5 Hours: ");
        double hours5 = input.nextDouble();
        double mark5 = getPointByGrade(points5) * hours5;

        double totalHours = hours1 + hours2 + hours3 + hours4 + hours5;
        double totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;

        double gpa = totalMarks / totalHours;

        System.out.println("GPA: " + gpa);
    }


    public static double getPointByGrade(double points) {
        if (points >= 100 || points >= 95) return 5;

        if (points >= 94 || points >= 90) return 4.75;

        if (points >= 89 || points >= 85) return 4.5;

        if (points >= 84 || points >= 80) return 4;

        if (points >= 79 || points >= 75) return 3.5;

        if (points >= 74 || points >= 70) return 3;

        if (points >= 69 || points >= 64) return 2.5;

        if (points >= 64 || points >= 60) return 2;

        if (points < 60) return 1;

        return 0;
    }
}
