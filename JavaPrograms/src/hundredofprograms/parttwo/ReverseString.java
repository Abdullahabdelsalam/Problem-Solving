/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.parttwo;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class ReverseString {

    public static void main(String args[]) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i > -1; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println ("Reverse of entered string is: "+reverse); 
        in.close();
    }

    
} 
