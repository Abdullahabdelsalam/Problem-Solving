/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.partone;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class AddLargeNumber {
    
    public static void main(String[] args) {
        
        String number1 , number2 ;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the large Number1:");
        number1 = in.nextLine();
        
        System.out.print("Enter the large Number2:");
        number2 = in.nextLine();
        
        BigInteger first = new BigInteger(number1);
        BigInteger secand = new BigInteger(number2);
        
        first = first.add(secand);
        
        System.out.println("Result = " + first);
        
        in.close();
    }
}
