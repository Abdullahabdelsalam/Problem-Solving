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
public class SwapNumbers {
   
    public static void main(String[] args) {
        
        int numb1,numb2,numb3=0 ;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the numb1:");
        numb1 = in.nextInt();
        
        System.out.println("Enter the numb2:");
        numb2 = in.nextInt();
        
        numb3 = numb1;
        numb1 = numb2;
        numb2 = numb3;
        
        System.out.println("After swap numb1 = " + numb1);
        
        System.out.println("After swap numb2 = " + numb2);
        
        in.close();
        
    }
}
