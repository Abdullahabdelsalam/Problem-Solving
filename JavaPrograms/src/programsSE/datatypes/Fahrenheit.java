/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.datatypes;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class Fahrenheit {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = in.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
        
        in.close();
    }
    
}
