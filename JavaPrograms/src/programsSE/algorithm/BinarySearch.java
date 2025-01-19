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
public class BinarySearch {

  

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();

            
            int[] array = new int[size];
            System.out.println("Enter the sorted elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            
            System.out.print("Enter the element to search: ");
            int target = scanner.nextInt();

            
            int position = binarySearch(array, target);

            
            if (position == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at position: " + position);
            }
        }

        
        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; 

                if (array[mid] == target) {
                    return mid; 
                }

                if (array[mid] < target) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }

            return -1; 
        }
    }

