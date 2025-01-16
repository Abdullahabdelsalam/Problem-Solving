/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.string;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class SubstringsOfAString {

    public static void main(String args[]) {
        String string, sub;
        int i, c, length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string = in.nextLine();

        length = string.length();
        System.out.println("Substrings of \"" + string + "\" are :-");
        for (c = 0; c < length; c++) {
            for (i = 1; i <= length - c; i++) {
                sub = string.substring(c, c + i);
                System.out.println(sub);
            }
        }
    }
}
