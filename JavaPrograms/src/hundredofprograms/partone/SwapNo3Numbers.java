/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.partone;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class SwapNo3Numbers {
    
    public static void main(String[] args) {
         
        int numb1,numb2;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the numb1:");
        numb1 = in.nextInt();
        
        System.out.println("Enter the numb2:");
        numb2 = in.nextInt();
        
        numb1 = numb1 + numb2;
        numb2 = numb1 - numb2;
        numb1 = numb1 - numb2;
        
        System.out.println("After swap numb1 = " + numb1);
        
        System.out.println("After swap numb2 = " + numb2);
        
        in.close();
         
    }
}
