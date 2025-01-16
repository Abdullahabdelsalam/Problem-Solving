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
public class Factorial {

    public static void main(String args[]) {
        int n, c;

        int fact = 1;
        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        if (n < 0) {
            System.out.println("Number should be non-negative.");
        } else {
            for (c = 1; c <= n; c++) {
                fact = fact * c;
            }

            System.out.println("Factorial of " + n + " is = " + fact);
        }

        // BigFactorial
//    BigInteger inc = new BigInteger("1"); 
//    BigInteger fact = new BigInteger("1"); 
//  
//    Scanner in = new Scanner(System.in); 
//  
//    System.out.println("Input an integer"); 
//    n = in.nextInt(); 
//  
//    for (c = 1; c <= n; c++) { 
//      fact = fact.multiply(inc); 
//      inc = inc.add(BigInteger.ONE); 
//    } 
//  
//    System.out.println(n + "! = " + fact); 
//        
//        
//    


        in.close();
    }
}
