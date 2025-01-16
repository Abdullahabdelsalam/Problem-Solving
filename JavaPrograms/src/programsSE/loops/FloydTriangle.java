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
public class FloydTriangle {

    public static void main(String args[]) {
        int n, num = 1;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows of floyd's triangle you want = ");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
        in.close();
    }

}
