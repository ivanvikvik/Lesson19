package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.StudentManager;
import by.itstep.vikvik.view.Printer;

import java.util.Scanner;

class Student {

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input count of students: ");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        System.out.print("Input student's marks: ");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        double avg = StudentManager.calcAvgStudentMark(marks);

        String msg = String.format("Student's average mark is %.2f", avg);

        Printer.print(msg);
    }
}
