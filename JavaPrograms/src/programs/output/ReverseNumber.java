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
public class ReverseNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // 3 2 1
            reversed = reversed * 10 + digit; // 321
            num /= 10;  //123  12  0                 
        }

        System.out.println("Reversed number: " + reversed);
        
        scanner.close();
    }
}
