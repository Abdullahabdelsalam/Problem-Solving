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
public class Largest {

    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number 1 = ");
        num1 = in.nextInt();

        System.out.print("Enter the Number 2 = ");
        num2 = in.nextInt();

        System.out.print("Enter the Number 3 = ");
        num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("the largest number 1 = " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("the largest number 2 = " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("the largest number 3 = " + num3);

        } else {
            System.out.println("All Numbers are Equal ");
        }
        in.close();
    }

}
