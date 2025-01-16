/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.arrays;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class TransposeAMatrix {

    public static void main(String[] args) {
        int row1, columne1, row2, columne2;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Rows and Columns the matrix :");
        row1 = in.nextInt();
        columne1 = in.nextInt();
        int matrix1[][] = new int[row1][columne1];
        System.out.println("Enter elements of the matrix : ");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < columne1; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println(" print matrix1");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < columne1; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println("");
        }

        int matrix2[][] = new int[row1][columne1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < columne1; j++) {
                matrix2[i][j] = matrix1[i][j];
            }
        }

        System.out.println("print matrix2");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < columne1; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
