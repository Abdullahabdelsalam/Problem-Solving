/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.partone;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class IfElse {

    public static void main(String[] args) {

        int marksObtained, passingMarks;

        passingMarks = 40;

        Scanner input = new Scanner(System.in);

        System.out.print("Input marks scored by you = ");

        marksObtained = input.nextInt();

        if (marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("Unfortunately you failed to pass the exam.");
        }
    }
}
