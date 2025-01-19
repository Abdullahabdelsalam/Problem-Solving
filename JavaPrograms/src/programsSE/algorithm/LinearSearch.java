/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.algorithm;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        
        int position = linearSearch(array, target);

        
        if (position == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at position: " + position);
        }
    }

    
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
}
