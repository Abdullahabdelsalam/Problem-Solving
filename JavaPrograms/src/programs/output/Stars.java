/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.output;

/**
 *
 * @author Abdullah
 */
public class Stars {

    public static void main(String[] args) {
        int row, numberOfStars;

        for (row = 1; row < 11; row++) {
            for (numberOfStars = 1; numberOfStars < row; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
