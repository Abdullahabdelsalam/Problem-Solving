/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.datatypes;

/**
 *
 * @author Abdullah
 */
public class PrintInteger {
    
    //variable instance
    public int numr = 7;
    
    //varbiale static
    static int numr1 = 0;

    
    public static void main(String[] args) {
        
        PrintInteger pInt = new PrintInteger();
        
        //varbiale local
        int numr3 = 5;
        
        System.out.println("The Number :" + pInt.numr + numr1 + numr3);
    }
    
}
