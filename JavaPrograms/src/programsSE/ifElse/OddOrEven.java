/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.ifElse;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class OddOrEven {

    public static void main(String args[]) {
        int x;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0) {
            System.out.println("You entered an even number.");
        } else {
            System.out.println("You entered an odd number.");
        }
        in.close();
    }
}
