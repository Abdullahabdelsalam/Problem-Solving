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
public class BreakContinueWhileLoop {

    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Input an integer = ");
            n = in.nextInt();

            if (n != 0) {
                System.out.print("You entered = " + n);
                System.out.println(" =>> to break loop enter (0)");
                continue;
            } else {
                break;
            }
        }
        in.close();
    }
}
