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
public class PrimeNumbers {

    public static void main(String args[]) {
        int n, status = 1, num = 3;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers you want = ");
        n = in.nextInt();

        if (n > 0) {
            System.out.println(2);
        }

        for (int count = 2; count < n+1;) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
        in.close();
    }

}
