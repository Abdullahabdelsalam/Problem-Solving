/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.output;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class NestedIfElse {

    public static void main(String[] args) {
        int marksObtained, passingMarks;
        char grade;

        passingMarks = 40;

        Scanner in = new Scanner(System.in);

        System.out.println("Input marks scored by you = ");

        marksObtained = in.nextInt();

        if (marksObtained >= passingMarks) {

            if (marksObtained > 90) {
                grade = 'A';
            } else if (marksObtained > 75) {
                grade = 'B';
            } else if (marksObtained > 60) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            System.out.println("You passed the exam and your grade is " + grade);
        } else {
            grade = 'F';
            System.out.println("You failed and your grade is " + grade);
        }
        in.close();
    }

}
