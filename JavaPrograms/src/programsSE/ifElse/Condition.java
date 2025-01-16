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
public class Condition {

    public static void main(String[] args) {

        boolean mark;

        Scanner in = new Scanner(System.in);

        System.out.println("Did you learn programming ?(Answer true or false)? ");
        mark = in.nextBoolean();

        if (mark) {
            System.out.println("Excellent");
        } else {
            System.out.println("Why so?");
        }
    }
}
