/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.datatypes;

/**
 *
 * @author Abdullah
 */
public class Argument {
    
    public static void main(String[] args) {
    //Argument allow you to pass parameters to a Java program, array of String objects
       
//        for (String st:args){
//            System.out.println(st);
//        }
    // Check if arguments were passed
        if (args.length > 0) {
            System.out.println("Command-line arguments passed:");
            // Loop through and print each argument
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments passed.");
        }

    }
    
}
