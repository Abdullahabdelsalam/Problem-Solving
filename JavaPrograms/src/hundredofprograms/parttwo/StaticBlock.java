/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.parttwo;

/**
 *
 * @author Abdullah
 */
public class StaticBlock {

    public static void main(String[] args) {
System.out.println("Main method is executed.");
    }

    static {
        System.out.println("Static block is executed before main method.");
    }

//Static Block Application …. We need to open Program in speciif window 



//    public static void main(String[] args) {
//        System.out.println("You are using Windows_NT operating system.");
//    }

//    static {
//        String os = System.getenv("OS");
//        if (os.equals("Windows_NT") != true) {
//            System.exit(1);
//        }
//    }

}
