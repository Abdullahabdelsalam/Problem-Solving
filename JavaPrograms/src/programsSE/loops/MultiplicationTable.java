/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.loops;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class MultiplicationTable {

    public static void main(String args[]) {
        int n, c;
        System.out.print("Enter an integer to print it's multiplication table = ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("table of " + n + " is :-");

        for (c = 0; c < 11; c++) {
            System.out.println(n + "*" + c + " = " + (n * c));
        }
        in.close();
    }
}


