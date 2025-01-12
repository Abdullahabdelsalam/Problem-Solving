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
public class MultiplyMatrix {

    public static void main(String[] args) {

        int row1, columne1, row2, columne2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rows and Columns the first matrix");
        row1 = in.nextInt();
        columne1 = in.nextInt();
        int first[][] = new int[row1][columne1];
        System.out.println("Enter elements of the first matrix");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < columne1; j++) {
                first[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter Rows and Columns the second matrix");
        row2 = in.nextInt();
        columne2 = in.nextInt();

        if (columne1 != row2) {
            System.out.println("can't be multiplied");
        } else {

            int second[][] = new int[row2][columne2];
            int multiply[][] = new int[row1][columne2];
            System.out.println("Enter elements of the secand matrix");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < columne2; j++) {
                    second[i][j] = in.nextInt();
                }
            }
            int sum = 0;

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < columne2; j++) {
                    for (int k = 0; k < row2; k++) {
                        sum = sum + first[i][k] * second[k][j];
                    }

                    multiply[i][j] = sum;
                    sum = 0;
                }
            }
            
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < columne2; j++) {
                    System.out.print(multiply[i][j] + "\t");
                    
                }
                System.out.println("");
            }
            
        }

    }
}
