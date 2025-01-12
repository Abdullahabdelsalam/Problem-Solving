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
public class AddTwoMatrix {
    public static void main(String[] args) {
        
        int row, column, c, d; 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns of matrix");
        row = in.nextInt();
        column = in.nextInt();
        
        int first[][] = new int[row][column]; 
        int second[][] = new int[row][column]; 
        int sum[][] = new int[row][column];
        
          System.out.println("Enter the elements of first matrix"); 
  
      for (  c = 0 ; c < row ; c++ ) 
         for ( d = 0 ; d < column ; d++ ) 
            first[c][d] = in.nextInt(); 
  
      System.out.println("Enter the elements of second matrix"); 
  
      for ( c = 0 ; c < row ; c++ ) 
         for ( d = 0 ; d < column ; d++ ) 
            second[c][d] = in.nextInt(); 
  
      for ( c = 0 ; c < row ; c++ ) 
         for ( d = 0 ; d < column ; d++ ) 
             sum[c][d] = first[c][d] + second[c][d]; 
      //replace '+' with '-' to subtract matrices 
  
      System.out.println("Sum of entered matrices:-"); 
  
      for ( c = 0 ; c < row ; c++ ) 
      { 
         for ( d = 0 ; d < column ; d++ ) 
            System.out.print(sum[c][d]+"\t"); 
  
         System.out.println(); 
      }
    }
}
