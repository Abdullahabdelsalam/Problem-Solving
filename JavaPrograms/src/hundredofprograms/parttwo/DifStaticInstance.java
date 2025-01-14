/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.parttwo;

/**
 *
 * @author Abdullah
 */
public class DifStaticInstance {

    public static void main(String[] args) {
        display();  //calling without object 
        DifStaticInstance t = new DifStaticInstance();
        t.show();  //calling using object 
    }

    static void display() {
        System.out.println("Programming is amazing.");
    }

    void show() {
        System.out.println("Java is awesome.");
    }

}
