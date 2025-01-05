/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.partone;

/**
 *
 * @author Abdullah
 */
public class AllAlphabet {

    public static void main(String args[]) {
        char ch;
        System.out.println("The Capital Letters ");
        for (ch = 'A'; ch < 'Z' + 1; ch++) {
            System.out.print(ch);
            if (ch == 'Z') {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("The Small Letters ");
        for (ch = 'a'; ch < 'z' + 1; ch++) {
            System.out.print(ch);
            if (ch == 'z') {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

}
